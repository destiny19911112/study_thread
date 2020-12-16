package com.study.code.v4;

/**
 * @author xiongxl
 * @version $Id: TestSync.java, v 0.1 2020-12-16 Exp $$
 * @desc TODO
 */
public class TestSync {


    public static void main(String[] args) throws InterruptedException{
        MyThread1 myThread1 = new MyThread1("11111");
        myThread1.start();
        Thread myThread2 = new Thread(new MyThread2("22222"));
        myThread2.start();
        //Thread.sleep(1000);
        /*MyThread1 myThread3 = new MyThread1("33333");
        myThread3.start();*/
        MyThread3 myThread3 = new MyThread3("33333");
        myThread3.start();
    }
}
