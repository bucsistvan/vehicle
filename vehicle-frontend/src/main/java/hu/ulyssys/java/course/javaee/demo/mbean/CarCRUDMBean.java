package hu.ulyssys.java.course.javaee.demo.mbean;



import hu.ulyssys.java.course.javaee.demo.vehicle.entity.Car;
import hu.ulyssys.java.course.javaee.demo.vehicle.entity.Owner;
import hu.ulyssys.java.course.javaee.demo.vehicle.service.CarService;
import hu.ulyssys.java.course.javaee.demo.vehicle.service.OwnerService;



import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;



@Named
@ViewScoped
public class CarCRUDMBean extends OwnerAwareCRUDMBean<Car> implements Serializable {
    @Inject
    public CarCRUDMBean(CarService carService, OwnerService ownerService) {
        super(carService, ownerService);
    }

    @Override
    protected String dialogName() {
        return "carDialog";
    }

    @Override
    protected Car initNewEntity() {
        return new Car();
    }

}