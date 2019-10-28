package com.zydgbbs.jvm.clazz;

public class Demo {
    static {
        i=0;
        //可以赋值，但不能访问，只能访问定义之前的变量
        //System.out.println(i);
    }
    static int i = 1;
    public static void main(String[] args) {

    }
}
