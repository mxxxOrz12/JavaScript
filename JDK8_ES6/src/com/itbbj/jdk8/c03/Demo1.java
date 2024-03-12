package com.itbbj.jdk8.c03;

import com.itbbj.jdk8.c02.domain.Person;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("1----set集合-------------");
        Set<String> set = new HashSet<>();
        set.add("小王");
        set.add("小张");
        set.add("小王");
        set.add("小强");
        System.out.println(set.size());
        for (String name : set) {
            System.out.println(name);
        }
        System.out.println("------------------");
        set.remove("小王");
        for (String name : set) {
            System.out.println(name);
        }
        System.out.println("------------------");
        boolean flag = set.contains("小强");
        System.out.println(flag);
        set.clear();
        System.out.println(set);

        System.out.println("2----map集合-------------");
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"王强");
        map.put(2,"陈小二");
        map.put(3,"王强");

        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println("--------------");
        map.forEach((key, value) -> System.out.println(key+" "+value));
        System.out.println("--------------");
        map.remove(3);
        map.forEach((key, value) -> System.out.println(key+" "+value));
        map.clear();
        System.out.println(map);

    }
}
