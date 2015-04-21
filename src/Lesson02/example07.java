/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson02;

/**
 * Напишите программу, которая возводит введенное число в степень 10, 
 * используя только четыре операции умножения.
 * Входная строка содержит единственное вещественное число в диапазоне от 0 до 8.
 * Нужно вывести 10-ю степень полученного числа с тремя знаками в дробной части.
 * @author Денис
 */
import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
public class example07 {
    static Scanner  in = new Scanner(System.in);
    public static void main (String[] args)
    {
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println("Введите число:");
        int n = in.nextInt();
        in.close();
        int x = n*n;
        int y = x*x*n;
        double z = (double) y * (double) y;
        System.out.println(df.format(z));
    }
}
