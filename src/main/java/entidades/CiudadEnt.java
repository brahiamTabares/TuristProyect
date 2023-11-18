package entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "CIUDAD_ENT")
public class CiudadEnt {
    @Id
    @Size(max = 10)
    @Column(name = "CODIGO", nullable = false, length = 10)
    private String codigo;

    @Size(max = 50)
    @NotNull
    @Column(name = "NOMBRE", nullable = false, length = 50)
    private String nombre;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "DEPARTAMENTO_COD_DEP", referencedColumnName = "COD_DEP")
    private Departamento departamento;

}