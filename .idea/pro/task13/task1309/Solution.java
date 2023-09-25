package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

public class Solution
{
	 public static HashMap<String, Double> grades = new HashMap<>();
	 
	 public static void main(String[] args)
	 {
			addStudents();
			System.out.println(grades);
	 }
	 
	 public static void addStudents()
	 {
			grades.put("Акакий", 3.0);
      grades.put("Борис", 3.5);
      grades.put("Виталик", 4.0);
      grades.put("Гоша", 4.5);
      grades.put("Дементий", 5.0);
	 }
}
