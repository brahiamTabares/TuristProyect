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
@Table(name = "REGIMEN_HOSP")
public class RegimenHosp implements Serializable {
    @Id
    @Size(max = 10)
    @Column(name = "CODIGO", nullable = false, length = 10)
    private String codigo;

    @Size(max = 50)
    @NotNull
    @Column(name = "NOMBRE", nullable = false, length = 50)
    private String nombre;

    @Size(max = 250)
    @NotNull
    @Column(name = "DESCRIPCION", nullable = false, length = 250)
    private String descripcion;

    @NotNull
    @Column(name = "PRCINCREMENTO", nullable = false)
    private Double prcincremento;

}