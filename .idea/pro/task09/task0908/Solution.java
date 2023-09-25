package com.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;


public class Solution
{
	 
	 public static void main(String[] args)
	 {
			String binaryNumber = "10101101010111";
			System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
			String hexNumber = "679";
			System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
	 }
	 
	 public static String toHex(String binaryNumber)
	 {
			if (binaryNumber == null || binaryNumber == "null") return "";
			for (int i = 0; i < binaryNumber.length(); i++)
			{
				 if (binaryNumber.charAt(i) == '0' || binaryNumber.charAt(i) == '1') ;
				 else return "";
			}
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

			String hexRepresentationFinal = "";
			String hexRepresentationTemp = "";
			String HEX = "0123456789abcdef";
			while (decimal != 0)
			{
				 hexRepresentationTemp = HEX.substring((decimal % 16), ((decimal % 16) + 1));
				 hexRepresentationFinal = hexRepresentationTemp + hexRepresentationFinal;
				 decimal = decimal / 16;
			}
			return hexRepresentationFinal;
	 }
	 
	 public static String toBinary(String hexNumber)
	 {
			if (hexNumber == null || hexNumber == "null")
			{
				 return "";
			}
			String HEX = "0123456789abcdef";
			for (int i = 0; i < hexNumber.length(); i++)
			{
				 char a = hexNumber.charAt(i);
				 String b = "";
				 b = b.valueOf(a);
				 b = b.toLowerCase();
				 if (!HEX.contains(b))
				 {
						return "";
				 }
			}
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
			String[] temp = new String[10000];
			String binaryTemp = "";
			String binary2 = "";
			String binary3 = "";
			int count = 0;
			while (decimalNumber != 0)
			{
				 binaryTemp = binaryTemp + (decimalNumber % 2);
				 temp[count] = binaryTemp;
				 binary2 = binary2 + binaryTemp;
				 binaryTemp = "";
				 decimalNumber = decimalNumber / 2;
				 count++;
			}
			int count2 = binary2.length() - 1;
			for (int i = 0; i < binary2.length(); i++)
			{
				 binary3 = binary3 + temp[count2];
				 count2--;
			}
			if (binary3.equals("1"))
			{
				 binary3 = "000" + binary3;
			}
			if (binary3.equals("10") || binary3.equals("11"))
			{
				 binary3 = "00" + binary3;
			}
			if (binary3.equals("100") || binary3.equals("101") || binary3.equals("110") || binary3.equals("111"))
			{
				 binary3 = "0" + binary3;
			}
			return binary3;
	 }
}
