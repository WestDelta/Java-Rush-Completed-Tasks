package com.javarush.task.pro.task05.task0504;
public class Solution
{
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;
    
    public static void main(String[] args)
    {
        resultArray = new int[firstArray.length + secondArray.length];
        int i = 0;
        int j = 0;
        for (; i < firstArray.length; i++)
        {
            if (i <= (firstArray.length - 1))
            {
                resultArray[i] = firstArray[i];
            }
        }
        
        for (; j < secondArray.length; j++)
        {
            if (j <= (secondArray.length - 1))
            {
                resultArray[i + j] = secondArray[j];
            }
        }

        for (int q = 0; q < resultArray.length; q++)
        {
            System.out.println(resultArray[q]);
        }
    }
}
