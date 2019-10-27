package com.zydgbbs.jvm.gc;

//引用计数法的验证
public class GcTest {

    private Object instance;

    public GcTest(){
        byte[] m = new byte[20 * 1024 * 1024];
    }

    public static void main(String[] args) {
        System.out.println("-verbose:gc -xx:+PrintGCDetail");
        GcTest g1 = new GcTest();
        GcTest g2 = new GcTest();

        g1.instance = g2;
        g2.instance = g1;

        g1 = null;
        g2 = null;

        System.gc();
        /**
         * 打印出来的结果是：PSYoungGen: 46208K->592K(76288K)
         * 说明用的gc算法不是引用计数法，否则的话，应该有40M左右的大小未被回收
         */

    }
}
