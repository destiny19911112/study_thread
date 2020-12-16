package com.study.code.v2;

/**
 * @author xiongxl
 * @version $Id: MultiThread.java, v 0.1 2020-12-16 Exp $$
 * @desc 多线程 实现 Runnable接口
 */
public class MultiThread {

    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        thread.start();
        for (int i=0; i<10000; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
}
