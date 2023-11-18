package entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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

}