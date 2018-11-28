package org.supcom.javase.models;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@AttributeOverride(name ="id",column = @Column(name="budgetID"))
public class budget extends BaseEntity<Integer>{

    @Column(name = "salary")
    private float salary;
    @Column(name = "goal")
    private float goal;
    @Column(name = "remainingAmmount")
    private float remainingAmmount;

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getGoal() {
        return goal;
    }

    public void setGoal(float goal) {
        this.goal = goal;
    }

    public float getRemainingAmmount() {
        return remainingAmmount;
    }

    public void setRemainingAmmount(float remainingAmmount) {
        this.remainingAmmount = remainingAmmount;
    }
}
