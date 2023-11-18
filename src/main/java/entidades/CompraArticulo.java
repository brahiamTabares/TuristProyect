package entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

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

    public String getCodigocart() {
        return codigocart;
    }

    public void setCodigocart(String codigocart) {
        this.codigocart = codigocart;
    }

    public Double getPreciounidad() {
        return preciounidad;
    }

    public void setPreciounidad(Double preciounidad) {
        this.preciounidad = preciounidad;
    }

    public Long getNumunidades() {
        return numunidades;
    }

    public void setNumunidades(Long numunidades) {
        this.numunidades = numunidades;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Articulo getArticuloCodigo() {
        return articuloCodigo;
    }

    public void setArticuloCodigo(Articulo articuloCodigo) {
        this.articuloCodigo = articuloCodigo;
    }

}