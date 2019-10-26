package com.zydgbbs.jvm.oom;

import java.util.ArrayList;
import java.util.List;

public class OomTest {
    public static void main(String[] args) {
        List<Object> objList = new ArrayList<>();
        int i = 0;
        while (true) {
            objList.add(new Object());
            System.out.println(++i);
        }
    }
}
