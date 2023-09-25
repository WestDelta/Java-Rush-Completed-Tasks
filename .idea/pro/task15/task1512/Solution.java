package com.javarush.task.pro.task15.task1512;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/* 
Задом наперед
*/

public class Solution
{
	 public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	 public static PrintStream stream = new PrintStream(outputStream);
	 
	 public static void main(String[] args) throws IOException
	 {
			Scanner scanner = new Scanner(System.in);
			System.out.println(printReverse(scanner.nextLine()));
	 }
	 
	 public static String printReverse(String str)
	 {
			char[]input = str.toCharArray();
			char[]output=new char[input.length];
			int count=input.length-1;
			for(int i=0;i<input.length;i++)
			{
				 output[i]=input[count-i];
			}
			String result = new String(output);
			stream.print(result);
			return outputStream.toString();
	 }
}
