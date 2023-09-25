package com.javarush.task.pro.task12.task1209;

import java.util.ArrayList;

public class Solution
{
	 public static ArrayList<String> waitingEmployees = new ArrayList<>();
	 public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();
	 
	 public static void initEmployees()
	 {
			waitingEmployees.add("Гвинно");
			waitingEmployees.add("Гунигерд");
			waitingEmployees.add("Боргелейф");
			waitingEmployees.add("Нифрод");
			waitingEmployees.add("Альбиуф");
			waitingEmployees.add("Иногрим");
			waitingEmployees.add("Фриле");
	 }
	 
	 public static void main(String[] args)
	 {
			initEmployees();
			paySalary("фриле");
			System.out.println(waitingEmployees);
			System.out.println(alreadyGotSalaryEmployees);
	 }
	 
	 public static void paySalary(String name)
	 {
			if (name == null) return;
			name = name.substring(0, 1).toUpperCase() + name.substring(1);
			if (!waitingEmployees.contains(name)) return;
			int index = 0;
			for (int i = 0; i < waitingEmployees.size(); i++)
      {
          if (waitingEmployees.get(i).equalsIgnoreCase(name))
          {
              alreadyGotSalaryEmployees.add(name);
							index = i;
					}

      }
			
			waitingEmployees.set(index, null);
	 }
}
