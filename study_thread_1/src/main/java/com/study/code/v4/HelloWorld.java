package com.study.code.v4;

/**
 * @author xiongxl
 * @version $Id: HelloWorld.java, v 0.1 2020-12-16 Exp $$
 * @desc TODO
 */
public class HelloWorld {

    public static synchronized void sayHello(String name) throws InterruptedException{
        for (int i=0; i<10; i++) {
            Thread.sleep(100);
            System.out.println(name + ":【" + i + "】");
        }
    }
}
