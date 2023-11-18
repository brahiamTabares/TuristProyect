package entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "HORARIO_PAQ")
public class HorarioPaq {
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(String horainicio) {
        this.horainicio = horainicio;
    }

    public String getHorafin() {
        return horafin;
    }

    public void setHorafin(String horafin) {
        this.horafin = horafin;
    }

}