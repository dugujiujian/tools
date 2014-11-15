package com.dugu.core.rule.thread.consumer;

public class Customer {
    private Depot depot;

    public Customer(Depot depot) {
        this.depot = depot;
    }

    // ���Ѳ�Ʒ���½�һ���̴߳Ӳֿ������Ѳ�Ʒ��
    public void consume(final int val) {
        new Thread() {
            public void run() {
                depot.consume(val);
            }
        }.start();
    }
}
