package com.ruddy.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {

    private Person person;

    @BeforeEach
    void setUp() {
        person = new Person(
                "Ruddy",
                "Cruz",
                "12345678A",
                1995);
    }

    @Test
    void shouldStoreNameWhenPersonIsCreated() {

        // When
        String result = person.getName();

        // Then
        assertEquals("Ruddy", result);
    }

    @Test
    void shouldStoreSurnameWhenPersonIsCreated() {

        String result = person.getSurname();

        assertEquals("Cruz", result);
    }

    @Test
    void shouldStoreIdentityDocumentWhenPersonIsCreated() {

        String result = person.getIdentityDocument();

        assertEquals("12345678A", result);
    }

    @Test
    void shouldStoreBirthYearWhenPersonIsCreated() {

        int result = person.getBirthYear();

        assertEquals(1995, result);
    }

    @Test
    void shouldCalculateAgeFromBirthYear() {

        int result = person.getAge();

        assertEquals(31, result);
    }
}