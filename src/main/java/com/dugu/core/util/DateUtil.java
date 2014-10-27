package com.dugu.core.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

public class DateUtil {

    public final static String FORMAT_FULL = "yyyy-MM-dd HH:mm:ss";
    /** 日期格式yyyy-MM-dd字符串常量 */
    public static final String FORMAT_DATE = "yyyy-MM-dd";
    /** 日期格式HH:mm:ss字符串常量 */
    public static final String HOUR_FORMAT = "HH:mm:ss";

    public static String today() {
        return toString(new Date(), FORMAT_FULL);
    }

    /**
     * 将millis 转化成 date
     * 
     * @param millis
     * @return
     */
    public static Date long2Date(long millis) {
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(millis);
        return c.getTime();
    }

    /**
     * 日期增/减(按日纬度)
     * 
     * @param date
     * @param amount
     * @return
     */
    public static Date addDate(Date date, int amount) {
        if (date == null) {
            return null;
        }
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DAY_OF_MONTH, amount);
        return c.getTime();
    }

    public static Date addSecond(Date date, int amount) {
        if (date == null) {
            return null;
        }
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.SECOND, amount);
        return c.getTime();
    }

    public static Date addMinute(Date date, int amount) {
        if (date == null) {
            return null;
        }
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.MINUTE, amount);
        return c.getTime();
    }

    public static Date addHour(Date date, int amount) {
        if (date == null) {
            return null;
        }
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.HOUR_OF_DAY, amount);
        return c.getTime();
    }

    public static Date addDate(String sDate, String format, int amount) {
        Date date = toDate(sDate, format);
        if (date == null) {
            return null;
        }
        return addDate(date, amount);
    }

    /**
     * 将datetime的时间变成0
     * 
     * @param fullDate
     * @return
     */
    public Date zerolizedTime(Date fullDate) {
        Calendar c = Calendar.getInstance();
        c.setTime(fullDate);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime();
    }

    public long zerolizedTime(long millis) {
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(millis);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime().getTime();
    }
    
    public Date getDayStart(Date date){
        if(date==null){
            return null;
        }
        return zerolizedTime(date);
    }
    
    public Date getDayEnd(Date date){
        if(date==null){
            return null;
        }
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.HOUR_OF_DAY, 23);
        c.set(Calendar.MINUTE, 59);
        c.set(Calendar.SECOND, 59);
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime();
    }

    public static long getDaysBetween(Date startDate, Date endDate) {
        Calendar fromCalendar = Calendar.getInstance();
        fromCalendar.setTime(startDate);
        fromCalendar.set(Calendar.HOUR_OF_DAY, 0);
        fromCalendar.set(Calendar.MINUTE, 0);
        fromCalendar.set(Calendar.SECOND, 0);
        fromCalendar.set(Calendar.MILLISECOND, 0);

        Calendar toCalendar = Calendar.getInstance();
        toCalendar.setTime(endDate);
        toCalendar.set(Calendar.HOUR_OF_DAY, 0);
        toCalendar.set(Calendar.MINUTE, 0);
        toCalendar.set(Calendar.SECOND, 0);
        toCalendar.set(Calendar.MILLISECOND, 0);

        return (toCalendar.getTime().getTime() - fromCalendar.getTime().getTime())
                / (1000 * 60 * 60 * 24);
    }

    /****** 获取年/月/日/ *******/
    public static final int getYear(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.YEAR);
    }

    public static final int getMonth(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.MONTH) + 1;
    }

    public static final int getDay(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.DATE);
    }

    /**
     * 返回指定年份中指定月份的天数
     * 
     * @param 年份year
     * @param 月份month
     * @return 指定月的总天数
     */
    public static int getMonthLastDay(int year, int month) {
        int lastDay = 31;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                lastDay = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                lastDay = 30;
                break;
            case 2:
                if (isLeapYear(year)) {
                    lastDay = 29;
                } else {
                    lastDay = 28;
                }
                break;
        }
        return lastDay;
    }

    /**
     * 判断是平年还是闰年
     * 
     * @param year
     * @return
     */
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static String toString(Date sDate, String format) {
        if (sDate == null || StringUtils.isBlank(format)) {
            return null;
        }

        SimpleDateFormat sdfFrom = null;
        try {
            sdfFrom = new SimpleDateFormat(format);
            return sdfFrom.format(sDate);
        } catch (Exception ex) {
            return null;
        } finally {
            sdfFrom = null;
        }
    }

    public static Date toDate(String date, String format) {
        if (StringUtils.isBlank(date) || StringUtils.isBlank(format)) {
            return null;
        }

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        try {
            return simpleDateFormat.parse(date);
        } catch (ParseException e) {
            return null;
        }
    }

}
