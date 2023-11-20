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
@Table(name = "RVA_PAQ_TUR")
public class RvaPaqTur implements Serializable {
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
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "PAQ_TURISTICO_COD_PAQ_TUR", nullable = false)
    private PaqTuristico paqTuristicoCodPaqTur;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "ESTADO_RVA_PAQ_CODIGO", nullable = false)
    private EstadoRvaPaq estadoRvaPaqCodigo;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "HORARIO_PAQ_CODIGO", nullable = false)
    private HorarioPaq horarioPaqCodigo;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "FACTURA_C_COD_FAC", nullable = false)
    private FacturaC facturaCCodFac;


}