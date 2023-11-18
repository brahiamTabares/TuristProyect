package entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@Entity
@Table(name = "RVA_AUTO")
public class RvaAuto {
    @Id
    @Size(max = 20)
    @Column(name = "CODIGO_RVA_AUTO", nullable = false, length = 20)
    private String codigoRvaAuto;

    @NotNull
    @Column(name = "SUBTOTAL", nullable = false)
    private Double subtotal;

    @NotNull
    @Column(name = "FECHARECOGIDA", nullable = false)
    private LocalDate fecharecogida;

    @NotNull
    @Column(name = "FECHAENTREGA", nullable = false)
    private LocalDate fechaentrega;

    @NotNull
    @Column(name = "PRECIORENTADIA", nullable = false)
    private Double preciorentadia;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ESTADORESERVAAUTO_CODIGO", nullable = false)
    private EstadoRvaAuto estadoreservaautoCodigo;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "AUTO_CODIGO_AUTO", nullable = false)
    private Auto autoCodigoAuto;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "SERVICIO_COD_SERV", referencedColumnName = "COD_SERV")
    private Servicio codigoServicio;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CIUDAD_ENT_CODIGO", nullable = false)
    private CiudadEnt ciudadEntCodigo;


}