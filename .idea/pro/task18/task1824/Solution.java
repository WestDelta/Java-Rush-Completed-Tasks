package com.javarush.task.pro.task18.task1824;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

/* 
Из потока данных — в map
*/

public class Solution
{
	 
	 public static void main(String[] args)
	 {
			var stringStream = Stream.of("Ja1221vaRush", "Cod222eGym", "Amigo", "Ell222222222y", "Kim", "Risha");
			
			getMap(stringStream).forEach((s, i) -> System.out.println(s + " - " + i));
	 }
	 
	 public static Map<String, Integer> getMap(Stream<String> stringStream)
	 {
			return stringStream.collect(Collectors.toMap(x -> x.toString(), x -> x.length()));
	 }
}
