package entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
@Getter
@Setter
@Entity
@Table(name = "RVA_HOSP")
public class RvaHosp implements Serializable {
    @Id
    @Size(max = 10)
    @Column(name = "COD_RVA_HOSP", nullable = false, length = 10)
    private String codRvaHosp;

    @NotNull
    @Column(name = "FECHACHEKCIN", nullable = false)
    private LocalDate fechachekcin;

    @NotNull
    @Column(name = "FECHACHECKOUT", nullable = false)
    private LocalDate fechacheckout;

    @NotNull
    @Column(name = "PRECIONOCHE", nullable = false)
    private Double precionoche;

    @NotNull
    @Column(name = "PRCINCREMENTO", nullable = false)
    private Double prcincremento;

    @NotNull
    @Column(name = "SUBTOTAL", nullable = false)
    private Double subtotal;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ESTADORVAHOSP_CODIGO", nullable = false)
    private Estadorvahosp estadorvahospCodigo;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "SERVICIO_COD_SERV", referencedColumnName = "COD_SERV")
    private Servicio Servicio;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "REGIMEN_HOSP_CODIGO", nullable = false)
    private RegimenHosp regimenHosp;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "HABITACION_CODIGO_HOTEL", referencedColumnName = "CODIGO_HOTEL", nullable = false),
            @JoinColumn(name = "HABITACION_COD_HAB", referencedColumnName = "COD_HAB", nullable = false)
    })
    private Habitacion habitacion;

}