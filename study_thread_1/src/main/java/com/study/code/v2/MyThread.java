package com.study.code.v2;

/**
 * @author xiongxl
 * @version $Id: MyThread1.java, v 0.1 2020-12-16 Exp $$
 * @desc 子线程 实现 Runnable 接口
 */
public class MyThread implements Runnable {

    public void run() {
        for (int i=0; i< 10000; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
}
