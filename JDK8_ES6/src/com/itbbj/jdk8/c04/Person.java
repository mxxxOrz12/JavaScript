package com.itbbj.jdk8.c04;

public class Person {
    private int id;
    private String name;

    public static int count = 0;

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

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void eat(){
        System.out.println(this.name+"在吃饭");
    }

}
