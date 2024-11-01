package com.javarush.task.pro.task15.task1510;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution
{
	 public static void main(String[] args) throws IOException
	 {
			byte[] bytes = args[0].getBytes();
			try (Scanner scanner = new Scanner(System.in))
			{
          Path path = Path.of(scanner.nextLine());
          Files.write(path, bytes);
			} catch (IOException e)
			{
				 System.out.println("Something went wrong : " + e);
			}
	 }
}

