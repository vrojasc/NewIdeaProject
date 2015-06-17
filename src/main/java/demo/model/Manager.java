package demo.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * Created by poo2 on 17/06/2015.
 */
@Entity
@PrimaryKeyJoinColumn(name="id")
public class Manager extends Employee{

    private Double bonusSuccess;

    public Manager() {

    }

    public Double getBonusSuccess() {
        return bonusSuccess;
    }

    public void setBonusSuccess(Double bonusSuccess) {
        this.bonusSuccess = bonusSuccess;
    }

    @Override
    public String toString() {
        String manager = super.toString();
        return  manager + " Manager{" +
                "bonusSuccess=" + bonusSuccess +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Manager manager = (Manager) o;

        return bonusSuccess.equals(manager.bonusSuccess);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + bonusSuccess.hashCode();
        return result;
    }
}
