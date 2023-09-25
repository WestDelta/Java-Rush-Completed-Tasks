package com.javarush.task.pro.task05.task0507;

import java.util.Scanner;

public class Solution
{
    public static int[] array;
    
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        array = new int[n];
        for (int i = 0; (i < n) && (n > 0); i++)
        {
            array[i] = scan.nextInt();
        }
        int max = array[0];
        for (int a = 0; a < n; a++)
        {
            if (array[a] > max)
            {
                max = array[a];
            }
        }
        System.out.println(max);
    }
}
