package entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "HOTEL")
public class Hotel {
    @Id
    @Size(max = 10)
    @Column(name = "COD_HOTEL", nullable = false, length = 10)
    private String codHotel;

    @Size(max = 100)
    @NotNull
    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;

    @Size(max = 50)
    @NotNull
    @Column(name = "CORREO", nullable = false, length = 50)
    private String correo;

    @Size(max = 10)
    @NotNull
    @Column(name = "TELEFONO", nullable = false, length = 10)
    private String telefono;

    @Size(max = 50)
    @NotNull
    @Column(name = "DIRECCION", nullable = false, length = 50)
    private String direccion;

    @Size(max = 100)
    @NotNull
    @Column(name = "URLIMAGEN", nullable = false, length = 100)
    private String urlimagen;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CIUDAD_ENT_CODIGO", nullable = false)
    private CiudadEnt ciudadEntCodigo;
}