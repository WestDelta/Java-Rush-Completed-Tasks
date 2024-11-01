package com.javarush.task.pro.task17.task1703;

import java.util.ArrayList;

public class Solution
{
	 public static ArrayList<Astronaut> astronauts = new ArrayList<>();
	 
	 public static void main(String[] args)
	 {
			createCrew();
			printCrewInfo();
	 }
	 
	 public static void createCrew()
	 {
			var one = new Human();
			var two = new Human();
			var three = new Dog();
			var four = new Cat();
			astronauts.add(one);
			astronauts.add(two);
			astronauts.add(three);
			astronauts.add(four);
	 }
	 
	 public static void printCrewInfo()
	 {
			System.out.println("На борт погружены члены экипажа: ");
			for (Astronaut astronaut : astronauts)
			{
				 System.out.println(astronaut.getInfo());
			}
	 }
}
