package org.supcom.javase.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Size;
@Entity
public class Statistics extends BaseEntity<Integer>{
    @Column(name = "statistiqueType")
    @Size(min = 2, max = 25)
    private Gender statistiqueType;

    public Gender getStatistiqueType() {
        return statistiqueType;
    }

    public void setStatistiqueType(Gender statistiqueType) {
        this.statistiqueType = statistiqueType;
    }
}