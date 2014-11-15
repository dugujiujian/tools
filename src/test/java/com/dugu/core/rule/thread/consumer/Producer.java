package com.dugu.core.rule.thread.consumer;


public class Producer {
    private Depot depot;

    public Producer(Depot depot) {
        this.depot = depot;
    }

    // ���Ѳ�Ʒ���½�һ���߳���ֿ���������Ʒ��
    public void produce(final int val) {
        new Thread() {
            public void run() {
                depot.produce(val);
            }
        }.start();
    }   
}
