package com.study.code.v3;

/**
 * @author xiongxl
 * @version $Id: TestSleep.java, v 0.1 2020-12-16 Exp $$
 * @desc Java 中线程的暂停是调用java.lang.Thread类的Sleep方法（注意是类方法）。
 *       该方法会使当前正在执行的线程暂停指定的时间，如果线程持有锁，sleep方法结束前并不会释放该锁。
 */
public class TestSleep {

    public static void main(String[] args) throws InterruptedException{
        for (int i=0; i<10; i++) {
            Thread.sleep(1000);
            System.out.println(i);
        }
    }
}
