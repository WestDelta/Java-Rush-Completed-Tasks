package com.javarush.task.pro.task08.task0813;

public class Solution
{
	 
	 public static void main(String[] args)
	 {
			System.out.println(getPowerOfTwo(-10));
	 }
	 
	 public static int getPowerOfTwo(int power)
	 {
			int two = 2;
			if (power == 0)
			{
				 return two;
			}
			else if (power > 0)
			{
				 two = two << (power - 1);
			}
			return two;
	 }
}
