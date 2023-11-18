package entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter

@Entity
@Table(name = "ESTADO_ART")
public class EstadoArt {
    @Id
    @Size(max = 10)
    @Column(name = "CODIGO", nullable = false, length = 10)
    private String codigo;

    @Size(max = 250)
    @NotNull
    @Column(name = "DESCRIPCION", nullable = false, length = 250)
    private String descripcion;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}