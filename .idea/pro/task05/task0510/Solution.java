package com.javarush.task.pro.task05.task0510;

public class Solution
{
	 public static int[][] result = new int[10][];
	 public static void main(String[] args)
	 {
			//Определение количества элементов массива.
			for (int a = 0; a < 10; a++)
			{
				 result[a] = new int[a + 1];
			}
			
			//Заполнение элементов массива.
			for (int b = 0; b < result.length; b++)
			{
				 for (int c = b; c >= 0; c--)
				 {
						result[b][c] = (b + c);
				 }
			}
			
			//Выведение массива на печать согласно ТЗ.
			for (int d = 0; d < result.length; d++)
			{
				 for (int e = 0; e <= d; e++)
				 {
						System.out.print(result[d][e] + " ");
				 }
				 System.out.println();
			}
	 }
}
