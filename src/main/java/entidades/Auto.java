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
@Table(name = "AUTO")
public class Auto implements Serializable {
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
    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "CODIGO_TIPOAUTO", referencedColumnName = "CODIGO")
    private TipoAuto tipoAuto;
    //@NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "CODIGO_GAMAAUTO", referencedColumnName = "CODIGO")
    private GamaAuto gamaAuto;
    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "CODIGO_MARCAAUTO", referencedColumnName = "CODIGO")
    private MarcaAuto marcaAuto;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "CODIGO_ESTADOAUTO", referencedColumnName = "CODIGO")
    private EstadoAuto estadoAuto;


}