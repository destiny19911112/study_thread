package com.study.code.v5;

/**
 * @author xiongxl
 * @version $Id: MyThread.java, v 0.1 2020-12-16 Exp $$
 * @desc TODO
 */
public class MyThread implements Runnable {

    private String name;

    private MethodSync methodSync = new MethodSync();

    public MyThread(String name) {
        this.name = name;
    }

    public void run() {
        methodSync.method(name);
    }
}
