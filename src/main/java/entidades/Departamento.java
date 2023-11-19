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
@Table(name = "DEPARTAMENTO")
public class Departamento implements Serializable {
    @Id
    @Size(max = 10)
    @Column(name = "COD_DEP", nullable = false, length = 10)
    private String codDep;

    @Size(max = 50)
    @NotNull
    @Column(name = "NOMBRE", nullable = false, length = 50)
    private String nombre;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "PAIS_CODIGO", referencedColumnName = "CODIGO")
    private Pais pais;


}