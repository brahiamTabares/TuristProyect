package entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "SERVICIO")
public class Servicio {
    @Id
    @Size(max = 10)
    @Column(name = "COD_SERV", nullable = false, length = 10)
    private String codServ;

    @Size(max = 250)
    @Column(name = "DESCRIPCION", length = 250)
    private String descripcion;

    @Column(name = "COSTO")
    private Double costo;

    @Column(name = "ESTADO")
    private Boolean estado;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FACTURA_C_COD_FAC", nullable = false)
    private FacturaC facturaCCodFac;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RVA_PAQ_TUR_COD_RPT", nullable = false)
    private RvaPaqTur rvaPaqTurCodRpt;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ADMINISTRADOR_COD_ADM", nullable = false)
    private Administrador administradorCodAdm;

    public String getCodServ() {
        return codServ;
    }

    public void setCodServ(String codServ) {
        this.codServ = codServ;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public FacturaC getFacturaCCodFac() {
        return facturaCCodFac;
    }

    public void setFacturaCCodFac(FacturaC facturaCCodFac) {
        this.facturaCCodFac = facturaCCodFac;
    }

    public RvaPaqTur getRvaPaqTurCodRpt() {
        return rvaPaqTurCodRpt;
    }

    public void setRvaPaqTurCodRpt(RvaPaqTur rvaPaqTurCodRpt) {
        this.rvaPaqTurCodRpt = rvaPaqTurCodRpt;
    }

    public Administrador getAdministradorCodAdm() {
        return administradorCodAdm;
    }

    public void setAdministradorCodAdm(Administrador administradorCodAdm) {
        this.administradorCodAdm = administradorCodAdm;
    }

}