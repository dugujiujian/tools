package com.dugu.core.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogUtil {

    /**
     * ͳһ������־
     */
    private static Logger    biz  = LoggerFactory.getLogger("coreLogger");

    public static final char CTRL = ';';

    /**
     * ��ӡ��Ҫҵ����־ ���� ͳ��
     * 
     * @param module
     * @param key
     * @param param ���������
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
