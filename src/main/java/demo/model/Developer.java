package demo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by poo2 on 17/06/2015.
 */
@Entity
@PrimaryKeyJoinColumn(name="id")
public class Developer extends Employee{
    @Column
    @Enumerated(EnumType.STRING)
    private Category category;


    @ManyToMany(mappedBy = "developer")
    private Set<Project> project = new HashSet();

    public Developer() {

    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<Project> getProject() {
        return project;
    }

    public void setProject(Set<Project> project) {
        this.project = project;
    }

    @Override
    public String toString() {
        String developer = super.toString();
        return developer + " Developer{" +
                "category=" + category +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Developer developer = (Developer) o;

        return category == developer.category;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + category.hashCode();
        return result;
    }
}
