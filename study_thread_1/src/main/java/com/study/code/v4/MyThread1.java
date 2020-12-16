package com.study.code.v4;

/**
 * @author xiongxl
 * @version $Id: MyThread1.java, v 0.1 2020-12-16 Exp $$
 * @desc 我的线程1
 */
public class MyThread1 extends Thread {

    private String name;

    public MyThread1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            HelloWorld.sayHello(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
