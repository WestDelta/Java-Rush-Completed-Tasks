package com.javarush.task.pro.task15.task1523;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;


public class Solution
{
	 public static void main(String[] args) throws IOException
	 {
			URL url = new URL("http://httpbin.org/post");
			URLConnection connection = url.openConnection();
			connection.setDoOutput(true);
		 
			try (OutputStream output = connection.getOutputStream();
					 PrintStream sender = new PrintStream(output))
			{
				 sender.println("Привет");
			}
		 
			try (InputStream inputStream = connection.getInputStream();
					 BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
				 while (reader.ready())
						System.out.println(reader.readLine());
			}
	 }
}

