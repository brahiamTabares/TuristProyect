package entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

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

    public String getCodAuto() {
        return codAuto;
    }

    public void setCodAuto(String codAuto) {
        this.codAuto = codAuto;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Long getNumpuestos() {
        return numpuestos;
    }

    public void setNumpuestos(Long numpuestos) {
        this.numpuestos = numpuestos;
    }

    public Double getPreciorentadia() {
        return preciorentadia;
    }

    public void setPreciorentadia(Double preciorentadia) {
        this.preciorentadia = preciorentadia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getCapacidadcarga() {
        return capacidadcarga;
    }

    public void setCapacidadcarga(Double capacidadcarga) {
        this.capacidadcarga = capacidadcarga;
    }

    public String getTipocombustible() {
        return tipocombustible;
    }

    public void setTipocombustible(String tipocombustible) {
        this.tipocombustible = tipocombustible;
    }

}