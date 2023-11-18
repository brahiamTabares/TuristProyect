package entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity
@Table(name = "RVA_HOSP")
public class RvaHosp {
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
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "REGIMEN_HOSP_CODIGO", nullable = false)
    private RegimenHosp regimenHospCodigo;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "HABITACION_CODIGO_HOTEL", referencedColumnName = "CODIGO_HOTEL", nullable = false),
            @JoinColumn(name = "HABITACION_COD_HAB", referencedColumnName = "COD_HAB", nullable = false)
    })
    private Habitacion habitacion;

    public String getCodRvaHosp() {
        return codRvaHosp;
    }

    public void setCodRvaHosp(String codRvaHosp) {
        this.codRvaHosp = codRvaHosp;
    }

    public LocalDate getFechachekcin() {
        return fechachekcin;
    }

    public void setFechachekcin(LocalDate fechachekcin) {
        this.fechachekcin = fechachekcin;
    }

    public LocalDate getFechacheckout() {
        return fechacheckout;
    }

    public void setFechacheckout(LocalDate fechacheckout) {
        this.fechacheckout = fechacheckout;
    }

    public Double getPrecionoche() {
        return precionoche;
    }

    public void setPrecionoche(Double precionoche) {
        this.precionoche = precionoche;
    }

    public Double getPrcincremento() {
        return prcincremento;
    }

    public void setPrcincremento(Double prcincremento) {
        this.prcincremento = prcincremento;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Estadorvahosp getEstadorvahospCodigo() {
        return estadorvahospCodigo;
    }

    public void setEstadorvahospCodigo(Estadorvahosp estadorvahospCodigo) {
        this.estadorvahospCodigo = estadorvahospCodigo;
    }

    public RegimenHosp getRegimenHospCodigo() {
        return regimenHospCodigo;
    }

    public void setRegimenHospCodigo(RegimenHosp regimenHospCodigo) {
        this.regimenHospCodigo = regimenHospCodigo;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

}