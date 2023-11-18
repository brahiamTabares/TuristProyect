package entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "SERVS_A_RVADO")
public class ServsARvado {
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

    public String getCodServarv() {
        return codServarv;
    }

    public void setCodServarv(String codServarv) {
        this.codServarv = codServarv;
    }

    public ServsAdAuto getServsAdAutoCodServadauto() {
        return servsAdAutoCodServadauto;
    }

    public void setServsAdAutoCodServadauto(ServsAdAuto servsAdAutoCodServadauto) {
        this.servsAdAutoCodServadauto = servsAdAutoCodServadauto;
    }

    public RvaAuto getRvaAutoCodigoRvaAuto() {
        return rvaAutoCodigoRvaAuto;
    }

    public void setRvaAutoCodigoRvaAuto(RvaAuto rvaAutoCodigoRvaAuto) {
        this.rvaAutoCodigoRvaAuto = rvaAutoCodigoRvaAuto;
    }

}