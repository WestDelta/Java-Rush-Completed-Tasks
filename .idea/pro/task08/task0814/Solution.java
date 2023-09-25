package com.javarush.task.pro.task08.task0814;

public class Solution
{
	 
	 public static int setFlag(int number, int flagPos)
	 {
			int set = number | (1 << flagPos);
			return set;
	 }
	 
	 public static int resetFlag(int number, int flagPos)
	 {
			int reset = number & ~(1 << flagPos);
			return reset;
	 }
	 
	 public static boolean checkFlag(int number, int flagPos)
	 {
			boolean check = (number & (1 << flagPos)) == (1 << flagPos);
			return check;
	 }
}
