package entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "COMPRA_ARTICULO")
public class CompraArticulo {
    @Id
    @Size(max = 20)
    @Column(name = "CODIGOCART", nullable = false, length = 20)
    private String codigocart;

    @NotNull
    @Column(name = "PRECIOUNIDAD", nullable = false)
    private Double preciounidad;

    @NotNull
    @Column(name = "NUMUNIDADES", nullable = false)
    private Long numunidades;

    @NotNull
    @Column(name = "SUBTOTAL", nullable = false)
    private Double subtotal;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ARTICULO_CODIGO", nullable = false)
    private Articulo articuloCodigo;

}