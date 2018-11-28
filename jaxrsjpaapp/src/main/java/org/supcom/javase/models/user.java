package org.supcom.javase.models;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.sql.Date;

@Entity
@NamedQuery()
@AttributeOverride(name ="id",column = @Column(name="userID"))
public class user extends BaseEntity<Integer>{
    @Column(name = "userName")
    @Size(min = 2, max = 25)
    private String userName;
    @ManyToOne
    @JoinColumn(name = "budgetID",referencedColumnName = "budgetID",insertable = false,updatable = false)
    private budget budget ;
    @Column(name = "userMail")
    @Size(min = 2, max = 25)
    private String userMail;
    @Column(name = "userBirthday")
    @Size(min = 2, max = 25)
    private Date userBirthday;
    @Column(name = "userPassword")
    @Size(min = 2, max = 25)
    private String userPassword;
    @Column(name = "userGender")
    @Size(min = 2, max = 25)
    private Gender userGender;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Gender getUserGender() {
        return userGender;
    }

    public void setUserGender(Gender userGender) {
        this.userGender = userGender;
    }

}