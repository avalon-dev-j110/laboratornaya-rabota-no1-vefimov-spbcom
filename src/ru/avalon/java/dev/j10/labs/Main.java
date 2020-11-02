package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.commons.Address;
import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.models.Person;

public class Main {
    public static void main(String[] args) {
        Person ivanov = new Person(new Passport(new Address("Омск", "улица Ленина", 12, 4), "Иванов", "Иван", "Иванович", null), 89119999999l);
        System.out.println(ivanov.getFullName());
        System.out.println(ivanov.getAddress());

        Person smith = new Person(new Passport(new Address("London", "Baker Street", 10, 2), "Smith", "John", null, "Edward"), 485596965l);
        System.out.println(smith.getFullName());
        System.out.println(smith.getAddress());
    }
}
