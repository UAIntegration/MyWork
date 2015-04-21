/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson02;

/**
 * Дано число n. С начала суток прошло n минут. 
 * Определите, сколько часов и минут будут показывать электронные часы в этот момент. 
 * Программа должна вывести два числа: 
 * количество часов (от 0 до 23) и количество минут (от 0 до 59). 
 * Учтите, что число n может быть больше, чем количество минут в сутках.
 * @author Денис
 */

import java.io.*;
public class example04 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Введите число n");
        str = br.readLine();
        int all = Integer.parseInt(str);
        if (all>=1440) all=all-1440*(all/1440);
        int h = all/60;
        int m = all - h*60;
        if (h<10) System.out.println("Часы будут показывать 0" + h + ":" + m);
        else System.out.println("Часы будут показывать " + h + ":" + m);
    }
}
