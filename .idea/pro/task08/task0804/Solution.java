package com.javarush.task.pro.task08.task0804;

public class Solution
{
	 public static void main(String[] args)
	 {
			System.out.println(generateNumber());
	 }
	 
	 public static int generateNumber()
	 {
			int random = (int) (Math.random() * 100);
			return random;
	 }
}
