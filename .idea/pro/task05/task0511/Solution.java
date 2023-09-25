package com.javarush.task.pro.task05.task0511;
import java.util.Scanner;
public class Solution
{
	 public static int[][] multiArray;
	 public static void main(String[] args)
	 {
       Scanner array = new Scanner(System.in);
       multiArray = new int[array.nextInt()][];
       for (int a = 0; a < multiArray.length; a++)
       {
           multiArray[a] = new int[array.nextInt()];
       }
       System.out.println(multiArray.length);
       for (int b = 0; b < multiArray.length; b++)
       {
           System.out.println(multiArray[b].length);
       }
	 }
}
