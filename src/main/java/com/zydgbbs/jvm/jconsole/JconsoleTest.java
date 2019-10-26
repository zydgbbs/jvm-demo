package com.zydgbbs.jvm.jconsole;

import java.util.ArrayList;
import java.util.List;

public class JconsoleTest {

    private byte[] bytes = new byte[1024*256];//256k大小

    public static void main(String[] args) throws Exception{
        Thread.sleep(5000);
        List<JconsoleTest> list = new ArrayList<>();
        for (int i=0;i<1000;i++){
            Thread.sleep(200);
            list.add(new JconsoleTest());
        }
    }


}
