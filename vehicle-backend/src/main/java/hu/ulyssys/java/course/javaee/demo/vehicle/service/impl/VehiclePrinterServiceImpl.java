package hu.ulyssys.java.course.javaee.demo.vehicle.service.impl;

import hu.ulyssys.java.course.javaee.demo.vehicle.entity.AbstractVehicle;

public class VehiclePrinterServiceImpl {

    public static void printVehicleBase(AbstractVehicle vehicle){
        System.out.print("Id: " +vehicle.getId());
        System.out.print(", Tipus: " +vehicle.getType());
        System.out.print(", Gyarto: " +vehicle.getManufacturer());
        System.out.print(", Jarmu tipusa: " + vehicle.getVehicleType());
    }
}
