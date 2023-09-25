package com.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
День недели рождения твоего
*/

public class Solution
{
	 
	 static Calendar birthDate = new GregorianCalendar(1994, Calendar.NOVEMBER, 21);
	 
	 public static void main(String[] args)
	 {
			System.out.println(getDayOfWeek(birthDate));
	 }
	 
	 static String getDayOfWeek(Calendar calendar)
	 {
			int dateDay = calendar.get(Calendar.DAY_OF_WEEK);
			return switch (dateDay)
							{
								 case (1) -> "Воскресенье";
								 case (2) -> "Понедельник";
								 case (3) -> "Вторник";
								 case (4) -> "Среда";
								 case (5) -> "Четверг";
								 case (6) -> "Пятница";
								 case (7) -> "Суббота";
								 default -> "Дата введена некорректно";
							};
	 }
}
