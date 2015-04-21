/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson06;

/**
 * работа с файлами
 * @author Денис
 */
import java.io.*;
import java.util.*;

public class example02
{
        public static void main(String[] args) throws IOException
        {
                Scanner in = new Scanner(new BufferedReader(new FileReader("D:\\input.txt")));
                PrintWriter out = new PrintWriter(new FileWriter("D:\\output.txt"));

                int a = in.nextInt();
                int b = in.nextInt();
                out.println(a + b);
                in.close();
                out.flush();
                out.close();
        }
}