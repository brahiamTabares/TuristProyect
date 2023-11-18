package entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "TIPO_HOTEL")
public class TipoHotel {
    @Id
    @Size(max = 10)
    @Column(name = "COD_TIPOH", nullable = false, length = 10)
    private String codTipoh;

    @Size(max = 250)
    @NotNull
    @Column(name = "DESCRIPCION", nullable = false, length = 250)
    private String descripcion;

    public String getCodTipoh() {
        return codTipoh;
    }

    public void setCodTipoh(String codTipoh) {
        this.codTipoh = codTipoh;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}