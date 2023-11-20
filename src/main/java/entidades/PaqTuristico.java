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
@Table(name = "PAQ_TURISTICO")
public class PaqTuristico implements Serializable {
    @Id
    @Size(max = 10)
    @Column(name = "COD_PAQ_TUR", nullable = false, length = 10)
    private String codPaqTur;

    @Size(max = 10)
    @NotNull
    @Column(name = "CODIGO_PROVEEDOR", nullable = false, length = 10)
    private String codigoProveedor;

    @Size(max = 250)
    @NotNull
    @Column(name = "DESCRIPCION", nullable = false, length = 250)
    private String descripcion;

    @NotNull
    @Column(name = "PRECIOPERSONA", nullable = false)
    private Double preciopersona;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "CIUDAD_ENT_CODIGO", nullable = false)
    private CiudadEnt ciudadEnt;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "TIPO_PAQ_COD_TIPOPAQ", referencedColumnName = "COD_TIPOPAQ")
    private TipoPaq TipoPaq;

}