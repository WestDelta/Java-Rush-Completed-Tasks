package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Solution
{
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Path source = Paths.get(scanner.nextLine());
        Path destination = Paths.get(scanner.nextLine());
        byte[] byteStream = new byte[100000];
        
            byteStream = stepOne(source);
            
            System.out.println("lenth - " + byteStream.length);
    
            for (byte b : byteStream)
            {
                System.out.print(b + ",");
            }
            System.out.println("\n" +"_______________");
    
            stepSecond(byteStream);
    
        writeFile(destination.toFile().getAbsolutePath(), byteStream);
    
            for (int i = 0; i < byteStream.length; i++)
            {
                System.out.print(byteStream[i] + ",");
            }
    
      

    }
    
//    public static void write(String destination, byte[] byteStream){
//        try( OutputStream output = Files.newOutputStream(Paths.get(destination)))
//        {
//            output.write(byteStream);
//
//        } catch (IOException e)
//        {
//            throw new RuntimeException(e);
//        }
//    }
    
    public static void writeFile(String pathToDest,byte[] src) {
        try (OutputStream outputStream = Files.newOutputStream(Paths.get(pathToDest))) {
            outputStream.write(src);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    
    
    public static byte[] stepOne(Path source){
        try(InputStream input = Files.newInputStream(source);)
        {
            return input.readAllBytes();
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
    
    public static void stepSecond(byte[] byteStream){
        if (byteStream.length % 2 == 0)
        {
            for (int i = 0; i < byteStream.length; i++)
            {
                byte temp;
                temp = byteStream[i];
                byteStream[i] = byteStream[i + 1];
                byteStream[i + 1] = temp;
                i++;
                //System.out.println(byteStream[i]);
                //output.write(byteStream, 0, bytes);
            }
        } else if (byteStream.length % 2 == 1)
        {
            for (int i = 0; i < byteStream.length; i++)
            {
                if (i == byteStream.length - 1)
                {
                    break;
                }
                byte temp;
                temp = byteStream[i];
                byteStream[i] = byteStream[i + 1];
                byteStream[i + 1] = temp;
                if (i == byteStream.length - 1)
                {
                    break;
                } else
                {
                    i++;
                    if (i > byteStream.length)
                    {
                        break;
                    }
                }
                //System.out.println(byteStream[i]);
                //output.write(byteStream, 0, bytes);
            }
        }
    }
}