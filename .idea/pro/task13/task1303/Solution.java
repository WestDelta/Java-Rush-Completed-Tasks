package com.javarush.task.pro.task13.task1303;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* 
Выводим в консоли элементы множества
*/

public class Solution
{
	 
	 public static void print(HashSet<String> words)
	 {
			for (String w : words)
      {
          System.out.println(w);
      }
	 }
	 
	 public static void main(String[] args)
	 {
			HashSet<String> words = new HashSet<>(Arrays.asList("Программированию обычно учат на примерах.".split(" ")));
			print(words);
	 }
}
