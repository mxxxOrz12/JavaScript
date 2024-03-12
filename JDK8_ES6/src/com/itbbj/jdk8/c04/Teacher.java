package com.itbbj.jdk8.c04;

public class Teacher extends Person{
    private String edu;

    public Teacher(){

    }

    public Teacher(int id, String name, String edu) {
        super(id, name);
        this.edu = edu;
    }

    @Override
    public void eat() {
        System.out.println("教师在吃饭");
    }

    public void teach(){
        super.eat();
        System.out.println("教师教书");
    }
}
