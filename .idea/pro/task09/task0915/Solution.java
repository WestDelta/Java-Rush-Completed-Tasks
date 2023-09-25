package com.javarush.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution
{
	 public static void main(String[] args)
	 {
			String packagePath = "java.util.stream";
			String[] tokens = getTokens(packagePath, ".");
			System.out.println(Arrays.toString(tokens));
	 }
	 
	 public static String[] getTokens(String query, String delimiter)
	 {
			StringTokenizer realm = new StringTokenizer(query, delimiter);
      int count = 0;
      int tokens = realm.countTokens();
      String[] result = new String[tokens];
      
      while (realm.hasMoreTokens())
      {
          result[count] = realm.nextToken();
          count++;
      }
			return result;
	 }
}
