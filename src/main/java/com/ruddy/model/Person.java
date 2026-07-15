package com.ruddy.model;

import java.time.LocalDate;

public class Person {

    private String name;
    private String surname;
    private String identityDocument;
    private int birthYear;
    private int age;

    public Person(String name, String surname, String identityDocument, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.identityDocument = identityDocument;
        this.birthYear = birthYear;
        this.age = calculateAge();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getIdentityDocument() {
        return identityDocument;
    }

    public int getBirthYear() {
        return birthYear;
    }

    /**
     * Calcula la edad a partir del año de nacimiento.
     * Este método es privado porque únicamente se utiliza
     * dentro de la propia clase durante la inicialización
     */
    private int calculateAge() {
        return LocalDate.now().getYear() - birthYear;
    }

    public int getAge() {
        return age;
    }
}
