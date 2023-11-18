package entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "AUTO")
public class Auto {
    @Id
    @Size(max = 10)
    @Column(name = "COD_AUTO", nullable = false, length = 10)
    private String codAuto;

    @Size(max = 20)
    @NotNull
    @Column(name = "PLACA", nullable = false, length = 20)
    private String placa;

    @NotNull
    @Column(name = "NUMPUESTOS", nullable = false)
    private Long numpuestos;

    @NotNull
    @Column(name = "PRECIORENTADIA", nullable = false)
    private Double preciorentadia;

    @Size(max = 20)
    @NotNull
    @Column(name = "COLOR", nullable = false, length = 20)
    private String color;

    @NotNull
    @Column(name = "CAPACIDADCARGA", nullable = false)
    private Double capacidadcarga;

    @Size(max = 20)
    @NotNull
    @Column(name = "TIPOCOMBUSTIBLE", nullable = false, length = 20)
    private String tipocombustible;

}