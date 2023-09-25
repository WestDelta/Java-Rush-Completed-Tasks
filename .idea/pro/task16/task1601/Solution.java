package com.javarush.task.pro.task16.task1601;


import java.util.Calendar;
import java.util.Date;

public class Solution
{
	 
	 static Date birthDate = new Date(94, Calendar.NOVEMBER, 21);
	 
	 public static void main(String[] args)
	 {
			System.out.println(getDayOfWeek(birthDate));
	 }
	 
	 static String getDayOfWeek(Date date)
	 {
       int dateDay = date.getDay();
       return switch (dateDay)
               {
                   case (0) -> "Воскресенье";
                   case (1) -> "Понедельник";
                   case (2) -> "Вторник";
                   case (3) -> "Среда";
                   case (4) -> "Четверг";
                   case (5) -> "Пятница";
                   case (6) -> "Суббота";
                   default -> "Дата введена некорректно";
               };
	 }
}
