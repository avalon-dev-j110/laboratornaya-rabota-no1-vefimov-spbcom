package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

public class Person {
 private Passport passport;
 private long phone;

    public Person (Passport passport, long phone){
        this.passport = passport;
        this.phone = phone;
    }

    public String getFullName() {
        Passport p = getPassport();
        String fullName = null;
        if (p.getSurName() == null && p.getSecondName() == null){
            fullName = p.getLastName() + " " + p.getFirstName();
        }
        else if (p.getSurName() == null) {
            char initial = p.getSecondName().charAt(0);
            fullName = p.getFirstName() + " " + initial + ". " + p.getLastName();
        }
        else fullName = p.getLastName() + " " + p.getFirstName() + " " + p.getSurName();
        return fullName;
    }

    public String getAddress() {
        Address a = getPassport().getAddress();
        String address = null;
        address = a.getCity() +", " + a.getStreet() + " " + a.getHouse() + ", " + a.getFlat();
        return address;
    }

    public Passport getPassport() {
        return passport;
    }

   /* public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    } */
}