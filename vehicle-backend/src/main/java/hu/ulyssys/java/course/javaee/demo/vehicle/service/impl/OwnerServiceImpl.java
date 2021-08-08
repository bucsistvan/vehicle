package hu.ulyssys.java.course.javaee.demo.vehicle.service.impl;
import hu.ulyssys.java.course.javaee.demo.vehicle.dao.OwnerDAO;
import hu.ulyssys.java.course.javaee.demo.vehicle.entity.Owner;
import hu.ulyssys.java.course.javaee.demo.vehicle.service.OwnerService;

import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;
@Stateless
public class OwnerServiceImpl extends AbstractServiceImpl<Owner> implements OwnerService {

    @Override
    public Owner findByName(String name) {
        return ((OwnerDAO) dao).findByName(name);
    }
}