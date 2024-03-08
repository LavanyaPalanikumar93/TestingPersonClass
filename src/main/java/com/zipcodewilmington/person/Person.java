package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name ="";
    private int age=Integer.MAX_VALUE;
    private String gender ="";
    private int weight=Integer.MAX_VALUE;
    public Person(String name, int age, String gender, int weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }
    public Person(){

    }
    public Person(int age) {
        this.age = age;
    }
    public Person(String name) {
         this.name = name;
    }

    public Person(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getName() {
        return this.name;
    }
    public Integer getAge() {
        return this.age;
    }
    public String getGender() {
        return this.gender;
    }
    public Integer getWeight() {
        return this.weight;
    }
}


