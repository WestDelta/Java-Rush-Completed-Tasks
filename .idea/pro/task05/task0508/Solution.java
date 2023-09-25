package com.javarush.task.pro.task05.task0508;
import java.util.Scanner;
import java.util.stream.Stream;

public class Solution
{
    public static String[] strings;
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        strings = new String[6];
        for (int a = 0; a < strings.length; a++)
        {
            strings[a] = scan.nextLine();
        }
    
        for (int b = 0; b < strings.length; b++)
        {
            String check = new String(strings[b]);
            for (int c = b+1; c < strings.length; c++)
            {
                if (check.equalsIgnoreCase(strings[c]))
                {
                    strings[b] = "null";
                    strings[c] = "null";
                }
            }
        }
        
        for (int n = 0; n < strings.length; n++)
        {
            if (strings[n].equalsIgnoreCase("null"))
            {
                strings[n] = null;
            }
        }
        
        for (String d : strings)
        {
            System.out.println(d);
        }
    }
}


//        for (int b = 0; b < strings.length; b++)
//        {
//            for (int z = (strings.length - 1); z > -1; z--)
//            {
//                if (strings[b] != strings[z])
//                    break;
//                else
//                    strings[b] = "null";
//                    strings[z] = "null";
//            }
//        }