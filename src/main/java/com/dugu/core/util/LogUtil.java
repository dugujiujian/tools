package com.dugu.core.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogUtil {

    /**
     * 统一错误日志
     */
    private static Logger    biz  = LoggerFactory.getLogger("coreLogger");

    public static final char CTRL = ';';

    /**
     * 打印重要业务日志 并且 统计
     * 
     * @param module
     * @param key
     * @param param 建议给参数
     */
    public static void biz(String module, String key, Object... param) {
        if (param != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("[" + module + "]").append(key);
            for (Object p : param) {
                if (p != null) {
                    sb.append(CTRL);
                    sb.append(p);
                }
            }
            biz.info(sb.toString());
        } else {
            biz.info(key);
        }
    }

}
