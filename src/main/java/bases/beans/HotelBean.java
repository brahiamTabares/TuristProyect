//
//package bases.beans;
//import bases.beans.GenericBean;
//import bases.repositorio.*;
//import entidades.Administrador;
//import entidades.EstadoA;
//import entidades.Hotel;
//import entidades.TipoHotel;
//import jakarta.annotation.PostConstruct;
//import jakarta.faces.component.UIComponent;
//import jakarta.faces.context.FacesContext;
//import jakarta.faces.view.ViewScoped;
//import jakarta.inject.Inject;
//import jakarta.inject.Named;
//
//@ViewScoped
//@Named
//public class HotelBean extends GenericBean<Hotel> {
//
//    @Inject
//    private HotelRepositorio repositorio;
//    @Inject
//    private TipoHotelRepositorio tipoHotelRepositorio;
//    private TipoHotel defaultTipo;
//    @PostConstruct
//    public void init(){
//        records = repositorio.get();
//        defaultTipo = tipoHotelRepositorio.find("EA001").orElse(null);
//        record.setTipo(defaulTipo);
//    }
//
//    @Override
//    protected Hotel newRecord() {
//        var nuevo = new Hotel();
//        nuevo.setTipo(defaultTipo);
//        return nuevo;
//    }
//
//    @Override
//    protected AbstractRepositorio<Hotel> getRepositorio() {
//        return repositorio;
//    }
//
//    public void validate(FacesContext facesContext, UIComponent component, java.lang.Object object){
//        validateUnique(facesContext, component, object, record -> record.getCodHotel().equals(object.toString()) );
//    }
//}