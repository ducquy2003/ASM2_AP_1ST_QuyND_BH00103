package org.example.core;

import java.util.Date;

public abstract class Person {
    private int id;
    private String name;
    private String address;
    private String phone;
    private String personID ;
    private Date birthDate;
    private String email;

    public Person(){

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person(int id, String name, String address, String phone, String personID, Date birthDate, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.personID = personID;
        this.birthDate = birthDate;
        this.email = email;
    }

    public abstract void notification();
}
