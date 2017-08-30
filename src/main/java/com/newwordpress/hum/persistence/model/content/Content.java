package com.newwordpress.hum.persistence.model.content;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by humin on 4/11/2017.
 */
@Entity
@Table(name="content")
public class Content {
    public Long getId_content() {
        return id_content;
    }

    public void setId_content(Long id_content) {
        this.id_content = id_content;
    }

    public String getPost_title() {
        return post_title;
    }

    public void setPost_title(String post_title) {
        this.post_title = post_title;
    }

    public String getPost_author() {
        return post_author;
    }

    public void setPost_author(String post_author) {
        this.post_author = post_author;
    }

    public Date getPost_date() {
        return post_date;
    }

    public void setPost_date(Date post_date) {
        this.post_date = post_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id_content;

    @NotEmpty
    @Column(name="POST_TILE", nullable=false)
    private String post_title;

    @NotEmpty
    @Column(name="POST_AUTHOR", nullable=false)
    private String post_author;


    @NotEmpty
    @Column(name="POST_DATE", nullable=false)
    private Date post_date;

    @NotEmpty
    @Column(name="STATUS", nullable=false)
    private String status;
}
