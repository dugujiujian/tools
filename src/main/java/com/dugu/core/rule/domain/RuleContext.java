package com.dugu.core.rule.domain;

import org.apache.commons.lang.builder.ToStringBuilder;

public class RuleContext {

    /**
     * �û�id
     */
    private Long userId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
