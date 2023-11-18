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
@Table(name = "FACTURA_C")
public class FacturaC {
    @Id
    @Size(max = 20)
    @Column(name = "COD_FAC", nullable = false, length = 20)
    private String codFac;

    @NotNull
    @Column(name = "FECHA_EXPEDICION", nullable = false)
    private LocalDate fechaExpedicion;

    @NotNull
    @Column(name = "FECHA_VENCIMIENTO", nullable = false)
    private LocalDate fechaVencimiento;

    @Size(max = 50)
    @Column(name = "DETALLECOMPRA", length = 50)
    private String detallecompra;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CLIENTE_CEDULA", nullable = false)
    private Cliente clienteCedula;

    @Column(name = "TOTAL")
    private Double total;

    @Column(name = "ESTADO")
    private Boolean estado;


}