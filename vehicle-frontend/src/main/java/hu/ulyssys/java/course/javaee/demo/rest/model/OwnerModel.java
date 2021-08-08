package hu.ulyssys.java.course.javaee.demo.rest.model;

import hu.ulyssys.java.course.javaee.demo.vehicle.entity.AbstractVehicle;

import java.util.List;

public class OwnerModel extends CoreRestModel {
    private Long id;
    private String fullName;
    private List<CoreRestModel> vehicleList;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<CoreRestModel> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<CoreRestModel> vehicleList) {
        this.vehicleList = vehicleList;
    }
}

