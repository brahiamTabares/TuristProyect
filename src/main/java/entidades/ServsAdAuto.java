package entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

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

    public String getCodServadauto() {
        return codServadauto;
    }

    public void setCodServadauto(String codServadauto) {
        this.codServadauto = codServadauto;
    }

    public Auto getAutoCodAuto() {
        return autoCodAuto;
    }

    public void setAutoCodAuto(Auto autoCodAuto) {
        this.autoCodAuto = autoCodAuto;
    }

}