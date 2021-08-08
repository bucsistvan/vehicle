package hu.ulyssys.java.course.javaee.demo.rest;

import hu.ulyssys.java.course.javaee.demo.rest.model.CarModel;
import hu.ulyssys.java.course.javaee.demo.rest.model.PlaneModel;
import hu.ulyssys.java.course.javaee.demo.vehicle.entity.Car;
import hu.ulyssys.java.course.javaee.demo.vehicle.entity.Plane;

import javax.ws.rs.Path;

@Path("/plane")
public class PlaneRestService extends CoreRestService<Plane, PlaneModel>{
    @Override
    protected Plane initNewEntity() {
        return new Plane();
    }

    @Override
    protected PlaneModel initNewModel() {
        return new PlaneModel();
    }
}
