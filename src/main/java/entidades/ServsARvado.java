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
@Table(name = "SERVS_A_RVADO")
public class ServsARvado implements Serializable {
    @Id
    @Size(max = 20)
    @Column(name = "COD_SERVARV", nullable = false, length = 20)
    private String codServarv;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SERVS_AD_AUTO_COD_SERVADAUTO", nullable = false)
    private ServsAdAuto servsAdAutoCodServadauto;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RVA_AUTO_CODIGO_RVA_AUTO", nullable = false)
    private RvaAuto rvaAutoCodigoRvaAuto;

}