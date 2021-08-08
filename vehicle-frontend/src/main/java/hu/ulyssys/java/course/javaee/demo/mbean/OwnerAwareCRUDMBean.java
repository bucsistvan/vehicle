package hu.ulyssys.java.course.javaee.demo.mbean;

import hu.ulyssys.java.course.javaee.demo.vehicle.entity.AbstractVehicle;
import hu.ulyssys.java.course.javaee.demo.vehicle.entity.Owner;
import hu.ulyssys.java.course.javaee.demo.vehicle.service.CoreService;
import hu.ulyssys.java.course.javaee.demo.vehicle.service.OwnerService;

import java.util.List;

public abstract class OwnerAwareCRUDMBean<T extends AbstractVehicle> extends CoreCRUDMbean<T> {
    private List<Owner> ownerList;

    public OwnerAwareCRUDMBean(CoreService<T> service, OwnerService ownerService) {
        super(service);
        ownerList = ownerService.getAll();
    }

    public List<Owner> getOwnerList() {
        return ownerList;
    }

    public void setOwnerList(List<Owner> ownerList) {
        this.ownerList = ownerList;
    }
}
