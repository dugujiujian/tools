package com.dugu.core.rule.exception;

public class RuleException extends RuntimeException {

 
    private static final long serialVersionUID = 1745406316309328301L;
    
    

    /**
     * ���캯��
     */
    public RuleException() {
        super();
    }

    /**
     * ���캯��
     * 
     * @param msg
     */
    public RuleException(String msg) {
        super(msg);
    }

    /**
     * ���캯��
     * 
     * @param msg
     * @param e
     */
    public RuleException(String msg, Throwable e) {
        super(msg, e);
    }


}
