/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson01;

/**
 * Указать предыдущую и следующую цифру
 * @author Денис
 */
import java.io.*;
public class example02 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Введите текст:");
        str = br.readLine();
        int a = Integer.parseInt(str);
        System.out.println("The next number for the number " + a + " is " + ++a);
        System.out.println("The previous number for the number " + --a + " is " + --a);
        System.out.println(a);
    }
}
