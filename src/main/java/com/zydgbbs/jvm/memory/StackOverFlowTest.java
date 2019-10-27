package com.zydgbbs.jvm.memory;

public class StackOverFlowTest {
    public static void main(String[] args) {
        new StackOverFlowTest().test();
    }
    private void test(){
        System.out.println("执行方法");
        test();
    }
}
