package demo.repository;

import demo.model.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by poo2 on 16/06/2015.
 */
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long>{
    public List<Employee> findByLastname(@Param("lastname") String lastname);

    public List<Employee> findByHireDateBetween(@Param("start") Date start,@Param("end") Date end);

}
