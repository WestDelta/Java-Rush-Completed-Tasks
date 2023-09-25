package com.javarush.task.pro.task05.task0516;
import java.util.Arrays;
public class Solution
{
	 public static int[] array = new int[20];
	 public static int valueStart = 10;
	 public static int valueEnd = 13;
	 public static void main(String[] args)
	 {
			if (array.length % 2 == 0)
      {
			    int chetnoe = (array.length / 2);
          Arrays.fill(array, 0, (chetnoe + 1), valueStart);
          Arrays.fill(array, chetnoe, array.length, valueEnd);
			}
      else if (array.length % 2 == 1)
      {
          int nechetnoe = ((array.length / 2) + 1);
          Arrays.fill(array, 0, nechetnoe, valueStart);
          Arrays.fill(array, nechetnoe, array.length, valueEnd);
      }
			System.out.println(Arrays.toString(array));
	 }
}

