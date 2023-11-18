package entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "TIPO_INST")
public class TipoInst {
    @Id
    @Size(max = 10)
    @Column(name = "COD_TIPOI", nullable = false, length = 10)
    private String codTipoi;

    @Size(max = 250)
    @NotNull
    @Column(name = "DESCRIPCION", nullable = false, length = 250)
    private String descripcion;

    public String getCodTipoi() {
        return codTipoi;
    }

    public void setCodTipoi(String codTipoi) {
        this.codTipoi = codTipoi;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}