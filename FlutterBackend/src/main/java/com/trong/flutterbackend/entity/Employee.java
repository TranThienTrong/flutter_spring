package com.trong.flutterbackend.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="employee")
public class Employee {
    /*____________ ID ____________*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /*____________ Full Name ____________*/
    @Column(name = "fullname", nullable = false)
    String fullName;

    /*____________ Gender ____________*/
    @Column(name = "gender", nullable = false)
    String gender;

    /*____________ Mobile Number ____________*/
    @Column(name = "mobile_number", nullable = false)
    String mobileNumber;

    /*____________ Address ____________*/
    @Column(name = "address", nullable = false)
    String address;

    @Column(name = "birthdate", nullable = false)
    LocalDate birthdate;



    public Employee(String fullName, String gender, String mobileNumber, String address, LocalDate birthdate) {
        this.fullName = fullName;
        this.gender = gender;
        this.mobileNumber = mobileNumber;
        this.address = address;
        this.birthdate = birthdate;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Employee() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}