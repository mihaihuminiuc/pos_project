package com.newwordpress.hum.persistence.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * Created by humin on 4/11/2017.
 */
@Entity
@Table(name="page_content")
public class Text {

    public Long getIdText() {
        return idText;
    }

    public void setIdText(Long idText) {
        this.idText = idText;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getPageName() {
        return pageName;
    }

    public void setPageName(int pageName) {
        this.pageName = pageName;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idText;

    @NotEmpty
    @Column(name="PAGE_CONTENT", nullable=false)
    private String textContent;

    @NotEmpty
    @Column(name="PAGE_AUTHOR", nullable=false)
    private int authorId;

    @NotEmpty
    @Column(name="PAGE_NAME", nullable=false)
    private int pageName;

}
