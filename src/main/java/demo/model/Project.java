package demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by poo2 on 17/06/2015.
 */
@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    String description;

    @NotNull
    @Column(name = "start_date")
    private Date start_date;

    @Column(name = "end_date")
    private Date end_date;



    @ManyToOne
    private Manager manager;

    @JsonIgnore
    @ManyToMany
    private Set<Developer> developer = new HashSet();

    public Project() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public Set<Developer> getDeveloper() {
        return developer;
    }

    public void setDeveloper(Set<Developer> developer) {
        this.developer = developer;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
