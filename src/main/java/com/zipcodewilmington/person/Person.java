package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name ="";
    private int age=Integer.MAX_VALUE;
    private float weight=Float.MAX_VALUE;
    public Person(String name, int age,  float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public Person(){

    }
    public Person(int age) {
        this.age = age;
    }
    public Person(float weight) {
        this.weight = weight;
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

    public void setWeight(float weight) {
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }

    public Float getWeight() {
        return weight;
    }
}


