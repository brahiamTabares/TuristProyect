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
@Table(name = "COMPRA_ARTICULO")
public class CompraArticulo implements Serializable {
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
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "FACTURA_C_CODIGO_FAC", referencedColumnName = "COD_FAC")
    private FacturaC facturaCodigo;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "ARTICULO_CODIGO", nullable = false)
    private Articulo articuloCodigo;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "ESTADOCART_CODIGO", referencedColumnName = "CODIGO")
    private Estadocart estadocartCodigo;

}