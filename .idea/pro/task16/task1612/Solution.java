package com.javarush.task.pro.task16.task1612;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class Solution
{
	 
	 public static void main(String[] args)
	 {
			Map<LocalDate, List<LocalTime>> dateMap = DateTimeGenerator.generateDateMap();
			printCollection(dateMap.entrySet());
			
			Set<LocalDateTime> dateSet = convert(dateMap);
			printCollection(dateSet);
	 }
	 
	 static Set<LocalDateTime> convert(Map<LocalDate, List<LocalTime>> sourceMap)
	 {
			Set<LocalDateTime> dateSet = new HashSet<>();
      
      for (var q: sourceMap.keySet())
      {
				 LocalDate temp1;
				 LocalTime temp2;
				 LocalDateTime temp3;

				 for (int i = 0; i < sourceMap.get(q).size(); i++)
				 {
					 temp1 = q;
					 temp2 = sourceMap.get(q).get(i);
					 temp3 = LocalDateTime.of(temp1, temp2);
					 dateSet.add(temp3);
				}
			}
			return dateSet;
	 }
	 
	 static void printCollection(Collection<?> collection)
	 {
			System.out.println("-----------------------------------------------------");
			collection.forEach(System.out::println);
	 }
}