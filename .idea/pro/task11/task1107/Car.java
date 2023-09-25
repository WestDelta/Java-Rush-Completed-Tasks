package com.javarush.task.pro.task11.task1107;

public class Car
{
	 Engine test = new Engine();

	 
	 public class Engine
	 {
			private boolean isRunning;
			
			public void start()
			{
				 isRunning = true;
			}
		 
			public void stop()
			{
				 isRunning = false;
			}
			
	 }
	 
}
