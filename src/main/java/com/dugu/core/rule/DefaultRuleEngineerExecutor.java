package com.dugu.core.rule;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dugu.core.rule.domain.RuleContext;
import com.dugu.core.rule.domain.RuleParam;

@Service
@Component("defaultRuleEngineerExecutor")
public class DefaultRuleEngineerExecutor {

    public List<IRuleEngineer> engineers;

    public void setEngineers(List<IRuleEngineer> engineers) {
        this.engineers = engineers;
    }

    public void handle(RuleParam param) {
        if (engineers != null) {
            RuleContext context = new RuleContext();
            for (IRuleEngineer rule : engineers) {
                if (!rule.handle(context, param)) {
                    break;
                }
            }
        }
    }

}
