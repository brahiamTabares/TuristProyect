package entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

@Entity
@Table(name = "ADMINISTRADOR")
public class Administrador implements Serializable {
    @Id
    @Size(max = 10)
    @Column(name = "COD_ADM", nullable = false, length = 10)
    private String codAdm;

    @Size(max = 50)
    @Column(name = "NOMBRE_A", length = 50)
    private String nombreA;

    @Size(max = 20)
    @Column(name = "PASSWORD_A", length = 20)
    private String passwordA;

    @Size(max = 10)
    @Column(name = "TELEFONO", length = 10)
    private String telefono;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "ESTADO_A_CODIGO", referencedColumnName = "CODIGO")
    private EstadoA estado;


    public String getCodAdm() {
        return codAdm;
    }

    public void setCodAdm(String codAdm) {
        this.codAdm = codAdm;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public String getPasswordA() {
        return passwordA;
    }

    public void setPasswordA(String passwordA) {
        this.passwordA = passwordA;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public EstadoA getEstado() {
        return estado;
    }

    public void setEstado(EstadoA estado) {
        this.estado = estado;
    }
}