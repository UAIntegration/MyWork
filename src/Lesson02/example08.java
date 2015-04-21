/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson02;

/**
 * Даны два натуральных числа n и m. 
 * Если одно из них делится на другое нацело, выведите 1, 
 * иначе выведите любое другое целое число. 
 * При решении этой задачи нельзя пользоваться условной инструкцией if и циклами.
 * @author Денис
 */
import java.io.*;
import java.util.*;

public class example08 {
    static Scanner in = new Scanner (System.in);
    public static void main (String[] args)
    {
        System.out.println("Введите натуральное число n");
        int n = in.nextInt();
        System.out.println("Введите натуральное число m");
        int m = in.nextInt();
        in.close();
        System.out.println((n%m)*(m%n) + 1);
    }
}
