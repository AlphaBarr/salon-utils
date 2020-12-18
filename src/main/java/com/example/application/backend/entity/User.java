package com.example.application.backend.entity;

import javax.persistence.*;


@Entity
@Table(name="user_table")
public class User {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer Id;

    @Column(name="salon_name")
    private String salonName;

    @Column(name="address")
    private String address;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getFirstName() {
        return salonName;
    }

    public void setFirstName(String firstName) {
        this.salonName = firstName;
    }

    public String getLastName() {
        return address;
    }

    public void setLastName(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name="user_name")
    private String username;

    @Column(name="password")
    private String password;
}
