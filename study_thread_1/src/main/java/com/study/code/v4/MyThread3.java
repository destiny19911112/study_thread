package com.study.code.v4;

/**
 * @author xiongxl
 * @version $Id: MyThread3.java, v 0.1 2020-12-16 Exp $$
 * @desc TODO
 */
public class MyThread3 extends Thread {
    private String name;

    public MyThread3(String name) {
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
