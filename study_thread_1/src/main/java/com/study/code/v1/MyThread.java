package com.study.code.v1;

/**
 * @author xiongxl
 * @version $Id: MyThread1.java, v 0.1 2020-12-16 Exp $$
 * @desc 子线程 继承 Thread
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i=0; i<10000; i++) {
            System.out.print(i + " ");
        }
    }
}
