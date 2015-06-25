package demo.service;

import demo.model.Developer;
import demo.model.Manager;
import demo.model.Project;
import demo.repository.DeveloperRepository;
import demo.repository.ManagerRepository;
import demo.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;

/**
 * Created by poo2 on 18/06/2015.
 */
@Service
@Transactional
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;
    @Autowired
    private ManagerRepository managerRepository;
    @Autowired
    private DeveloperRepository developerRepository;

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
        addDeveloper(project.getId(),developerRepository.findByName("Miguel").get(0).getId());
        //Proyecto 2
        project = new Project();
        project.setDescription("Proyecto de prueba 1");
        project.setStart_date(new Date());
        project.setEnd_date(new Date());
        projectRepository.save(project);
        manager = managerRepository.findByLastname("Gomez").get(0);
        project.setManager(manager);
        projectRepository.save(project);
        addDeveloper(project.getId(),developerRepository.findByName("Miguel").get(0).getId());
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

    //Encontrar porque no funciona un

    public Project addDeveloper(Long idProject, Long idDeveloper){

        Project project = projectRepository.findOne(idProject);
        if(project==null){
            System.out.println("No hay proyecto");
        }

        Developer developer = developerRepository.findOne(idDeveloper);
        if(developer==null){
            System.out.println("No hay developer");
        }
        if(project!=null && developer !=null){
            project.getDeveloper().add(developer);
        }else{
            System.out.println("No se ha podido hacer la unión");
        }
        projectRepository.save(project);
        return project;
    }
}
