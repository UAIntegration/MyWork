/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson01;

/**
 * Напишите программу, которая считывает два целых числа a и b и выводит наибольшее значение из них.
 * Числа — целые от 1 до 1000.
 * При решении задачи можно пользоваться только 
 * целочисленными арифметическими операциями +, -, *, //, %, =. 
 * Нельзя пользоваться нелинейными конструкциями: ветвлениями, циклами, 
 * функциями вычисления модуля, извлечения квадратного корня.
 * Использование функции max запрещено!
 * @author Денис
 */
import java.io.*;
public class example05 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Введите целое число а");
        str = br.readLine();
        int a = Integer.parseInt(str);
        System.out.println("Введите целое число b");
        str = br.readLine();
        int b = Integer.parseInt(str);
        boolean x=((a/b)*a != 0);
        boolean z=((b/a)*b != 0);
        System.out.println("Число " + a + " больше числа " + b + "?");
        int y = Boolean.compare(x, false);
        a=a*y;
        int t = Boolean.compare(z, false);
        b=b*t;
        System.out.print((char)(y*'Д'+(1-y)*'Н'));
        System.out.print((char)(y*'а'+(1-y)*'е'));
        System.out.print((char)((1-y)*'т'));
        System.out.println(a + " " + b);
    }
}
