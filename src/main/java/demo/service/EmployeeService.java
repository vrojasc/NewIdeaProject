package demo.service;

import demo.model.Employee;
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


    public void testEmployees(){
        Calendar cal = Calendar.getInstance();
        cal.set(2015,Calendar.JUNE,1);
        Date startDate = cal.getTime();
        cal.set(2015,Calendar.JUNE,30);
        Date endDate = cal.getTime();
        cal.set(2013,Calendar.APRIL,5);
        Date hiredate = cal.getTime();
        //Empleado 1
        Employee employee = new Employee();
        employee.setName("Victor");
        employee.setLastname("Rojas");
        employee.setSalary(123.7);
        employee.setHireDate(hiredate);
        employeeRepository.save(employee);
        //Empleado 2
        employee = new Employee();
        employee.setName("Jamal");
        employee.setLastname("Backach");
        employee.setSalary(456.9);
        employee.setHireDate(new Date(System.currentTimeMillis()));
        employeeRepository.save(employee);
        //Empleado 3
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


}
