package com.dugu.core.util;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class DateUtilTest {

	
	@Test
	public void testLong2Date() {
		String now = "2014-10-23 21:21:21";
		Date datetime = DateUtil.toDate(now, DateUtil.FORMAT_FULL);
		long millis=datetime.getTime();
		Date result=DateUtil.long2Date(millis);
		Assert.assertTrue(result.equals(datetime));
		
	}
	
	
	@Test
	public void testAddDate() {
		// add
		String now = "2014-10-22 21:21:21";
		Date datetime = DateUtil.toDate(now, DateUtil.FORMAT_FULL);
		Date result=DateUtil.addDate(datetime, 1);
		Assert.assertEquals("2014-10-23 21:21:21",DateUtil.toString(result, DateUtil.FORMAT_FULL));
		// sub
		result=DateUtil.addDate(datetime, -1);
		Assert.assertEquals("2014-10-21 21:21:21",DateUtil.toString(result, DateUtil.FORMAT_FULL));
		
		// string
		result=DateUtil.addDate(now, DateUtil.FORMAT_FULL,2);
		Assert.assertEquals("2014-10-24 21:21:21",DateUtil.toString(result, DateUtil.FORMAT_FULL));
		
	}
	
	@Test
	public void testAddSecond() {
		// add
		String now = "2014-10-23 21:21:21";
		Date datetime = DateUtil.toDate(now, DateUtil.FORMAT_FULL);
		Date result=DateUtil.addSecond(datetime, 10);
		Assert.assertEquals("2014-10-23 21:21:31",DateUtil.toString(result, DateUtil.FORMAT_FULL));
		// sub
		result=DateUtil.addSecond(datetime, -10);
		Assert.assertEquals("2014-10-23 21:21:11",DateUtil.toString(result, DateUtil.FORMAT_FULL));
	}
	
	@Test
	public void testAddMinute() {
		// add
		String now = "2014-10-23 21:21:21";
		Date datetime = DateUtil.toDate(now, DateUtil.FORMAT_FULL);
		Date result=DateUtil.addMinute(datetime, 10);
		Assert.assertEquals("2014-10-23 21:31:21",DateUtil.toString(result, DateUtil.FORMAT_FULL));
		// sub
		result=DateUtil.addMinute(datetime, -10);
		Assert.assertEquals("2014-10-23 21:11:21",DateUtil.toString(result, DateUtil.FORMAT_FULL));
	}
	
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

 
 

}
