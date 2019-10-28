package com.zydgbbs.jvm.clazz;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class ScriptEngineManagerTest {
    public static void main(String[] args) throws Exception{
        ScriptEngineManager sem = new ScriptEngineManager();
        ScriptEngine se = sem.getEngineByName("JavaScript");
        Object obj = se.eval("function add(a,b){return a+b;} add(2,3);");
        System.out.println(obj);
    }
}
