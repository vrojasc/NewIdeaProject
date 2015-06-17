package demo.service;

<<<<<<< HEAD
import demo.model.Category;
import demo.model.Developer;
import demo.model.Employee;
import demo.repository.DeveloperRepository;
=======
import demo.model.Employee;
>>>>>>> origin/master
import demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by poo2 on 16/06/2015.
 */

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
<<<<<<< HEAD
    @Autowired
    private DeveloperRepository developerRepository;
=======
>>>>>>> origin/master

    public void testEmployees(){
        Calendar cal = Calendar.getInstance();
        cal.set(2015,Calendar.JUNE,1);
        Date startDate = cal.getTime();
        cal.set(2015,Calendar.JUNE,30);
        Date endDate = cal.getTime();
        cal.set(2013,Calendar.APRIL,5);
        Date hiredate = cal.getTime();
<<<<<<< HEAD
        //Empleado 1
=======
>>>>>>> origin/master
        Employee employee = new Employee();
        employee.setName("Victor");
        employee.setLastname("Rojas");
        employee.setSalary(123.7);
        employee.setHireDate(hiredate);
        employeeRepository.save(employee);
<<<<<<< HEAD
        //Empleado 2
=======
>>>>>>> origin/master
        employee = new Employee();
        employee.setName("Jamal");
        employee.setLastname("Backach");
        employee.setSalary(456.9);
        employee.setHireDate(new Date(System.currentTimeMillis()));
        employeeRepository.save(employee);
<<<<<<< HEAD
        //Empleado 3
=======
>>>>>>> origin/master
        employee = new Employee();
        employee.setName("Lili");
        employee.setLastname("Valoran");
        employee.setSalary(327.23);
        employee.setHireDate(new Date(System.currentTimeMillis()));
        employeeRepository.save(employee);
        Employee trabajador = employeeRepository.findByLastname("Rojas").get(0);
        List<Employee> trabajadores = employeeRepository.findByHireDateBetween(startDate, endDate);
        for(Employee employee1 : trabajadores){
            System.out.println(employee1.toString());
        }
    }
<<<<<<< HEAD

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
            System.out.println(developer.toString());
        }
    }
=======
>>>>>>> origin/master
}
