package entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity
@Table(name = "CLIENTE")
public class Cliente {
    @Id
    @Size(max = 10)
    @Column(name = "CEDULA", nullable = false, length = 10)
    private String cedula;

    @Size(max = 50)
    @NotNull
    @Column(name = "CORREO", nullable = false, length = 50)
    private String correo;

    @Size(max = 50)
    @NotNull
    @Column(name = "NOMBRE", nullable = false, length = 50)
    private String nombre;

    @Size(max = 50)
    @NotNull
    @Column(name = "APELLIDO", nullable = false, length = 50)
    private String apellido;

    @NotNull
    @Column(name = "FECHA_NACIMIENTO", nullable = false)
    private LocalDate fechaNacimiento;

    @Size(max = 50)
    @NotNull
    @Column(name = "DIRECCION", nullable = false, length = 50)
    private String direccion;

    @Size(max = 10)
    @NotNull
    @Column(name = "TELEFONO", nullable = false, length = 10)
    private String telefono;

    @Size(max = 20)
    @NotNull
    @Column(name = "PASSWORD", nullable = false, length = 20)
    private String password;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CIUDAD_ENT_CODIGO", nullable = false)
    private CiudadEnt ciudadEntCodigo;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CiudadEnt getCiudadEntCodigo() {
        return ciudadEntCodigo;
    }

    public void setCiudadEntCodigo(CiudadEnt ciudadEntCodigo) {
        this.ciudadEntCodigo = ciudadEntCodigo;
    }

}