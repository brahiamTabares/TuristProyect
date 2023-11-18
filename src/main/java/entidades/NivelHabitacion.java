package entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "NIVELHABITACION")
public class NivelHabitacion {

    @Id
    @Size(max = 10)
    @Column(name = "COD_NH", nullable = false, length = 10)
    private String codigoNH;

    @Size(max = 250)
    @Column(name = "DESCRIPCION", length = 250)
    private String descripcion;

}

