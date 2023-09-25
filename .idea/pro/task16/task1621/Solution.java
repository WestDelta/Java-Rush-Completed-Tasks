package com.javarush.task.pro.task16.task1621;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Solution
{
	 
	 static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
	 static String timeString = "13:30:45 23/02/2019";
	 
	 public static void main(String[] args)
	 {
			LocalDateTime dateTime = LocalDateTime.parse(timeString, dateTimeFormatter);
			dateTime.format(dateTimeFormatter);
			System.out.println(dateTime);
	 }
}
