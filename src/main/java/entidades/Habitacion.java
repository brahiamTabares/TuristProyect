package entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "HABITACION")
public class Habitacion {
    @EmbeddedId
    private HabitacionId id;

    @NotNull
    @Column(name = "NUMCUARTOS", nullable = false)
    private Long numcuartos;

    @NotNull
    @Column(name = "CAPACIDAD", nullable = false)
    private Long capacidad;

    @NotNull
    @Column(name = "PRECIONOCHE", nullable = false)
    private Double precionoche;

    @Size(max = 100)
    @NotNull
    @Column(name = "URLIMAGEN", nullable = false, length = 100)
    private String urlimagen;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ESTADO_HAB_COD_EH", nullable = false)
    private EstadoHab estadoHabCodEh;

    public HabitacionId getId() {
        return id;
    }

    public void setId(HabitacionId id) {
        this.id = id;
    }

    public Long getNumcuartos() {
        return numcuartos;
    }

    public void setNumcuartos(Long numcuartos) {
        this.numcuartos = numcuartos;
    }

    public Long getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Long capacidad) {
        this.capacidad = capacidad;
    }

    public Double getPrecionoche() {
        return precionoche;
    }

    public void setPrecionoche(Double precionoche) {
        this.precionoche = precionoche;
    }

    public String getUrlimagen() {
        return urlimagen;
    }

    public void setUrlimagen(String urlimagen) {
        this.urlimagen = urlimagen;
    }

    public EstadoHab getEstadoHabCodEh() {
        return estadoHabCodEh;
    }

    public void setEstadoHabCodEh(EstadoHab estadoHabCodEh) {
        this.estadoHabCodEh = estadoHabCodEh;
    }

}