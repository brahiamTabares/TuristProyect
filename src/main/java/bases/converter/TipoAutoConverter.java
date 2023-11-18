package bases.converter;

import bases.beans.AutoBean;
import entidades.TipoAuto;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.inject.Named;
@Named
public class TipoAutoConverter implements Converter<TipoAuto> {
    private AutoBean autoBean;

    @Override
    public TipoAuto getAsObject(FacesContext context, UIComponent component, String value) {
        TipoAuto tipoAuto = null;
        try {
            tipoAuto = autoBean.getRecord().getTipo();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tipoAuto;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, TipoAuto value) {
        if (value != null) {
            return "" + value.getCodigo();
        }
        return "";
    }
}

