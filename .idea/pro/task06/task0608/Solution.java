package com.javarush.task.pro.task06.task0608;
public class Solution
{
	 public static void main(String[] args)
	 {
			System.out.println(ninthDegree(cube(2)));
	 }
	 
	 public static long cube(long count)
	 {
			long result = count;
			for (int i = 1; i < 3; i++)
			{
				 result = result * count;
			}
			return result;
	 }
	 
	 public static long ninthDegree(long count)
	 {
			long result = count;
			for (int i = 1; i < 3; i++)
			{
				 result = result * count;
			}
			return result;
	 }
	 
}