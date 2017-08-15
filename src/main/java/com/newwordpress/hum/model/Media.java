package com.newwordpress.hum.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by humin on 4/11/2017.
 */
@Entity
@Table(name="media")
public class Media {
    public Long getId_media() {
        return id_media;
    }

    public void setId_media(Long id_media) {
        this.id_media = id_media;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Date getPath() {
        return path;
    }

    public void setPath(Date path) {
        this.path = path;
    }

    public String getExternsion() {
        return externsion;
    }

    public void setExternsion(String externsion) {
        this.externsion = externsion;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id_media;

    @NotEmpty
    @Column(name="FILENAME", nullable=false)
    private String filename;

    @NotEmpty
    @Column(name="PATH", nullable=false)
    private Date path;

    @NotEmpty
    @Column(name="EXTENSION", nullable=false)
    private String externsion;
}
