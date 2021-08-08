package hu.ulyssys.java.course.javaee.demo.mbean;



import hu.ulyssys.java.course.javaee.demo.vehicle.entity.Owner;
import hu.ulyssys.java.course.javaee.demo.vehicle.entity.Ship;
import hu.ulyssys.java.course.javaee.demo.vehicle.service.OwnerService;
import hu.ulyssys.java.course.javaee.demo.vehicle.service.ShipService;
import org.primefaces.PrimeFaces;


import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;



@Named
@ViewScoped
public class ShipCRUDMBean extends OwnerAwareCRUDMBean<Ship> implements Serializable {
    @Inject
    public ShipCRUDMBean(ShipService shipService, OwnerService ownerService) {
        super(shipService, ownerService);
    }

    @Override
    protected String dialogName() {
        return "shipDialog";
    }

    @Override
    protected Ship initNewEntity() {
        return new Ship();
    }

}