package com.javarush.task.pro.task06.task0612;
public class Solution
{
	 public static void main(String[] args)
	 {
			int[] ill = {15, 64, 9, 51, 42};
			printSqrt(ill);
	 }
	 
	 public static void printSqrt(int[] array)
	 {
			String elementSqrt = "Корень квадратный для числа ";
			for (int i = 0; i < array.length; i++)
			{
				 int element = array[i];
				 double elemSqrt = Math.sqrt(element);
				 System.out.println(elementSqrt + element + " равен " + elemSqrt);
			}
	 }
}
