package com.javarush.task.pro.task10.task1015;

public class Hedgehog
{
	 
	 public void eat(Apple apple)
	 {
			System.out.println("Яблоко было съедено!");
	 }
	 
	 public static void main(String[] args)
	 {
			Hedgehog William = new Hedgehog();
			Apple apple = new Apple();
			William.eat(apple);
	 }
	 
	 public static class Apple
	 {
		
	 }
}
