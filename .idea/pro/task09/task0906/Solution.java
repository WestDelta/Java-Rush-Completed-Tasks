package com.javarush.task.pro.task09.task0906;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Solution
{
	 public static void main(String[] args)
	 {
			int decimalNumber = 72;
			System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
			String binaryNumber = "1011111111111111111111";
			System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
	 }
	 
	 public static String toBinary(int decimalNumber)
	 {
			if (decimalNumber <= 0) return "";
			int decimal = decimalNumber;
			String[] temp = new String[10000];
			String binaryTemp = "";
			String binary2 = "";
			String binary3 = "";
			int count = 0;
			while (decimal != 0)
			{
				 binaryTemp = binaryTemp + (decimal % 2);
				 temp[count] = binaryTemp;
				 binary2 = binary2 + binaryTemp;
				 binaryTemp = "";
				 decimal = decimal / 2;
				 count++;
			}
			int count2 = binary2.length() - 1;
			for (int i = 0; i < binary2.length(); i++)
			{
				 binary3 = binary3 + temp[count2];
				 count2--;
			}
			return binary3;
	 }
	 
	 public static int toDecimal(String binaryNumber)
	 {
			if (binaryNumber == null || binaryNumber == "") return 0;
			int pow;
			int decimal = 0;
			
		  int[] binArray = new int[binaryNumber.length()];
			for (int i = 0; i < binaryNumber.length(); i++)
			{
				 binArray[i] = Integer.valueOf(binaryNumber.substring(i, (i + 1)));
			}

			int[] resultArray = new int[binaryNumber.length()];
			for (int i = 0; i < binaryNumber.length(); i++)
			{
			    resultArray[i] = binArray[(binaryNumber.length() - 1 - i)];
			}
			
			for (int i = 0; i < binaryNumber.length(); i++)
			{
				 pow = (int) Math.pow(2, i);
				 decimal = decimal + (resultArray[i] * pow);
			}

			return decimal;
	 }
}
