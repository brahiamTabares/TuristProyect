package entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "TIPO_HAB")
public class TipoHab implements Serializable {
    @Id
    @Size(max = 10)
    @Column(name = "COD_TIPOHAB", nullable = false, length = 10)
    private String codTipohab;

    @Size(max = 255)
    @NotNull
    @Column(name = "NOMBRE", nullable = false)
    private String nombre;

    @Size(max = 255)
    @NotNull
    @Column(name = "DESCRIPCION", nullable = false)
    private String descripcion;

}