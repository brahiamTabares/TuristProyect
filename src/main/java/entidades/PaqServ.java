package entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "PAQ_SERV")
public class PaqServ {
    @Id
    @Size(max = 10)
    @Column(name = "COD_PSERV", nullable = false, length = 10)
    private String codPserv;

    @Column(name = "CANTIDAD")
    private Long cantidad;

    @Column(name = "PRECIOUNITARIO")
    private Double preciounitario;

    @Column(name = "DESCUENTO")
    private Double descuento;

    @Column(name = "SUBTOTAL")
    private Double subtotal;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FACTURA_C_COD_FAC", nullable = false)
    private FacturaC facturaCCodFac;

    public String getCodPserv() {
        return codPserv;
    }

    public void setCodPserv(String codPserv) {
        this.codPserv = codPserv;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPreciounitario() {
        return preciounitario;
    }

    public void setPreciounitario(Double preciounitario) {
        this.preciounitario = preciounitario;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public FacturaC getFacturaCCodFac() {
        return facturaCCodFac;
    }

    public void setFacturaCCodFac(FacturaC facturaCCodFac) {
        this.facturaCCodFac = facturaCCodFac;
    }

}