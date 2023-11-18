package entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity
@Table(name = "RVA_AUTO")
public class RvaAuto {
    @Id
    @Size(max = 20)
    @Column(name = "CODIGO_RVA_AUTO", nullable = false, length = 20)
    private String codigoRvaAuto;

    @NotNull
    @Column(name = "SUBTOTAL", nullable = false)
    private Double subtotal;

    @NotNull
    @Column(name = "FECHARECOGIDA", nullable = false)
    private LocalDate fecharecogida;

    @NotNull
    @Column(name = "FECHAENTREGA", nullable = false)
    private LocalDate fechaentrega;

    @NotNull
    @Column(name = "PRECIORENTADIA", nullable = false)
    private Double preciorentadia;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ESTADORESERVAAUTO_CODIGO", nullable = false)
    private EstadoRvaAuto estadoreservaautoCodigo;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "AUTO_CODIGO_AUTO", nullable = false)
    private Auto autoCodigoAuto;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CIUDAD_ENT_CODIGO", nullable = false)
    private CiudadEnt ciudadEntCodigo;

    public String getCodigoRvaAuto() {
        return codigoRvaAuto;
    }

    public void setCodigoRvaAuto(String codigoRvaAuto) {
        this.codigoRvaAuto = codigoRvaAuto;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public LocalDate getFecharecogida() {
        return fecharecogida;
    }

    public void setFecharecogida(LocalDate fecharecogida) {
        this.fecharecogida = fecharecogida;
    }

    public LocalDate getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(LocalDate fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    public Double getPreciorentadia() {
        return preciorentadia;
    }

    public void setPreciorentadia(Double preciorentadia) {
        this.preciorentadia = preciorentadia;
    }

    public EstadoRvaAuto getEstadoreservaautoCodigo() {
        return estadoreservaautoCodigo;
    }

    public void setEstadoreservaautoCodigo(EstadoRvaAuto estadoreservaautoCodigo) {
        this.estadoreservaautoCodigo = estadoreservaautoCodigo;
    }

    public Auto getAutoCodigoAuto() {
        return autoCodigoAuto;
    }

    public void setAutoCodigoAuto(Auto autoCodigoAuto) {
        this.autoCodigoAuto = autoCodigoAuto;
    }

    public CiudadEnt getCiudadEntCodigo() {
        return ciudadEntCodigo;
    }

    public void setCiudadEntCodigo(CiudadEnt ciudadEntCodigo) {
        this.ciudadEntCodigo = ciudadEntCodigo;
    }

}