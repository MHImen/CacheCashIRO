package org.supcom.javase.models;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Size;
import java.util.Map;
import java.util.Set;

@Entity
@AttributeOverride(name ="id",column = @Column(name="dailyPurchaseID"))
public class dailyPurchase extends BaseEntity<Integer> {
    @Column(name = "container")
    private Map<article,Integer> container ;

    @Column(name = "totalDailyCost")
    private float totalDailyCost  ;

    public Map<article, Integer> getContainer() {
        return container;
    }

    public void setContainer(Map<article, Integer> container) {
        this.container = container;
    }

    public float getTotalDailyCost() {
        return totalDailyCost;
    }

    public void setTotalDailyCost(float totalDailyCost) {
        this.totalDailyCost = totalDailyCost;
    }
}
