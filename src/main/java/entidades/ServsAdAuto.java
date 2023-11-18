package entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "SERVS_AD_AUTO")
public class ServsAdAuto {
    @Id
    @Size(max = 10)
    @Column(name = "COD_SERVADAUTO", nullable = false, length = 10)
    private String codServadauto;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "AUTO_COD_AUTO", nullable = false)
    private Auto autoCodAuto;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "SERV_AD_COD_SERVAD", referencedColumnName = "COD_SERVAD")
    private ServAd servAd;

}