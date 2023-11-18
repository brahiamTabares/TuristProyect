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
@Table(name = "ARTICULO")
public class Articulo implements Serializable {
    @Id
    @Size(max = 10)
    @Column(name = "CODIGO", nullable = false, length = 10)
    private String codigo;

    @Size(max = 50)
    @NotNull
    @Column(name = "NOMBRE", nullable = false, length = 50)
    private String nombre;

    @Size(max = 250)
    @NotNull
    @Column(name = "DESCRIPCION", nullable = false, length = 250)
    private String descripcion;

    @NotNull
    @Column(name = "PRECIO", nullable = false)
    private Double precio;

    @NotNull
    @Column(name = "UNIDADESSTOCK", nullable = false)
    private Long unidadesstock;
    @NotNull
    @ManyToOne()
    @JoinColumn(name = "ESTADO_ART_CODIGO", referencedColumnName = "CODIGO")
    private EstadoArt estadoArt;

}