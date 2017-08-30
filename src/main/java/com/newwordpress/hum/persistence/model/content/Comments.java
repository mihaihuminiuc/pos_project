package com.newwordpress.hum.persistence.model.content;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by humin on 4/11/2017.
 */
@Entity
@Table(name="comments")
public class Comments {
    public Long getId_comment() {
        return id_comment;
    }

    public void setId_comment(Long id_comment) {
        this.id_comment = id_comment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id_comment;

    @NotEmpty
    @Column(name="COMMENT", nullable=false)
    private String comment;

    @NotEmpty
    @Column(name="DATE", nullable=false)
    private Date date;

    @NotEmpty
    @Column(name="STATUS", nullable=false)
    private String status;
}
