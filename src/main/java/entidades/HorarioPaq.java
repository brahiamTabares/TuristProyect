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
@Table(name = "HORARIO_PAQ")
public class HorarioPaq implements Serializable {
    @Id
    @Size(max = 10)
    @Column(name = "CODIGO", nullable = false, length = 10)
    private String codigo;

    @Size(max = 20)
    @NotNull
    @Column(name = "DIA", nullable = false, length = 20)
    private String dia;

    @Size(max = 50)
    @NotNull
    @Column(name = "HORAINICIO", nullable = false, length = 50)
    private String horainicio;

    @Size(max = 50)
    @NotNull
    @Column(name = "HORAFIN", nullable = false, length = 50)
    private String horafin;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "PAQ_TURISTICO_COD_PAQ_TUR", referencedColumnName = "COD_PAQ_TUR")
    private PaqTuristico paqTuristico;

}