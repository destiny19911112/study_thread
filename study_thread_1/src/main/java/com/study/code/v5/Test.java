package com.study.code.v5;

/**
 * @author xiongxl
 * @version $Id: Test.java, v 0.1 2020-12-16 Exp $$
 * @desc TODO
 */
public class Test  {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread("1号线程"));
        Thread thread2 = new Thread(new MyThread("2号线程"));
        thread1.start();
        thread2.start();
    }
}
