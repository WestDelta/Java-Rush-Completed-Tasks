package com.javarush.task.pro.task05.task0519;
import java.util.Arrays;
public class Solution
{
	 public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
	 public static int element = 5;
	 public static void main(String[] args)
	 {
       int[] resar = Arrays.copyOf(array, array.length);
       Arrays.sort(resar);
       int index = Arrays.binarySearch(resar, element);
       boolean result = index >= 0;
       if (result)
       {
           System.out.println(result);
       }
       else
       {
           System.out.println(result);
       }
   }
}
