package entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
@Getter
@Setter
@Entity
@Table(name = "REPORTE_SER")
public class ReporteSer implements Serializable {
    @Id
    @Size(max = 10)
    @Column(name = "CODIGO_RE", nullable = false, length = 10)
    private String codigoRe;

    @Size(max = 250)
    @Column(name = "DESCRIPCION_RE", length = 250)
    private String descripcionRe;

    @Column(name = "FECHAREPORTE")
    private LocalDate fechareporte;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ADMINISTRADOR_COD_ADM", nullable = false)
    private Administrador administradorCodAdm;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "SERVICIO_COD_SERV", referencedColumnName = "COD_SERV")
    private Servicio codigoServicio;

}