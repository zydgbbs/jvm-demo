package com.zydgbbs.jvm.tools;

public class DeadLockTest {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        new Thread(new DeadLock(obj1,obj2)).start();
        new Thread(new DeadLock(obj2,obj1)).start();
    }
}
