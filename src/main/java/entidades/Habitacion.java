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
@Table(name = "HABITACION")
public class Habitacion implements Serializable {
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
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "ESTADO_HAB_COD_EH", nullable = false)
    private EstadoHab estadoHabCodEh;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "NIVELHABITACION_COD_NH", referencedColumnName = "COD_NH")
    private NivelHabitacion nhCodigo;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "TIPO_HAB_COD_TIPOHAB", referencedColumnName = "COD_TIPOHAB")
    private TipoHab codigoHab;


}