package com.study.code.v5;

/**
 * @author xiongxl
 * @version $Id: MethodSync.java, v 0.1 2020-12-16 Exp $$
 * @desc 同步方法
 */
public class MethodSync {

    public static synchronized void method(String name) {
        System.out.println(name + "Start a Sync Method");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + "End a Sync Method");
    }
}
