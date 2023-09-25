package com.javarush.task.pro.task15.task1521;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;


public class Solution
{
	 public static void main(String[] args) throws IOException
	 {
			Scanner scanner = new Scanner(System.in);
			URL url = new URL(scanner.nextLine());
      InputStream is = url.openStream();
      Path path = Files.createTempFile(null, null);
      byte[] download = is.readAllBytes();
      Files.write(path, download);
      is.close();
	 }
}