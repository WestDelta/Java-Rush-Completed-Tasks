package com.javarush.task.pro.task06.task0609;

public class Solution
{
	 public static void main(String[] args)
	 {
			System.out.println(ninthDegree(2));
	 }
	 
	 public static long cube(long a)
	 {
			return a * a * a;
	 }
	 
	 public static long ninthDegree(long b)
	 {
			long test = cube(b);
			return cube(test);
	 }
}
