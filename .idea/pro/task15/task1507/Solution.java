package com.javarush.task.pro.task15.task1507;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Solution
{
	 public static void main(String[] args) throws IOException
	 {
			Scanner scanner = new Scanner(System.in);
      Path path = Paths.get(scanner.nextLine());
      List<String> lineIn = Files.readAllLines(path);
      separator(lineIn);
	 }
   
   public static void separator(List<String> source)
   {
       for (int i = 0; i < source.size(); i++)
       {
           if (i % 2 != 1)
           {
               System.out.println(source.get(i));
           }
       }
   }
}

