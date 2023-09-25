package com.javarush.task.pro.task09.task0919;

public class Solution
{
	 public static void main(String[] args)
	 {
			String string = "Ходит кот задом наперед";
			System.out.println(string);
			System.out.println(reverseString(string));
	 }
	 
	 public static String reverseString(String string)
	 {
			StringBuilder reverse = new StringBuilder(string);
      reverse.reverse();
      String reverseString = reverse.toString();
			return reverseString;
	 }
}
