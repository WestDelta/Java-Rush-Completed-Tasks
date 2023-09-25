package com.javarush.task.pro.task12.task1212;

public class CustomStringArrayList
{
	 
	 private int size;
	 private int capacity;
	 private String[] elements;
	 
	 public CustomStringArrayList()
	 {
			capacity = 10;
			size = 0;
			elements = new String[capacity];
	 }
	 
	 public void add(String element)
	 {
			if (size == capacity)
			{
				 grow();
			}
			elements[size] = element;
			size++;
	 }
	 
	 private void grow()
	 {
			double multiplier = 1.5;
			int newSize = (int) (capacity * multiplier);
			String[] biggerOne = new String[newSize];
			for (int i = 0; i < elements.length; i++)
			{
				 biggerOne[i] = elements[i];
			}
			elements = new String[newSize];
			for (int i = 0; i < biggerOne.length; i++)
			{
			    elements[i] = biggerOne[i];
			}
			capacity = newSize;
	 }
	 
}
