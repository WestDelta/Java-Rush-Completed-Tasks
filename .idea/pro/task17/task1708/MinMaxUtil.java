package com.javarush.task.pro.task17.task1708;


public class MinMaxUtil
{
	 public static int min(int min1, int min2)
	 {
			return Math.min(min1, min2);
	 }
	 
	 public static int min(int min1, int min2, int min3)
	 {
			int a = Math.min(min1, min2);
			return Math.min(a, min3);
	 }
	 
	 public static int min(int min1, int min2, int min3, int min4)
	 {
			int a = Math.min(min1, min2);
			int b = Math.min(a, min3);
			return Math.min(b, min4);
	 }
	 
	 public static int min(int min1, int min2, int min3, int min4, int min5)
	 {
			int a = Math.min(min1, min2);
			int b = Math.min(min3, min4);
			int c = Math.min(a, b);
			return Math.min(c, min5);
	 }
	 
	 public static int max(int max1, int max2)
	 {
			return Math.max(max1, max2);
	 }
	 
	 public static int max(int max1, int max2, int max3)
	 {
			int a = Math.max(max1, max2);
			return Math.max(a, max3);
	 }
	 
	 public static int max(int max1, int max2, int max3, int max4)
	 {
			int a = Math.max(max1, max2);
			int b = Math.max(a, max3);
			return Math.max(b, max4);
	 }
	 
	 public static int max(int max1, int max2, int max3, int max4, int max5)
	 {
			int a = Math.max(max1, max2);
			int b = Math.max(max3, max4);
			int c = Math.max(a, b);
			return Math.max(c, max5);
	 }
}
