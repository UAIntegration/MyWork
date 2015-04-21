/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson04;

/**
 * Даны три действительных числа: a, b, c. Проверьте, выполняется ли равенство a + b = c . 
 * Если равенство выполняется, выведите YES, если не выполняется, выведите NO.
 * Числа a, b, c –  действительные, положительные, не превосходят 10 и заданы не более, 
 * чем с 7 знаками после точки.
 * @author Денис
 */
import java.io.*;
import java.util.*;
public class example02 {
    static Scanner in = new Scanner (System.in);
    public static void main(String[] args)
    {
        System.out.println("Введите число а");
        float a = in.nextFloat();
        System.out.println("Введите число b");
        float b = in.nextFloat();
        System.out.println("Введите число c");
        float c = in.nextFloat();
        System.out.println( (a+b==c)? "YES":"NO");
    }
}
