package demo.model;

import javax.persistence.*;

/**
 * Created by poo2 on 17/06/2015.
 */
@Entity
@PrimaryKeyJoinColumn(name="id")
public class Developer extends Employee{
    @Column
    @Enumerated(EnumType.STRING)
    private Category category;

    public Developer() {

    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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
