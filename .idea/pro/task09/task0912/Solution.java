package com.javarush.task.pro.task09.task0912;

public class Solution
{
	 public static void main(String[] args)
	 {
			String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
			for (String url : urls)
			{
				 String protocol = checkProtocol(url);
				 String domain = checkDomain(url);
				 
				 System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
			}
	 }
	 
	 public static String checkProtocol(String url)
	 {
			String https = "https";
			String http = "http";
			if (url.startsWith("https"))
			{
				 return https;
			}
			else if (url.startsWith("http"))
			{
				 return http;
			}
			else return "неизвестный";
	 }
	 
	 public static String checkDomain(String url)
	 {
			String[] domain = new String[] {"com", "net", "org", "ru"};
			for (int i = 0; i < domain.length; i++)
			{
			    if (url.endsWith(domain[i]))
					{
						 return domain[i];
					}

			}
			return "неизвестный";
	 }
}
