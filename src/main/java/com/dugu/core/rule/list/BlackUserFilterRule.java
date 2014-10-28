package com.dugu.core.rule.list;

import com.dugu.core.rule.IRuleEngineer;
import com.dugu.core.rule.domain.RuleContext;
import com.dugu.core.rule.domain.RuleParam;
import com.dugu.core.rule.exception.RuleException;
import com.dugu.core.util.LogUtil;

public class BlackUserFilterRule implements IRuleEngineer {

    @Override
    public boolean handle(RuleContext context, RuleParam param) throws RuleException {

        if (param == null || param.getUserId() == null) {
            LogUtil.biz("BlackUserFilterRule.handle", "param error", param, context);
            return false;
        }
        if (param.getUserId().equals(1l)) {
            LogUtil.biz("BlackUserFilterRule", "black id", param, context);
            return false;
        }

        return true;
    }

}
