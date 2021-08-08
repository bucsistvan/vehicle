package hu.ulyssys.java.course.javaee.demo.rest;

import hu.ulyssys.java.course.javaee.demo.rest.model.CarModel;
import hu.ulyssys.java.course.javaee.demo.rest.model.ShipModel;
import hu.ulyssys.java.course.javaee.demo.vehicle.entity.Car;
import hu.ulyssys.java.course.javaee.demo.vehicle.entity.Ship;

import javax.ws.rs.Path;

@Path("/ship")
public class ShipRestService extends CoreRestService<Ship, ShipModel>{
    @Override
    protected Ship initNewEntity() {
        return new Ship();
    }

    @Override
    protected ShipModel initNewModel() {
        return new ShipModel();
    }
}
