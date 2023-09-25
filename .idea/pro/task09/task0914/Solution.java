package com.javarush.task.pro.task09.task0914;

public class Solution
{
	 public static void main(String[] args)
	 {
			String path = "/usr/java/jdk1.8/bin/";
			
			String jdk13 = "jdk-13";
			System.out.println(changePath(path, jdk13));
	 }
	 
	 public static String changePath(String path, String jdk)
	 {
			int indexFirst = path.indexOf("jdk");
			int indexLast = path.indexOf("/", indexFirst);
			String word = path.substring(indexFirst, indexLast);
			String newPath = path.replaceAll(word, jdk);
			return newPath;
	 }
}
