package com.dugu.core.rule.thread.synchronizes;

public class TestSynchronizedDemo {

    public static void main(String[] args) {

        
   
        
        Thread t = new TestSynchronized2();
        Thread t2 = new TestSynchronized2();

        t.start();
        t2.start();
        
//        
//        TestSynchronized2 ts = new TestSynchronized2();
//        
//        
//        
//        Thread tt = new Thread(ts,"a");
//        Thread tt2 = new Thread(ts,"b");
//        
//        tt.start();
//        
//        tt2.start();
        
    }
}
