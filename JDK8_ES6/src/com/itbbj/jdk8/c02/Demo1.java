package com.itbbj.jdk8.c02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

public class Demo1 {
    public static void main(String[] args) {
//        可以省略的内容:
//        1.(参数列表):括号中参数列表的数据类型,可以省略不写
//        2.(参数列表):括号中的参数如果只有一个,那么类型和()都可以省略
//        3.{一些代码}:如果{}中的代码只有一行,无论是否有返回值,都可以省略({},return,分号)
//        注意:要省略{},return,分号必须一起省略

        Runnable runnable = () -> System.out.println("新线程");

        Function<String,String> function1 = (String str)->{
            return str.toUpperCase();
        };

        Function<String,String> function2 = str -> str.toUpperCase();

        ArrayList<Integer> integers = new ArrayList<>();
        Collections.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        Collections.sort(integers, (o1, o2) -> o2 - o1);

    }
}
