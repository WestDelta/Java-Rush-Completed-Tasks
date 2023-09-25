package com.javarush.task.pro.task16.task1614;

import java.time.Instant;

public class Solution
{
	 
	 public static void main(String[] args)
	 {
			System.out.println(getMaxFromMilliseconds());
			System.out.println(getMaxFromSeconds());
			System.out.println(getMaxFromSecondsAndNanos());
	 }
	 
	 static Instant getMaxFromMilliseconds()
	 {
			Instant maxMill = Instant.ofEpochMilli(Long.MAX_VALUE);
			return maxMill;
	 }
	 
    static Instant getMaxFromSeconds()
	 {
       long q = Instant.MAX.getEpochSecond();
       Instant maxSec = Instant.ofEpochSecond(q);
       return maxSec;
	 }
	 
	 static Instant getMaxFromSecondsAndNanos()
	 {
       long a = Instant.MAX.getNano();
       long b = Instant.MAX.getEpochSecond();
       Instant maxSecAndNano = Instant.ofEpochSecond(b, a);
       return maxSecAndNano;
	 }
}
