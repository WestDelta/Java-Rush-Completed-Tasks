package com.javarush.task.pro.task14.task1408;


public class Solution
{
	 
	 public static String errorMessage = "не повезло";
	 
	 public static void main(String[] args)
	 {
      try
      {
          generateLuckyNumber();
      }
      catch (Exception a)
      {
          System.out.println(errorMessage);
      }
			
	 }
	 
	 static void generateLuckyNumber() throws Exception
	 {
			int luckyNumber = (int) (Math.random() * 100);
			if (luckyNumber == 13)
			{
				 throw new Exception();
			}
			System.out.println("твое счастливое число: " + luckyNumber);
	 }
}
