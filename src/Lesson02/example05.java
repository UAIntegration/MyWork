/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson02;

/**
 * В некоторой школе занятия начинаются в 9:00. 
 * Продолжительность урока — 45 минут, после 1-го, 3-го, 5-го и т.д. уроков перемена 5 минут, 
 * а после 2-го, 4-го, 6-го и т.д. — 15 минут.
 * Дан номер урока (число от 1 до 10). Определите, когда заканчивается указанный урок. 
 * Выведите два целых числа: время окончания урока в часах и минутах. 
 * При решении этой задачи нельзя пользоваться циклами и условными инструкциями.
 * @author Денис
 */

import java.io.*;
import java.util.*;
public class example05 {
    static Scanner  in = new Scanner(System.in);
    public static void main(String[] args) throws IOException
    {
        System.out.println("Введите номер урока:");
        int a = in.nextInt();
        in.close();
        //540 минут начало
        int time = a*45 + a/2*5 + (a-1)/2*15;
        System.out.println((time+540)/60 + " " + (time+540)%60);
    }
}
