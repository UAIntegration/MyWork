/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson02;
import java.io.*;
/**
 * Дано трехзначное число. Найдите сумму его цифр.
 * @author Денис
 */
public class example02 {
    public static void main(String[] arg) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Введите трехзначное число:");
        str = br.readLine();
        int a = str.toCharArray()[str.length() - 1] - '0';
        int b = str.toCharArray()[str.length() - 2] - '0';
        int c = str.toCharArray()[str.length() - 3] - '0';
        int summ = a+b+c;
        System.out.println("Сумма его чисел: " + summ);
    }
}
