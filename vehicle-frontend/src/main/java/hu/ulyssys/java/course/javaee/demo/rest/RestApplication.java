package hu.ulyssys.java.course.javaee.demo.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

//fel is konfiguraltuk, ha lesz REST endpointunkn, akkor a base url:localhost:
@ApplicationPath("/api")
public class RestApplication extends Application {
}
