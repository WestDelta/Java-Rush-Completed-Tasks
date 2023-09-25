package com.javarush.task.pro.task08.task0801;

import static java.lang.Math.toRadians;

public class Solution
{
	 public static void main(String[] args)
	 {
			double test = 30.0;
			System.out.println(sin(test));
			System.out.println(cos(test));
			System.out.println(tan(test));
	 }
	 public static double sin(double a)
	 {
			return Math.sin(Math.toRadians(a));
	 }
	 
	 public static double cos(double a)
	 {
			return Math.cos(Math.toRadians(a));
	 }
	 
	 public static double tan(double a)
	 {
			return Math.tan(Math.toRadians(a));
	 }
}
