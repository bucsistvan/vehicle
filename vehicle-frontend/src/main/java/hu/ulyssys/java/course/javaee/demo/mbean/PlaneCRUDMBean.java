package hu.ulyssys.java.course.javaee.demo.mbean;



import hu.ulyssys.java.course.javaee.demo.vehicle.entity.Owner;
import hu.ulyssys.java.course.javaee.demo.vehicle.entity.Plane;
import hu.ulyssys.java.course.javaee.demo.vehicle.service.OwnerService;
import hu.ulyssys.java.course.javaee.demo.vehicle.service.PlaneService;


import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;



@Named
@ViewScoped
public class PlaneCRUDMBean extends OwnerAwareCRUDMBean<Plane> implements Serializable {
    @Inject
    public PlaneCRUDMBean(PlaneService planeService, OwnerService ownerService) {
        super(planeService, ownerService);
    }

    @Override
    protected String dialogName() {
        return "planeDialog";
    }

    @Override
    protected Plane initNewEntity() {
        return new Plane();
    }

}