package demo.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by poo2 on 16/06/2015.
 */

@Entity
//Clases del modelo

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String lastname;
    private Double salary;

    @Temporal(TemporalType.DATE)
    private Date hireDate;

    public Employee() {

    }

    public Employee(String name, String lastname, Double salary, Date hireDate) {
        this.name = name;
        this.lastname = lastname;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (!id.equals(employee.id)) return false;
        if (!name.equals(employee.name)) return false;
        if (!lastname.equals(employee.lastname)) return false;
        if (!salary.equals(employee.salary)) return false;
        return hireDate.equals(employee.hireDate);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + lastname.hashCode();
        result = 31 * result + salary.hashCode();
        result = 31 * result + hireDate.hashCode();
        return result;
    }
}
