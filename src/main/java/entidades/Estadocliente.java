package entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "ESTADOCLIENTE")
public class Estadocliente {
    @Id
    @Size(max = 10)
    @Column(name = "CODESTADOC", nullable = false, length = 10)
    private String codestadoc;

    @Size(max = 250)
    @NotNull
    @Column(name = "DESCRIPCION", nullable = false, length = 250)
    private String descripcion;

    public String getCodestadoc() {
        return codestadoc;
    }

    public void setCodestadoc(String codestadoc) {
        this.codestadoc = codestadoc;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}