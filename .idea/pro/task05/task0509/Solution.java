package com.javarush.task.pro.task05.task0509;
public class Solution
{
	 public static int[][] MULTIPLICATION_TABLE;
	 public static void main(String[] args)
	 {
			MULTIPLICATION_TABLE = new int[30][30];
			for (int a = 0; a < MULTIPLICATION_TABLE.length; a++)
			{
				 MULTIPLICATION_TABLE[a][0] = a+1;
			}
			for (int a = 0; a < MULTIPLICATION_TABLE.length; a++)
			{
				 MULTIPLICATION_TABLE[0][a] = a+1;
			}
			for (int a = 1; a < MULTIPLICATION_TABLE.length; a++)
			{
				 for (int b = 1; b < MULTIPLICATION_TABLE.length; b++)
				 {
						MULTIPLICATION_TABLE[a][b] = (MULTIPLICATION_TABLE[a][0] * MULTIPLICATION_TABLE[0][b]);
				 }
			}
			for (int a = 0; a < MULTIPLICATION_TABLE.length; a++)
			{
				 for (int b = 0; b < MULTIPLICATION_TABLE.length; b++)
				 {
						System.out.print(MULTIPLICATION_TABLE[a][b]);
						System.out.print(" ");
				 }
				 System.out.println();
			}
	 }
}
