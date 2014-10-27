package com.dugu.core.rule.thread.join;

public class JoinTestDemo {
    
    public static void main(String[] args) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " start.");
        TestThreadJoin t1 = new TestThreadJoin();
        TestThreadJoin2 t = new TestThreadJoin2(t1);
        try {
            t1.start();
            Thread.sleep(2000);
            t.start();
//            t.join();//在代碼2里，將此處注釋掉  
        } catch (Exception e) {
            System.out.println("Exception from main");
        }
        System.out.println(threadName + " end!");
    }

}
