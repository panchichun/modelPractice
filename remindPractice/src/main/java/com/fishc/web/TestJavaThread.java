package com.fishc.web;

public class TestJavaThread implements Runnable {

    int b = 100;

    synchronized void m1() throws InterruptedException {
        b = 1000;
        Thread.sleep(500);
        System.out.println("b= " + b);
    }

    synchronized void m2() throws InterruptedException {
        Thread.sleep(250);
        b = 2000;
    }

    public static void main(String args[]) throws InterruptedException {
        TestJavaThread testJavaThread = new TestJavaThread();
        Thread t= new Thread();
        t.start();

        testJavaThread.run();

        testJavaThread.m2();
        System.out.println("main thread b= " + testJavaThread.b);
    }

    @Override
    public void run() {
        try {
            m1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
