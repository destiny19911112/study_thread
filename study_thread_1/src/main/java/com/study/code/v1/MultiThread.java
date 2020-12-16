package com.study.code.v1;

/**
 * @author xiongxl
 * @version $Id: MultiThread.java, v 0.1 2020-12-16 Exp $$
 * @desc 多线的实现 继承 Thread 类
 */
public class MultiThread {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        for (int i=0; i<10000; i++) {
            System.out.print(i + " ");
        }
    }
}
