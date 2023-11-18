package entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
@Entity
@Table(name = "ADMINISTRADOR")
public class Administrador implements Serializable {
    @Id
    @Size(max = 10)
    @Column(name = "COD_ADM", nullable = false, length = 10)
    private String codAdm;

    @Size(max = 50)
    @Column(name = "NOMBRE_A", length = 50)
    private String nombreA;

    @Size(max = 20)
    @Column(name = "PASSWORD_A", length = 20)
    private String passwordA;

    @Size(max = 10)
    @Column(name = "TELEFONO", length = 10)
    private String telefono;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "ESTADO_A_CODIGO", referencedColumnName = "CODIGO")
    private EstadoA estado;

}