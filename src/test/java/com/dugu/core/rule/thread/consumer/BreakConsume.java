package com.dugu.core.rule.thread.consumer;

public class BreakConsume {

    private BreadFactory breadFactory;

    BreakConsume(BreadFactory breadFactory) {
        this.breadFactory = breadFactory;
    }

    public void consume(final int val) {

        new Thread() {
            @Override
            public void run() {
                breadFactory.consume(val);
            }
        }.start();

    }

}
