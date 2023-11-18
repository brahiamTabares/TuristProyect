package entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "INSTALACION")
public class Instalacion {
    @Id
    @Size(max = 10)
    @Column(name = "COD_INST", nullable = false, length = 10)
    private String codInst;

    @Size(max = 50)
    @NotNull
    @Column(name = "NOMBRE", nullable = false, length = 50)
    private String nombre;

    @Size(max = 250)
    @NotNull
    @Column(name = "DESCRIPCION", nullable = false, length = 250)
    private String descripcion;

    @Size(max = 100)
    @NotNull
    @Column(name = "URLIMAGEN", nullable = false, length = 100)
    private String urlimagen;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "HOTEL_COD_HOTEL", nullable = false)
    private Hotel hotelCodHotel;

    public String getCodInst() {
        return codInst;
    }

    public void setCodInst(String codInst) {
        this.codInst = codInst;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrlimagen() {
        return urlimagen;
    }

    public void setUrlimagen(String urlimagen) {
        this.urlimagen = urlimagen;
    }

    public Hotel getHotelCodHotel() {
        return hotelCodHotel;
    }

    public void setHotelCodHotel(Hotel hotelCodHotel) {
        this.hotelCodHotel = hotelCodHotel;
    }

}