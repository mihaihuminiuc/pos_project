package com.newwordpress.hum.persistence.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="user_data")
public class UserData implements Serializable {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="user_data_id", nullable=false)
    private Long id;

    @NotEmpty
    @Column(name="firstname", nullable=false)
    private String firstName;

    @NotEmpty
    @Column(name="lastname", nullable=false)
    private String lastName;

    @NotEmpty
    @Column(name="email", nullable=false)
    private String email;

    @NotEmpty
    @Column(name="description", nullable=false)
    private String description;

    @NotEmpty
    @Column(name="picture", nullable=false)
    private String picture;

    @OneToOne(optional=false)
    @JoinColumn(name = "user_id")
    private User user;


}