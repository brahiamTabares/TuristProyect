package entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity
@Table(name = "FACTURA_C")
public class FacturaC {
    @Id
    @Size(max = 20)
    @Column(name = "COD_FAC", nullable = false, length = 20)
    private String codFac;

    @NotNull
    @Column(name = "FECHA_EXPEDICION", nullable = false)
    private LocalDate fechaExpedicion;

    @NotNull
    @Column(name = "FECHA_VENCIMIENTO", nullable = false)
    private LocalDate fechaVencimiento;

    @Size(max = 50)
    @Column(name = "DETALLECOMPRA", length = 50)
    private String detallecompra;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CLIENTE_CEDULA", nullable = false)
    private Cliente clienteCedula;

    @Column(name = "TOTAL")
    private Double total;

    @Column(name = "ESTADO")
    private Boolean estado;

    public String getCodFac() {
        return codFac;
    }

    public void setCodFac(String codFac) {
        this.codFac = codFac;
    }

    public LocalDate getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(LocalDate fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getDetallecompra() {
        return detallecompra;
    }

    public void setDetallecompra(String detallecompra) {
        this.detallecompra = detallecompra;
    }

    public Cliente getClienteCedula() {
        return clienteCedula;
    }

    public void setClienteCedula(Cliente clienteCedula) {
        this.clienteCedula = clienteCedula;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

}