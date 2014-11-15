package com.dugu.core.rule.domain;

import org.apache.commons.lang.builder.ToStringBuilder;

public class RuleParam {
    /**
     * ”√ªßid
     */
    private Long userId;

    private int  degree;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public int getDegree() {
        return degree; 
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
