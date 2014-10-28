package com.dugu.core.rule.thread.synchronizes;

public class TestSynchronized {

    private Object    o   = new Object();
    private Object    o2  = new Object();

    public static int num = 0;

    public synchronized void add() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        num++;

        System.out.println("[T] num=" + num);
    }

    public static synchronized void sub() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        num--;

        System.out.println("[T] num=" + num);
    }

    public void add2() {
        synchronized (this) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            num++;

            System.out.println("[T] num=" + num);
        }
    }

    public static void sub2() {
        synchronized (TestMethodSynchronized.class) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            num--;

            System.out.println("[T] num=" + num);
        }
    }

}
