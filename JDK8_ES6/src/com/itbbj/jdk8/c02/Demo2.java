package com.itbbj.jdk8.c02;

import com.itbbj.jdk8.c02.domain.Person;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        Person person1 = new Person("刘德华", 58);
        Person person2 = new Person("张学友", 60);
        Person person3 = new Person("郭富城", 54);
        Person person4 = new Person("黎明", 54);
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);

        persons.forEach(person -> System.out.println(person.getName()));

        System.out.println("----------------------");
        ArrayList<Person> personList1 = persons.stream()
                .filter(person -> person.getAge() > 55)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(personList1);

        System.out.println("----------------------");
        ArrayList<String> nameList1 = persons.stream()
                .map(person -> person.getName() + "的女人")
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(nameList1);

        System.out.println("----------------------");
        ArrayList<String> nameList2 = persons.stream()
                .filter(person -> person.getAge() > 55)
                .map(person -> person.getName() + "的女人")
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(nameList2);

        System.out.println("----------------------");
        boolean flag1 = persons.stream().allMatch(person -> person.getAge() > 55);
        boolean flag2 = persons.stream().anyMatch(person -> person.getAge() > 55);
        System.out.println(flag1);
        System.out.println(flag2);

        System.out.println("----------------------");
        Integer result = persons.stream()
                .map(person -> person.getAge())
                .reduce(0, (a, b) -> a + b);
        System.out.println("年龄总和="+result);

    }
}
