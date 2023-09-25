package com.javarush.task.pro.task11.task1104;

/* 
Конвертер строки
*/

public class Solution
{
	 public static void main(String[] args)
	 {
			String string = "12.84";
      double two = Double.parseDouble(string);
      int three = (int) Math.round(two);
      System.out.println(three);
	 }
}
