package com.dugu.core.rule.thread.consumer;

public class ProductConsumeDemo {
    public static void main(String[] args) {
//        Depot mDepot = new Depot(100);
//        Producer mPro = new Producer(mDepot);
//        Customer mCus = new Customer(mDepot);
//
//        mPro.produce(60);
//        mPro.produce(120);
//        mCus.consume(90);
//        mCus.consume(150);
//        mPro.produce(110);

        BreadFactory breadFactory = new BreadFactory(100);
        
        BreakConsume breakConsume = new BreakConsume(breadFactory);
        BreakProductor breakProductor = new BreakProductor(breadFactory);
        
        
        breakProductor.product(80);

        breakConsume.consume(60);
        
        
    }
}
