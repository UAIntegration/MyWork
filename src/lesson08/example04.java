/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson08;

/**
 * Даны две строки. Определите, является ли первая строка подстрокой второй строки.
 * @author Денис
 */
import java.io.*;
import java.util.*;

public class example04 {
    public static void main (String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
        String str1 = in.readLine();
        String str2 = in.readLine();
        System.out.println((str2.contains(str1))? "yes":"no");
    }
}
