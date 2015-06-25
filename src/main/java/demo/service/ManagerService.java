package demo.service;

import demo.model.Manager;
import demo.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by poo2 on 17/06/2015.
 */
@Service
public class ManagerService {

    @Autowired
    private ManagerRepository managerRepository;

    public void testManagers(){
        //Manager 1
        Manager manager = new Manager();
        manager.setName("Gabriel");
        manager.setLastname("Gomez");
        manager.setSalary(4885.45);
        manager.setHireDate(new Date());
        manager.setBonusSuccess(manager.getSalary()*16/100);
        managerRepository.save(manager);
        //Manager 2
        manager = new Manager();
        manager.setName("Hit");
        manager.setLastname("Hansen");
        manager.setSalary(8435.1);
        manager.setHireDate(new Date());
        manager.setBonusSuccess(manager.getSalary()*16/100);
        managerRepository.save(manager);
        List<Manager> managers = managerRepository.findByBonusSuccessGreaterThan(1200.0);
        for(Manager manager1 : managers){
            System.out.println(manager1.toString());
        }
    }

}
