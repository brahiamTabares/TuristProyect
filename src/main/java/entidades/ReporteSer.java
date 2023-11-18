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
@Table(name = "REPORTE_SER")
public class ReporteSer {
    @Id
    @Size(max = 10)
    @Column(name = "CODIGO_RE", nullable = false, length = 10)
    private String codigoRe;

    @Size(max = 250)
    @Column(name = "DESCRIPCION_RE", length = 250)
    private String descripcionRe;

    @Column(name = "FECHAREPORTE")
    private LocalDate fechareporte;

    @Size(max = 20)
    @Column(name = "ESTADO_SER", length = 20)
    private String estadoSer;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ADMINISTRADOR_COD_ADM", nullable = false)
    private Administrador administradorCodAdm;

}