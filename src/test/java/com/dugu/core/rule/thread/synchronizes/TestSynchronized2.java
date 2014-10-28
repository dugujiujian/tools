package com.dugu.core.rule.thread.synchronizes;

public class TestSynchronized2 extends Thread {

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("Name=" + Thread.currentThread().getName());
            new TestSynchronized().add();
        }
    }

}
