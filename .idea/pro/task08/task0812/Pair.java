package com.javarush.task.pro.task08.task0812;

public class Pair
{
	 private int x;
	 private int y;
	 
	 public Pair(int x, int y)
	 {
			this.x = x;
			this.y = y;
	 }
	 
	 @Override
	 public String toString()
	 {
			return String.format("x=%d, y=%d", x, y);
	 }
	 
	 public void swap()
	 {
			int a;
			a = this.x;
			this.x = this.y;
			this.y = a;
			
			
			/*
			int rev1 = Integer.parseInt(Integer.toBinaryString(this.x));
			int rev2 = Integer.parseInt(Integer.toBinaryString(this.y));
			System.out.println(rev1);
			*/
	 }
}
