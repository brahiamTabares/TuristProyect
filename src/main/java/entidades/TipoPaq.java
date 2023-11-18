package entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "TIPO_PAQ")
public class TipoPaq {
    @Id
    @Size(max = 10)
    @Column(name = "COD_TIPOPAQ", nullable = false, length = 10)
    private String codTipopaq;

    @Size(max = 255)
    @NotNull
    @Column(name = "NOMBRE", nullable = false)
    private String nombre;

    @Size(max = 255)
    @NotNull
    @Column(name = "DESCRIPCION", nullable = false)
    private String descripcion;

    public String getCodTipopaq() {
        return codTipopaq;
    }

    public void setCodTipopaq(String codTipopaq) {
        this.codTipopaq = codTipopaq;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}