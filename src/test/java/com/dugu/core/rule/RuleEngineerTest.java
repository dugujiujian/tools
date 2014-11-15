package com.dugu.core.rule;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

public class RuleEngineerTest {

    //    public static void main(String[] args) {
    //
    //        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
    //                "applicationContext.xml");
    //        DefaultRuleEngineerExecutor defaultRuleEngineerExecutor = (DefaultRuleEngineerExecutor) context
    //                .getBean("defaultRuleEngineerExecutor");
    //        RuleParam param = new RuleParam();
    //        param.setUserId(2l);
    //        param.setDegree(19);  
    //        defaultRuleEngineerExecutor.handle(param); 
    //    } 
    //  
    //    @Test
    //    public void test(ApplicationContext context) {
    // 
    //    }

    private static Logger log = LoggerFactory.getLogger(RuleEngineerTest.class);

    public static void main(String[] args) {
        log.trace("======trace");
        log.debug("======debug");
        log.info("======info");
        log.warn("======warn");
        log.error("======error");
    }

}
