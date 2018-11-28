package org.supcom.javase.models;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Size;
import java.sql.Date;

@Entity
@AttributeOverride(name ="id",column = @Column(name="messageID"))
public class Message extends BaseEntity<Integer> {
    @Column(name = "creationDate")
    private Date creationDate;
    @Column(name = "content")
    @Size(min = 2, max = 25)
    private String content;

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}