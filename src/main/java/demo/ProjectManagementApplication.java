package demo;

import demo.service.DeveloperService;
import demo.service.EmployeeService;
import demo.service.ManagerService;
import demo.service.ProjectService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ProjectManagementApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(ProjectManagementApplication.class, args);
        EmployeeService employeeService = context.getBean(EmployeeService.class);
        employeeService.testEmployees();
        DeveloperService developerService = context.getBean(DeveloperService.class);
        developerService.testDevelopers();
        ManagerService managerService = context.getBean(ManagerService.class);
        managerService.testManagers();
        ProjectService projectService = context.getBean(ProjectService.class);
        projectService.testProject();
    }
}
