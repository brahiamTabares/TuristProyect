package entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "TIPO_ART")
public class TipoArt {
    @Id
    @Size(max = 10)
    @Column(name = "COD_TIPOART", nullable = false, length = 10)
    private String codTipoart;

    @Size(max = 250)
    @NotNull
    @Column(name = "DESCRIPCION", nullable = false, length = 250)
    private String descripcion;

    public String getCodTipoart() {
        return codTipoart;
    }

    public void setCodTipoart(String codTipoart) {
        this.codTipoart = codTipoart;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}