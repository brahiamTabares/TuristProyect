package entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PAQ_SERV")
public class PaqServ {
    @Id
    @Size(max = 10)
    @Column(name = "COD_PSERV", nullable = false, length = 10)
    private String codPserv;

    @Column(name = "CANTIDAD")
    private Long cantidad;

    @Column(name = "PRECIOUNITARIO")
    private Double preciounitario;

    @Column(name = "DESCUENTO")
    private Double descuento;

    @Column(name = "SUBTOTAL")
    private Double subtotal;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "FACTURA_C_COD_FAC", nullable = false)
    private FacturaC facturaCCodFac;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "SERVICIO_COD_SERV", referencedColumnName = "COD_SERV")
    private Servicio codigoServicio;

}