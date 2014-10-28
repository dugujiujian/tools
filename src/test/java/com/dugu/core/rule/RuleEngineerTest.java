package com.dugu.core.rule;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dugu.core.rule.domain.RuleParam;

public class RuleEngineerTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        // getBean参数 必须是service类上面@Component("stuSer")里面的参数  
        DefaultRuleEngineerExecutor defaultRuleEngineerExecutor = (DefaultRuleEngineerExecutor) context
                .getBean("defaultRuleEngineerExecutor");
        RuleParam param = new RuleParam();
        param.setUserId(2l);
        param.setDegree(19);
        defaultRuleEngineerExecutor.handle(param);
    }

    @Test
    public void test(ApplicationContext context) {

    }

}
