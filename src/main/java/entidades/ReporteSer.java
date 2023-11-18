package entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity
@Table(name = "REPORTE_SER")
public class ReporteSer {
    @Id
    @Size(max = 10)
    @Column(name = "CODIGO_RE", nullable = false, length = 10)
    private String codigoRe;

    @Size(max = 250)
    @Column(name = "DESCRIPCION_RE", length = 250)
    private String descripcionRe;

    @Column(name = "FECHAREPORTE")
    private LocalDate fechareporte;

    @Size(max = 20)
    @Column(name = "ESTADO_SER", length = 20)
    private String estadoSer;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ADMINISTRADOR_COD_ADM", nullable = false)
    private Administrador administradorCodAdm;

    public String getCodigoRe() {
        return codigoRe;
    }

    public void setCodigoRe(String codigoRe) {
        this.codigoRe = codigoRe;
    }

    public String getDescripcionRe() {
        return descripcionRe;
    }

    public void setDescripcionRe(String descripcionRe) {
        this.descripcionRe = descripcionRe;
    }

    public LocalDate getFechareporte() {
        return fechareporte;
    }

    public void setFechareporte(LocalDate fechareporte) {
        this.fechareporte = fechareporte;
    }

    public String getEstadoSer() {
        return estadoSer;
    }

    public void setEstadoSer(String estadoSer) {
        this.estadoSer = estadoSer;
    }

    public Administrador getAdministradorCodAdm() {
        return administradorCodAdm;
    }

    public void setAdministradorCodAdm(Administrador administradorCodAdm) {
        this.administradorCodAdm = administradorCodAdm;
    }

}