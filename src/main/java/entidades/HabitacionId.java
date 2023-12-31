package entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class HabitacionId implements Serializable {
    private static final long serialVersionUID = 2019014528558437137L;
    @Size(max = 20)
    @NotNull
    @Column(name = "COD_HAB", nullable = false, length = 20)
    private String codHab;

    @Size(max = 10)
    @NotNull
    @Column(name = "CODIGO_HOTEL", nullable = false, length = 10)
    private String codigoHotel;

    public String getCodHab() {
        return codHab;
    }

    public void setCodHab(String codHab) {
        this.codHab = codHab;
    }

    public String getCodigoHotel() {
        return codigoHotel;
    }

    public void setCodigoHotel(String codigoHotel) {
        this.codigoHotel = codigoHotel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HabitacionId entity = (HabitacionId) o;
        return Objects.equals(this.codHab, entity.codHab) &&
                Objects.equals(this.codigoHotel, entity.codigoHotel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codHab, codigoHotel);
    }

}