package com.javarush.task.pro.task13.task1310;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

public class Solution
{
	 public static HashMap<String, Double> grades = new HashMap<>();
	 
	 public static void main(String[] args)
	 {
			addStudents();
			System.out.println("Список студентов группы: ");
			printStudents();
			System.out.print("Средний балл группы: " + getAverageMark());
	 }
	 
	 public static void addStudents()
	 {
			grades.put("Давыдов Олег", 4.3d);
			grades.put("Шульга Николай", 4.1d);
			grades.put("Колос Василий", 4.9d);
			grades.put("Шевченко Тарас", 3.7d);
			grades.put("Марчук Любослав", 3.2d);
	 }
	 
	 public static void printStudents()
	 {

			for (String name : grades.keySet())
			{
				 System.out.println(name);
			}
	 }
	 
	 public static Double getAverageMark()
	 {
			double average = 0;
			double studentCount = 0;
			for (String key : grades.keySet())
			{
				average += grades.get(key);
				studentCount++;
			}
			average /= studentCount;
			return average;
	 }
}

/*
public static void printStudents()
{
	 ArrayList<String> namesUnsorted = new ArrayList<String>();
	 ArrayList<String> namesSorted = new ArrayList<String>();
	 for (String key : grades.keySet())
	 {
			namesUnsorted.add(key);
	 }
	 for (String name : namesUnsorted)
	 {
			int index = name.indexOf(' ');
			String firstName = name.substring(index + 1);
			String secondName = name.substring(0, index);
			namesSorted.add(firstName + " " + secondName);
	 }
	 int count = 0;
	 for (String key : grades.keySet())
	 {
			System.out.println(namesSorted.get(count));
			count++;
	 }
	 
}
*/