package entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@Entity
@Table(name = "CLIENTE")
public class Cliente {
    @Id
    @Size(max = 10)
    @Column(name = "CEDULA", nullable = false, length = 10)
    private String cedula;

    @Size(max = 50)
    @NotNull
    @Column(name = "CORREO", nullable = false, length = 50)
    private String correo;

    @Size(max = 50)
    @NotNull
    @Column(name = "NOMBRE", nullable = false, length = 50)
    private String nombre;

    @Size(max = 50)
    @NotNull
    @Column(name = "APELLIDO", nullable = false, length = 50)
    private String apellido;

    @NotNull
    @Column(name = "FECHA_NACIMIENTO", nullable = false)
    private LocalDate fechaNacimiento;

    @Size(max = 50)
    @NotNull
    @Column(name = "DIRECCION", nullable = false, length = 50)
    private String direccion;

    @Size(max = 10)
    @NotNull
    @Column(name = "TELEFONO", nullable = false, length = 10)
    private String telefono;

    @Size(max = 20)
    @NotNull
    @Column(name = "PASSWORD", nullable = false, length = 20)
    private String password;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CIUDAD_ENT_CODIGO", nullable = false)
    private CiudadEnt ciudadEntCodigo;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "ESTADOCLIENTE_CODESTADOC", referencedColumnName = "CODESTADOC")
    private Estadocliente estadoCliente;

}