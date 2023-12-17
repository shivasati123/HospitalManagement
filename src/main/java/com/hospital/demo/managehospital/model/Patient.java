package com.hospital.demo.managehospital.model;


import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Entity
@Table(name = "patient_info")
public class Patient {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCovidStatus() {
        return covidStatus;
    }

    public void setCovidStatus(String covidStatus) {
        this.covidStatus = covidStatus;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id ;

    @Column
    String name;

    @Column
    String city;

    @Column
    String email;

    @Column
    String phone;

    @Column
    String covidStatus;

    @Column
    @CreationTimestamp
    Timestamp createdAt;


    public Patient(Integer id, String name, String city, String email, String phone, String covidStatus, Timestamp createdAt) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.email = email;
        this.phone = phone;
        this.covidStatus = covidStatus;
        this.createdAt = createdAt;
    }
}
