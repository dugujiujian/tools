package com.dugu.core.rule.thread.consumer;

public class BreakProductor extends Thread {

    private BreadFactory breadFactory;

    BreakProductor(BreadFactory breadFactory) {
        this.breadFactory = breadFactory;
    }

    public void product(final int val) {

        new Thread() {
            @Override
            public void run() {
                breadFactory.product(val);
            }
        }.start();

    }

}
