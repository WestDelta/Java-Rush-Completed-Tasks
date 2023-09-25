package com.javarush.task.pro.task16.task1620;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Solution
{
	 
	 static ZonedDateTime zonedDateTime = ZonedDateTime.now();
	 
	 public static void main(String[] args)
	 {
			DateTimeFormatter form = DateTimeFormatter.ofPattern("e d.M.yy HH:mm:ss.n VV");
			String result = form.format(zonedDateTime);
			System.out.println(result);
	 }
}
