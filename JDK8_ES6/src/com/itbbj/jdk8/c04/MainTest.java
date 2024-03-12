package com.itbbj.jdk8.c04;

public class MainTest {
    public static void main(String[] args) {
        Person person = new Person(1, "王小强");
        person.eat();
        System.out.println(Person.count);
        System.out.println(person.count);


        Teacher teacher = new Teacher(1,"王强","博士");
        teacher.eat();
        teacher.teach();
    }
}
