package com.javarush.task.pro.task09.task0907;

import java.util.regex.Pattern;

public class Solution
{
	 private static final String HEX = "0123456789abcdef";
	 
	 public static void main(String[] args)
	 {
			int decimalNumber = 1115658;
			System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
			String hexNumber = "11060A";
			System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
	 }
	 
	 public static String toHex(int decimalNumber)
	 {
			if (decimalNumber <= 0) return "";
			String hexRepresentationFinal = "";
			String hexRepresentationTemp = "";
			while (decimalNumber != 0)
			{
				 hexRepresentationTemp = HEX.substring((decimalNumber % 16), ((decimalNumber % 16) + 1));
				 hexRepresentationFinal = hexRepresentationTemp + hexRepresentationFinal;
				 decimalNumber = decimalNumber / 16;
			}
			return hexRepresentationFinal;
	 }
	 
	 public static int toDecimal(String hexNumber)
	 {
			
			if (hexNumber == null || hexNumber == "") return 0;
			int decimalNumber = 0;
			int hexRepresentationTemp;
			char hexRepresentationChar;
			String hexRepresentationStr = "";
			
			for (int i = 0; i < hexNumber.length(); i++)
			{
				 hexRepresentationChar = hexNumber.charAt(i);
				 hexRepresentationStr = hexRepresentationStr.valueOf(hexRepresentationChar);
				 hexRepresentationTemp = HEX.indexOf(hexRepresentationStr.toLowerCase());
				 decimalNumber = 16 * decimalNumber + hexRepresentationTemp;
			}
			return decimalNumber;
	 }
}
