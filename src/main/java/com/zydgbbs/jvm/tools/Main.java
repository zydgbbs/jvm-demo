package com.zydgbbs.jvm.tools;

import java.util.Map;

public class Main {
    //打印线程的一些信息，和jstack的输出信息类似
    public static void main(String[] args) {
        Map<Thread,StackTraceElement[]> m = Thread.getAllStackTraces();
        for(Map.Entry<Thread,StackTraceElement[]> en: m.entrySet()){
            Thread t = en.getKey();
            StackTraceElement[] v = en.getValue();
            System.out.println("Thread name is "+ t.getName());
            for (StackTraceElement s : v){
                System.err.println("\t" + s.toString());
            }
        }
    }
}
