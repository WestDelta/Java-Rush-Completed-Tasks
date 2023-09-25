package com.javarush.task.pro.task12.task1210;

import java.util.ArrayList;

public class Solution
{
	 public static ArrayList<Integer> numbers = new ArrayList<Integer>();

	 
	 public static void main(String[] args)
	 {
			init();
			print();
			
			reverse();
			print();
	 }
	 
	 public static void init()
	 {
			for (int i = 0; i < 10; i++)
			{
				 numbers.add(i);
			}
	 }
	 
	 public static void reverse()
	 {
			ArrayList<Integer> copy = new ArrayList<Integer>();
			for (int i = numbers.size() - 1; i >= 0; i--)
			{
				 int temp = numbers.get(i);
				 copy.add(temp);
			}
			numbers.clear();
			for (int i = 0; i < copy.size(); i++)
			{
			    numbers.add(copy.get(i));
			}
	 }
	 
	 private static void print()
	 {
			for (int number : numbers)
			{
				 System.out.println(number);
			}
	 }
}
