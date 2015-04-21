/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson02;

/**
 * Дано целое число n. Выведите следующее за ним четное число. 
 * При решении этой задачи нельзя использовать условную инструкцию if и циклы.
 * @author Денис
 */

import java.io.*;
public class example03 {
    public static void main (String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Введите целое число n:");
        str = br.readLine();
        int a = (Integer.parseInt(str)/2)*2+2;
        System.out.println("Cледующее за "+ str + " четное число - " + a);
    }
}
