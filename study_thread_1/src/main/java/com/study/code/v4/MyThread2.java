package com.study.code.v4;

/**
 * @author xiongxl
 * @version $Id: MyThread2.java, v 0.1 2020-12-16 Exp $$
 * @desc 我的线程2
 */
public class MyThread2 implements Runnable {

    private String name;

    public MyThread2(String name) {
        this.name = name;
    }

    public void run() {
        try {
            HelloWorld.sayHello(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
