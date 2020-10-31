package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

public class Passport {
    private long serial;
    private String firstName;
    private String lastName;
    private String surName;
    private String secondName;
    private String birthday;
    private String issueDate;
    private String issuedBy;
    private Address address;

    public Passport(String lastName, String firstName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Passport(Address address, String lastName, String firstName, String surName, String secondName) {
        this.address = address;
        this.firstName = firstName;
        this.lastName = lastName;
        this.surName = surName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getSurName() {
        return surName;
    }
    public String getSecondName() {
        return secondName;
    }
    public Address getAddress() {
        return address;
    }
   /* public void setAddress(Address address) {
        this.address = address;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    } */
}
