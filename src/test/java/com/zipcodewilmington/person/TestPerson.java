package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        Float expectedWeight = Float.MAX_VALUE;
        // When
        Person person = new Person();
        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        Float actualWeight = person.getWeight();
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedWeight, actualWeight);
    }
    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";
        // When
        Person person = new Person(expected);
        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;
        // When
        Person person = new Person(expected);
        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithWeight() {
        // Given
        Float expected = 20.0f;
        // When
        Person person = new Person(expected);
        // Then
        Float actual = person.getWeight();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
        // When
        Person person = new Person(expectedAge, expectedName);
        /* Then */
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";
        // When
        person.setName(expected);
        String actual = person.getName();
        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;
        // When
        person.setAge(expected);
        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetWeight() {
        // Given
        Person person = new Person();
        Float expected = 160f;
        // When
        person.setWeight(expected);
        // Then
        Float actual = person.getWeight();
        Assert.assertEquals(expected, actual);
    }
}
