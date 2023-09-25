package com.javarush.task.pro.task10.task1016;

public class Solution
{
	 
	 public static void showWeather(City city)
	 {
			String temp = city.getName();
			int temp1 = city.getTemperature();
			System.out.println("В городе " + temp + " сегодня температура воздуха " + temp1);
	 }
	 
	 public static void main(String[] args)
	 {
			City unnamed = new City("Киев", 25);
			showWeather(unnamed);
	 }
}
