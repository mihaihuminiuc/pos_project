package com.newwordpress.hum.persistence.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * Created by humin on 4/11/2017.
 */
@Entity
@Table(name="rights")
public class Rights {
    public Long getId_right() {
        return id_right;
    }

    public void setId_right(Long id_right) {
        this.id_right = id_right;
    }

    public String getMethod_name() {
        return method_name;
    }

    public void setMethod_name(String method_name) {
        this.method_name = method_name;
    }

    public String getRight_name() {
        return right_name;
    }

    public void setRight_name(String right_name) {
        this.right_name = right_name;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id_right;

    @NotEmpty
    @Column(name="RIGHT_NAME", nullable=false)
    private String right_name;

    @NotEmpty
    @Column(name="METHOD_NAME", nullable=false)
    private String method_name;

}
