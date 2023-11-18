package entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "PAQ_TURISTICO")
public class PaqTuristico {
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
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CIUDAD_ENT_CODIGO", nullable = false)
    private CiudadEnt ciudadEntCodigo;

    public String getCodPaqTur() {
        return codPaqTur;
    }

    public void setCodPaqTur(String codPaqTur) {
        this.codPaqTur = codPaqTur;
    }

    public String getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(String codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPreciopersona() {
        return preciopersona;
    }

    public void setPreciopersona(Double preciopersona) {
        this.preciopersona = preciopersona;
    }

    public CiudadEnt getCiudadEntCodigo() {
        return ciudadEntCodigo;
    }

    public void setCiudadEntCodigo(CiudadEnt ciudadEntCodigo) {
        this.ciudadEntCodigo = ciudadEntCodigo;
    }

}