package com.dugu.core;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testToString() {
		String date = DateUtil.toString(null, null);
		Assert.assertNull(date);
		date = DateUtil.toString(new Date(), "");
		Assert.assertNull(date);
		// normal
		Date now = new Date();
		date = DateUtil.toString(now, DateUtil.FORMAT_FULL);
		Assert.assertNotNull(date);
		date = DateUtil.toString(now, DateUtil.FORMAT_DATE);
		Assert.assertNotNull(date);
 
	}
	
	@Test
	public void testToDate() {
		Date date = DateUtil.toDate(null, "");
		Assert.assertNull(date);
		date = DateUtil.toDate("2014-10-21", "");
		Assert.assertNull(date);
		// normal
		String now = "2014-10-21 21:21:21";
		date = DateUtil.toDate(now, DateUtil.FORMAT_FULL);
		Assert.assertNotNull(date);
		date = DateUtil.toDate(now, DateUtil.FORMAT_DATE);
		Assert.assertNotNull(date);
	}
	
	@Test
	public void testGetYMD() {
		// normal
		String now = "2014-10-21 21:21:21";
		Date datetime = DateUtil.toDate(now, DateUtil.FORMAT_FULL);
		int year=DateUtil.getYear(datetime);
		Assert.assertEquals(2014,year);
		int month=DateUtil.getMonth(datetime);
		Assert.assertEquals(10,month);
		int day=DateUtil.getDay(datetime);
		Assert.assertEquals(21,day);
	}
	
	@Test
	public void testAddDate() {
		// normal
		String now = "2014-10-22 21:21:21";
		Date datetime = DateUtil.toDate(now, DateUtil.FORMAT_FULL);
		Date result=DateUtil.addDate(datetime, 1);
		Assert.assertEquals("2014-10-23 21:21:21",DateUtil.toString(result, DateUtil.FORMAT_FULL));
		result=DateUtil.addDate(datetime, -1);
		Assert.assertEquals("2014-10-21 21:21:21",DateUtil.toString(result, DateUtil.FORMAT_FULL));
		System.err.println(result);
	}
 
 

}
