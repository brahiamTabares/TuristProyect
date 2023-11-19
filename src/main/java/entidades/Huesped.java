package entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "HUESPED")
public class Huesped implements Serializable {
    @Id
    @Size(max = 100)
    @Column(name = "EMAIL", nullable = false, length = 100)
    private String email;

    @Size(max = 50)
    @NotNull
    @Column(name = "NOMBRE", nullable = false, length = 50)
    private String nombre;

    @Size(max = 50)
    @NotNull
    @Column(name = "APELLIDO", nullable = false, length = 50)
    private String apellido;

    @Size(max = 12)
    @NotNull
    @Column(name = "TELEFONO", nullable = false, length = 12)
    private String telefono;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "RVA_HOSP_COD_RVA_HOSP", referencedColumnName = "COD_RVA_HOSP")
    private RvaHosp codigoRvaHos;

}