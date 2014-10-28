package com.dugu.core.rule.thread.synchronizes;

public class TestMethodSynchronizedDemo {
    
    
    public static void main(String[] args) {
        TestSynchronized td=new TestSynchronized();
        
        
        Thread t=new TestMethodSynchronized(td);
        Thread t2=new TestMethodSynchronized(td);
        
        t.start();
        t2.start();
        
        
//        TestSynchronized td2=new TestSynchronized();
//        
//        
//        Thread t3=new TestMethodSynchronized(td2);
//        Thread t4=new TestMethodSynchronized(td);
//        
//        t3.start();
//        t4.start();
        
        
    }

}
