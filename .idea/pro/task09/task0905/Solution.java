package com.javarush.task.pro.task09.task0905;

import java.util.regex.Pattern;

public class Solution
{
	 public static void main(String[] args)
	 {
			int decimalNumber = 21;
			System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
			int octalNumber = 25;
			System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
	 }
	 
	 public static int toOctal(int decimalNumber)
	 {
			if (decimalNumber <= 0) return 0;
			int octalNumber = 00;
			int i = 0;
			while (decimalNumber != 0)
			{
				 int pow = (int) Math.pow(10, i);
				 octalNumber = octalNumber + (decimalNumber % 8) * pow;
				 decimalNumber = decimalNumber / 8;
				 i++;
			}
			return octalNumber;
	 }
	 
	 public static int toDecimal(int octalNumber)
	 {
			//напишите тут ваш код
			if (octalNumber <= 0) return 0;
			int decimalNumber = 0;
			int i = 0;
			while (octalNumber != 0)
			{
				 int pow = (int) Math.pow(8, i);
				 decimalNumber = decimalNumber + (octalNumber % 10) * pow;
				 octalNumber = octalNumber / 10;
				 i++;
			}
			return decimalNumber;
	 }
}