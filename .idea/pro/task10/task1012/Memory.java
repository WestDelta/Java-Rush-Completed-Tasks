package com.javarush.task.pro.task10.task1012;

import java.util.Arrays;
import java.util.Objects;

public class Memory
{
	 
	 public static void main(String[] args)
	 {
			String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
			executeDefragmentation(memory);
			System.out.println(Arrays.toString(memory));
	 }
	 
	 public static void executeDefragmentation(String[] array)
	 {
			int count = 0;
			String[] temp = new String[array.length];
			for (int i = 0; i < array.length; i++)
			{
			   if (array[i] != null)
				 {
						temp[count] = array[i];
						count++;
				 }
			}
			Arrays.fill(array, null);
			for (int i = 0; i < count; i++)
			{
			    array[i] = temp[i];
			}
	 }
}
