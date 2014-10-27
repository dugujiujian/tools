package com.dugu.core.rule.thread.join;

public class TestThreadJoin2 extends Thread {

    private TestThreadJoin t1;

    public TestThreadJoin2(TestThreadJoin t1) {
        super("[TestThreadJoin2] Thread");
        this.t1 = t1;
    }

    @Override
    public void run() {

        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " start.");
        try {
            t1.join();
            System.out.println(threadName + " end.");
        } catch (Exception e) {
            System.out.println("Exception from " + threadName + ".run");
        }
    }
}
 