package hu.ulyssys.java.course.javaee.demo.mbean;
import hu.ulyssys.java.course.javaee.demo.vehicle.entity.Owner;
import hu.ulyssys.java.course.javaee.demo.vehicle.service.OwnerService;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;
@Named
@ViewScoped
public class OwnerCRUDMBean extends CoreCRUDMbean<Owner> implements Serializable {
    @Inject
    public OwnerCRUDMBean(OwnerService ownerService) {
        super(ownerService);

    }


    @Override
    protected String dialogName() {
        return "ownerDialog";
    }

    @Override
    protected Owner initNewEntity() {
        return new Owner();
    }

}