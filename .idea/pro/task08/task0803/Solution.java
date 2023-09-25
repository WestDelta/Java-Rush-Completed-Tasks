package com.javarush.task.pro.task08.task0803;

import java.util.Scanner;

public class Solution
{
	 
	 public static void main(String[] args)
	 {
			int[] intArray = getArrayOfTenElements();
			System.out.println(min(intArray));
	 }
	 
	 public static int min(int[] ints)
	 {
			int a = Math.min(Math.min(ints[0], ints[1]), Math.min(ints[2], ints[3]));
			int b = Math.min(Math.min(ints[4], ints[5]), Math.min(ints[6], ints[7]));
			return Math.min(Math.min(ints[8], ints[9]), Math.min(a, b));
	 }
	 
	 public static int[] getArrayOfTenElements()
	 {
			Scanner ar = new Scanner(System.in);
			int[] array = new int[10];
			for (int i = 0; i < array.length; i++)
			{
				 array[i] = ar.nextInt();
			}
			return array;
	 }
}
