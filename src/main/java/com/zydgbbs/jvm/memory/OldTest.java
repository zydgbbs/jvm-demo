package com.zydgbbs.jvm.memory;

public class OldTest {
    private static final int M = 1024*1024;
    public static void main(String[] args) {
        //7M时分配到老年代
        //byte[] b1 = new byte[7*M];
        //6M时分配到新生代
        //byte[] b1 = new byte[6*M];
        //必须使用Serial和ParNew两个收集器，这个-XX:PretenureSizeThreshold=6m才有效
        //通过-XX:PretenureSizeThreshold=6m的设置，可以看出6m也分配到了老年代
        //-verbose:gc -XX:+PrintGCDetails -Xms20m -Xmx20m -Xmn10m -XX:SurvivorRatio=8 -XX:+UseSerialGC -XX:PretenureSizeThreshold=6m
        byte[] b1 = new byte[6*M];
    }
}
