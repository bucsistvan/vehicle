package hu.ulyssys.java.course.javaee.demo.vehicle.entity;

import javax.persistence.*;

@MappedSuperclass
public abstract class AbstractVehicle extends AbstractEntity implements VehicleTypeAware{

    @Column(name = "manifacturer")
    private String manufacturer;

    @Column(name = "type")
    private String type;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    public AbstractVehicle(){

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public VehicleType getVehicleType() {
        return null;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
