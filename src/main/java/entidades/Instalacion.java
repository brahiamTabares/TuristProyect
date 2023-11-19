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
@Table(name = "INSTALACION")
public class Instalacion implements Serializable {
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
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "HOTEL_COD_HOTEL", nullable = false)
    private Hotel hotelCodHotel;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "TIPO_INST_COD_TIPOI", referencedColumnName = "COD_TIPOI")
    private TipoInst codigoTipoI;

}