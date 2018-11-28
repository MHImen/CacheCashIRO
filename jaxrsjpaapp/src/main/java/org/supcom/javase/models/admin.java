package org.supcom.javase.models;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
@AttributeOverride(name ="id",column = @Column(name="adminID"))
public class admin extends BaseEntity<Integer> {


    @Column(name = "passwordAdmin")
    @Size(min = 2, max = 35)
    private String passAdmin;
    @Column(name = "mailAdmin")
    @Size(min = 2, max = 35)
    private String mailAdmin;

    public String getPassAdmin() {
        return passAdmin;
    }

    public void setPassAdmin(String passAdmin) {
        this.passAdmin = passAdmin;
    }

    public String getMailAdmin() {
        return mailAdmin;
    }

    public void setMailAdmin(String mailAdmin) {
        this.mailAdmin = mailAdmin;
    }
}
