package com.dugu.tool;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public final static String FORMAT_FULL   = "yyyy-MM-dd HH:mm:ss";
    public final static String FORMAT_FULL_2 = "yyyyMMddHHmmss";
    public final static String FORMAT_DATE   = "yyyy-MM-dd";
    public final static String FORMAT_TIME   = "HH:mm:ss";

    public static Date toDate(String date, String format) {
        if (date == null || null == format) {
            return null;
        }

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();

        return null;
    }

}
