package com.javarush.task.pro.task14.task1415;

import java.util.LinkedList;
import java.util.List;

public class MyStack
{
	 
	 private final List<String> storage = new LinkedList<>();
	 
	 public void push(String s)
	 {
          storage.add(0, s);
	 }
	 
	 public String pop()
	 {
       String temp = storage.get(0);
       storage.remove(0);
			return temp;
	 }
	 
	 public String peek()
	 {
			return storage.get(0);
	 }
	 
	 public boolean empty()
	 {
			return storage.isEmpty();
	 }
	 
	 public int search(String s)
	 {
			for (String temp : storage)
      {
			    if (temp.equals(s))
          {
              return storage.indexOf(temp);
          }
			}
      return -1;
	 }
}
