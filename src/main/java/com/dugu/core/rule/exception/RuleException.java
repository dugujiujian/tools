package com.dugu.core.rule.exception;

public class RuleException extends RuntimeException {

 
    private static final long serialVersionUID = 1745406316309328301L;
    
    

    /**
     * 构造函数
     */
    public RuleException() {
        super();
    }

    /**
     * 构造函数
     * 
     * @param msg
     */
    public RuleException(String msg) {
        super(msg);
    }

    /**
     * 构造函数
     * 
     * @param msg
     * @param e
     */
    public RuleException(String msg, Throwable e) {
        super(msg, e);
    }


}
