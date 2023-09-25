package com.javarush.task.pro.task15.task1514;

import java.nio.file.Path;
import java.util.Scanner;

public class Solution
{
	 public static void main(String[] args)
	 {
			
			try (Scanner scanner = new Scanner(System.in))
			{
				 Path one = Path.of(scanner.nextLine());
				 Path two = Path.of(scanner.nextLine());
				 Path mini = one.relativize(two);
				 if (!mini.isAbsolute())
				 {
						System.out.println(mini);
				 }
			}
			catch (Exception e)
			{
			
			}


	 }
}

