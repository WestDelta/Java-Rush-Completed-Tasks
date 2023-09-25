package com.javarush.task.pro.task16.task1619;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Solution
{
	 
	 static LocalDateTime localDateTime = LocalDateTime.now();
	 
	 public static void main(String[] args)
	 {
			
       DateTimeFormatter form = DateTimeFormatter.ofPattern("dd.MM.yyyyг. Hч.mмин");
       String result = form.format(localDateTime);
       System.out.println(result);
	 }
}
