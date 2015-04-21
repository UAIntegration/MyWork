/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson02;

/**
 * Напишите программу, которая находит сумму, произведение и среднее арифметическое 
 * трёх целых чисел, введённых с клавиатуры.
 * Три целых числа вводятся в одной строке через пробелы
 * Среднее арифметическое нужно вывести с точностью 3 знака после десятичной точки
 * @author Денис
 */
import java.io.*;
import java.text.DecimalFormat;
public class example06 {
    public static void main (String[] args) throws IOException
    {
        DecimalFormat df = new DecimalFormat("#.###");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Введите числа через пробел");
        str = br.readLine().trim();
        //String test1 = str.substring(0,2);
        //System.out.println(test1);
        char[] chars = str.toCharArray();
        int j=0;
        int massiv[];
        massiv = new int [3];
        String temps = "";
        for (int i=0; i<str.length(); i++)
        {
            if (chars[i] == ' ')
            {
                massiv[j]=Integer.parseInt(temps);
                j++;
                i++;
                temps = "";
            }
            temps = temps + Character.toString(chars[i]);
        }
        massiv[j]=Integer.parseInt(temps);
        int ch1 = massiv[0]+massiv[1]+massiv[2];
        int ch2 = massiv[0]*massiv[1]*massiv[2];
        double ch3 = ((double) massiv[0]+ (double) massiv[1]+ (double) massiv[2])/3;
        System.out.println(massiv[0] + "+" + massiv[1] + "+" + massiv[2] + "=" + ch1);
        System.out.println(massiv[0] + "*" + massiv[1] + "*" + massiv[2] + "=" + ch2);
        System.out.println("(" + massiv[0] + "+" + massiv[1] + "+" + massiv[2] +  ")/3=" + df.format(ch3));
    }
}
