package com.itbbj.jdk8.c01;

public class Demo1 {
    public static void main(String[] args) {
        final int MAX = 100;
        System.out.println(MAX);
        System.out.println(add(1,2,3,4,5));
    }

    //可变参数
    public static int add(int ...num){
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        return sum;
    }

}
