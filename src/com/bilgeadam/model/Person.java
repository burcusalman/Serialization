package com.bilgeadam.model;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;
    private boolean isAlive;

    public Person(String name, int age, boolean isAlive) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }

    @Override
    public String toString(){
        return "name: " +name+
                ", age: "+age+
                ", isAlive: "+isAlive;
    }


}
