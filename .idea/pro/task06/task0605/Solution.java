package com.javarush.task.pro.task06.task0605;

import java.util.Arrays;

public class Solution
{
	 
	 public static void main(String[] args)
	 {
			int[] mainarray = {11, 22, 33, 44, 55, 66, 77, 88, 99};
			printArray(mainarray);
			reverseArray(mainarray);
			printArray(mainarray);
	 }
	 
	 public static void reverseArray(int[] revarray)
	 {
			int[] copyarray = Arrays.copyOf(revarray, revarray.length);
			int finalcount = copyarray.length - 1;
			for (int i = 0; i < copyarray.length; i++)
			{
				 revarray[i] = copyarray[finalcount - i];
			}
	 }
	 
	 public static void printArray(int[] printarray)
	 {
			for (int i : printarray)
			{
				 System.out.print(i + ", ");
			}
			System.out.println();
	 }
}

