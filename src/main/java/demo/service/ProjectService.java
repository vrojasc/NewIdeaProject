package demo.service;

import demo.model.Manager;
import demo.model.Project;
import demo.repository.ManagerRepository;
import demo.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by poo2 on 18/06/2015.
 */
@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;
    @Autowired
    private ManagerRepository managerRepository;

    public void testProject(){
        //Proyecto 1
        Project project = new Project();
        project.setDescription("Proyecto de prueba 1");
        project.setStart_date(new Date());
        project.setEnd_date(new Date());
        projectRepository.save(project);
        Manager manager = managerRepository.findByLastname("Hansen").get(0);
        project.setManager(manager);
        projectRepository.save(project);

        //Proyecto 2
        /*manager = new Manager();
        manager.setName("Gabriel");
        manager.setLastname("García Gomez");
        manager.setSalary(8435.1);
        manager.setHireDate(new Date());
        manager.setBonusSuccess(manager.getSalary()*16/100);
        projectRepository.save(manager);
        List<Manager> managers = managerRepository.findByBonusSuccessGreaterThan(1200.0);
        for(Manager manager1 : managers){
            System.out.println(manager1.toString());
        }*/
    }
}
