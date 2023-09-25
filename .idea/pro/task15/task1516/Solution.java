package com.javarush.task.pro.task15.task1516;


import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution
{
	 private static final String THIS_IS_FILE = " - это файл";
	 private static final String THIS_IS_DIR = " - это директория";
   private static Scanner scanner = new Scanner(System.in);
   private static Path path;
   
	 public static void main(String[] args)
	 {
       pathChecker();
	 }
   
   public static void pathChecker()
   {
       path = Path.of(scanner.nextLine());
       while (true)
           if (Files.isRegularFile(path))
           {
               System.out.println(path + THIS_IS_FILE);
               path = Path.of(scanner.nextLine());
           }
           else if (Files.isDirectory(path))
           {
               System.out.println(path + THIS_IS_DIR);
               path = Path.of(scanner.nextLine());
           }
           else
           {
               break;
           }
   }
}

