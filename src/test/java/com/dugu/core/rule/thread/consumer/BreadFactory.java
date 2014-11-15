package com.dugu.core.rule.thread.consumer;

public class BreadFactory {

    private int     capacity; //ÈİÁ¿
    private int     count;
    private boolean flag=false;

    BreadFactory(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void product(int num) {
        while (true) {
            if (num + count > capacity) {
                count = capacity;
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("[product]add=" + num + ";count=" + count);
            } else {
                count += num;
                System.out.println("[product]add=" + num + ";count=" + count);
            }

            notifyAll();
        }
    }

    public synchronized void consume(int num) {
        while (true) {
            count = num > count ? 0 : count - num;
            if (count <= 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("[consume]consume=" + num + ";count=" + count);
            } else {
                System.out.println("[consume]consume=" + num + ";count=" + count);
            }
            notifyAll();
        }
    }

}
