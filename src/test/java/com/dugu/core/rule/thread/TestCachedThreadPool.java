package com.dugu.core.rule.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCachedThreadPool {
    public static   void main(String[] args) {
        //����һ�������ù̶��߳������̳߳�
        ExecutorService pool = Executors.newCachedThreadPool();
        //����ʵ����Runnable�ӿڶ���Thread����ȻҲʵ����Runnable�ӿ�
        Thread t1 = new TestThread();
        Thread t2 = new TestThread();
        Thread t3 = new TestThread();
        Thread t4 = new TestThread();
        Thread t5 = new TestThread();
        //���̷߳�����н���ִ��
        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);
        pool.execute(t4);
        pool.execute(t5);
        //�ر��̳߳�
        pool.shutdown();
    }
}
