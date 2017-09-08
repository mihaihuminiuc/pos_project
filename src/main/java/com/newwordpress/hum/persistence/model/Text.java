package com.newwordpress.hum.persistence.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * Created by humin on 4/11/2017.
 */
@Entity
@Table(name="text")
public class Text {
    public Long getId_text() {
        return id_text;
    }

    public void setId_text(Long id_text) {
        this.id_text = id_text;
    }

    public String getText_content() {
        return text_content;
    }

    public void setText_content(String text_content) {
        this.text_content = text_content;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id_text;

    @NotEmpty
    @Column(name="TEXT_CONTENT", nullable=false)
    private String text_content;
}
