package com.dugu.core.rule.thread;

public class TestThreadRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("TestThtread is running.....name=" + Thread.currentThread().getName());
    }

}
