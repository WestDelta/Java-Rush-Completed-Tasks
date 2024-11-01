package com.javarush.task.pro.task16.task1613;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class Solution
{
	 
	 private static final int FRIDAY = 5;
	 private static final int SATURDAY = 6;
	 private static final int SUNDAY = 7;
	 private static final int WEEKEND_START_FRIDAY_CUT_OFF_HOUR = 22;
	 private static final int WEEKEND_END_SUNDAY_CUT_OFF_HOUR = 23;
	 
	 public static void main(String[] args)
	 {
			List<LocalDateTime> dateTimeList = new ArrayList<>();
			dateTimeList.add(LocalDateTime.of(2016, 4, 22, 18, 39));
			dateTimeList.add(LocalDateTime.of(2016, 4, 22, 21, 59));
			dateTimeList.add(LocalDateTime.of(2016, 4, 22, 22, 0));
			dateTimeList.add(LocalDateTime.of(2016, 4, 23, 5, 0));
			dateTimeList.add(LocalDateTime.of(2016, 4, 24, 8, 0));
			dateTimeList.add(LocalDateTime.of(2016, 4, 24, 22, 59));
			dateTimeList.add(LocalDateTime.of(2016, 4, 24, 23, 0));
			dateTimeList.add(LocalDateTime.of(2016, 4, 25, 11, 5));
			
			for (LocalDateTime dateTime : dateTimeList)
			{
				 System.out.println(dateTime.getDayOfWeek());
				 System.out.println(dateTime + ", is weekend - " + isWeekend(dateTime));
			}
			
	 }
	 
	 public static boolean isWeekend(LocalDateTime dateTime)
	 {
			String dayChecker = dateTime.getDayOfWeek().toString();
			LocalTime timeChecker = LocalTime.of(dateTime.getHour(), dateTime.getMinute(), dateTime.getSecond());
			LocalTime tooEarly = LocalTime.of(21, 59,59);
			LocalTime tooLate = LocalTime.of(22, 59, 59);
			if (dayChecker.equals("FRIDAY") && timeChecker.isAfter(tooEarly))
			{
				 return true;
			}
			else if (dayChecker.equals("SATURDAY"))
			{
				 return true;
			}
			else return dayChecker.equals("SUNDAY") && timeChecker.isBefore(tooLate);
	 }
}