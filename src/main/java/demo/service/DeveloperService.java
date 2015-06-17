package demo.service;

import demo.model.Category;
import demo.model.Developer;
import demo.repository.DeveloperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by poo2 on 17/06/2015.
 */
@Service
public class DeveloperService {
    @Autowired
    private DeveloperRepository developerRepository;

    public void testDevelopers(){
        //Desarrollador 1
        Developer developer = new Developer();
        developer.setName("Vincent");
        developer.setLastname("Van Vuren");
        developer.setSalary(1234.5);
        developer.setHireDate(new Date());
        developer.setCategory(Category.SENIOR);
        developerRepository.save(developer);
        //Desarollador 2
        developer = new Developer();
        developer.setName("Josua");
        developer.setLastname("Jean Jonson");
        developer.setSalary(5431.7);
        developer.setHireDate(new Date());
        developer.setCategory(Category.JUNIOR);
        developerRepository.save(developer);
        List<Developer> desarrolladores = developerRepository.findByCategory(Category.JUNIOR);
        for(Developer developer1 : desarrolladores){
            System.out.println(developer1.toString());
        }
    }
}
