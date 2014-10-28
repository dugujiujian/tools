package com.dugu.core.rule;

import com.dugu.core.rule.domain.RuleContext;
import com.dugu.core.rule.domain.RuleParam;
import com.dugu.core.rule.exception.RuleException;


public interface IRuleEngineer {

    boolean handle(RuleContext context,RuleParam param) throws RuleException  ;

}
