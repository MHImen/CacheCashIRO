package org.supcom.javase.models;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@AttributeOverride(name ="id",column = @Column(name="articleID"))
public class article extends BaseEntity<Integer> {
    @Column(name = "articleName")
    @Size(min = 2, max = 35)
    private String articleName;
    @Column(name = "articlePrice")
    private float articlePrice ;
    @Column(name = "purchaseDate")
    private Date purchaseDate ;
    @Column(name = "fixed")
    private boolean fixed ;

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public float getArticlePrice() {
        return articlePrice;
    }

    public void setArticlePrice(float articlePrice) {
        this.articlePrice = articlePrice;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public boolean isFixed() {
        return fixed;
    }

    public void setFixed(boolean fixed) {
        this.fixed = fixed;
    }
}