package com.javarush.task.pro.task15.task1506;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution
{
	 public static void main(String[] args)
	 {
      try (Scanner scan = new Scanner(System.in))
      {
          Path path = Paths.get(scan.nextLine());
          List<String> linesIN = Files.readAllLines(path);
          replace(linesIN);
      }
      catch (Exception e)
      {
          System.out.println("Пятачок, неси ружье!");
      }
	 }
   
   public static void replace(List<String> source)
   {
      List<String> linesOUT = new ArrayList<>();
      for (String s : source)
      {
         if (s.contains(".") || s.contains(",") || s.contains(" "))
         {
            String temp = s;
            temp = temp.replace(".", "");
            temp = temp.replace(",", "");
            temp = temp.replace(" ", "");
            linesOUT.add(temp);
         }
      }
      for (String s : linesOUT)
      {
         System.out.print(s);
      }
   }
}