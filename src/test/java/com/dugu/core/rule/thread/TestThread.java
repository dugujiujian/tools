package com.dugu.core.rule.thread;

public class TestThread extends Thread {
    
    
    @Override
    public void run(){ 
         System.out.println("Test Thread is running.....name="+Thread.currentThread().getName());
         try {
             sleep(3000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
    }

}
