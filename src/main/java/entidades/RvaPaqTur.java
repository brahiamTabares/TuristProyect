package entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "RVA_PAQ_TUR")
public class RvaPaqTur {
    @Id
    @Size(max = 10)
    @Column(name = "COD_RPT", nullable = false, length = 10)
    private String codRpt;

    @NotNull
    @Column(name = "PRCDESCUENTO", nullable = false)
    private Double prcdescuento;

    @NotNull
    @Column(name = "SUBTOTAL", nullable = false)
    private Double subtotal;

    @NotNull
    @Column(name = "NUMPERSONAS", nullable = false)
    private Long numpersonas;

    @NotNull
    @Column(name = "PRECIOPERSONA", nullable = false)
    private Double preciopersona;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PAQ_TURISTICO_COD_PAQ_TUR", nullable = false)
    private PaqTuristico paqTuristicoCodPaqTur;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ESTADO_RVA_PAQ_CODIGO", nullable = false)
    private EstadoRvaPaq estadoRvaPaqCodigo;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "HORARIO_PAQ_CODIGO", nullable = false)
    private HorarioPaq horarioPaqCodigo;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FACTURA_C_COD_FAC", nullable = false)
    private FacturaC facturaCCodFac;

    public String getCodRpt() {
        return codRpt;
    }

    public void setCodRpt(String codRpt) {
        this.codRpt = codRpt;
    }

    public Double getPrcdescuento() {
        return prcdescuento;
    }

    public void setPrcdescuento(Double prcdescuento) {
        this.prcdescuento = prcdescuento;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Long getNumpersonas() {
        return numpersonas;
    }

    public void setNumpersonas(Long numpersonas) {
        this.numpersonas = numpersonas;
    }

    public Double getPreciopersona() {
        return preciopersona;
    }

    public void setPreciopersona(Double preciopersona) {
        this.preciopersona = preciopersona;
    }

    public PaqTuristico getPaqTuristicoCodPaqTur() {
        return paqTuristicoCodPaqTur;
    }

    public void setPaqTuristicoCodPaqTur(PaqTuristico paqTuristicoCodPaqTur) {
        this.paqTuristicoCodPaqTur = paqTuristicoCodPaqTur;
    }

    public EstadoRvaPaq getEstadoRvaPaqCodigo() {
        return estadoRvaPaqCodigo;
    }

    public void setEstadoRvaPaqCodigo(EstadoRvaPaq estadoRvaPaqCodigo) {
        this.estadoRvaPaqCodigo = estadoRvaPaqCodigo;
    }

    public HorarioPaq getHorarioPaqCodigo() {
        return horarioPaqCodigo;
    }

    public void setHorarioPaqCodigo(HorarioPaq horarioPaqCodigo) {
        this.horarioPaqCodigo = horarioPaqCodigo;
    }

    public FacturaC getFacturaCCodFac() {
        return facturaCCodFac;
    }

    public void setFacturaCCodFac(FacturaC facturaCCodFac) {
        this.facturaCCodFac = facturaCCodFac;
    }

}