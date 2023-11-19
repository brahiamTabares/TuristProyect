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
@Table(name = "ESTADO_HAB")
public class EstadoHab implements Serializable {
    @Id
    @Size(max = 10)
    @Column(name = "COD_EH", nullable = false, length = 10)
    private String codEh;

    @Size(max = 255)
    @NotNull
    @Column(name = "DESCRIPCION", nullable = false)
    private String descripcion;


}