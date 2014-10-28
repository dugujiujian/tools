package com.dugu.core.rule.thread.synchronizes;

public class TestMethodSynchronized extends Thread {

    private TestSynchronized ts;

    TestMethodSynchronized() {
    }

    TestMethodSynchronized(TestSynchronized ts) {
        this.ts = ts;
    }

    @Override
    public void run() {

        System.out.println("Thread Name=" + Thread.currentThread().getName());
        ts.sub();
    }
}
