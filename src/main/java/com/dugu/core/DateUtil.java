package com.dugu.core;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

public class DateUtil {

	public final static String FORMAT_FULL = "yyyy-MM-dd HH:mm:ss";
	public final static String FORMAT_DATE = "yyyy-MM-dd";

	public static String today() {
		return toString(new Date(), FORMAT_FULL);
	}
	
	public static Date addDate(Date date,int amount){
		if(date==null){
			return null;
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.DAY_OF_MONTH, amount);
		return c.getTime();
	}
	
	public static Date addDate(String sDate,String format,int amount){
		Date date=toDate(sDate,format);
		if(date==null){
			return null;
		}
		return addDate(date,amount);
	}
	

	/**
	 * 将date的时间变成0
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

	/****** 获取年/月/日/ *******/
	public static int getYear(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c.get(Calendar.YEAR);
	}

	public static int getMonth(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c.get(Calendar.MONTH) + 1;
	}

	public static int getDay(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c.get(Calendar.DATE);
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
