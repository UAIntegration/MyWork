/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson03;

/**
 * Требуется определить, бьет ли ладья, стоящая на клетке с указанными координатами 
 * (номер строки и номер столбца), фигуру, стоящую на другой указанной клетке. 
 * Вводятся четыре числа: координаты ладьи (два числа) и координаты другой фигуры (два числа), 
 * каждое число вводится в отдельной строке.
 * @author Денис
 */
import java.io.*;
import java.util.*;
public class example01 {
    static Scanner in = new Scanner (System.in);
    public static void main(String[] args)
    {
        System.out.println("Бъет ли ладья фигуру?");
        System.out.println("   1 2 3 4 5 6 7 8  \n   ---------------  \n8 |* * * * * * * *| 8");
        System.out.println("7 |* * * * * * * *| 7\n6 |* * * * * * * *| 6\n5 |* * * * * * * *| 5");
        System.out.println("4 |* * * * * * * *| 4\n3 |* * * * * * * *| 3\n2 |* * * * * * * *| 2");
        System.out.println("1 |* * * * * * * *| 1\n   ---------------  \n   1 2 3 4 5 6 7 8  ");
        System.out.println("Введите координату 1 для ладьи");
        short x1 = in.nextShort();
        System.out.println("Введите координату 2 для ладьи");
        short y1 = in.nextShort();
        System.out.println("Введите координату 1 для фигуры");
        short x2 = in.nextShort();
        System.out.println("Введите координату 2 для фигуры");
        short y2 = in.nextShort();
        in.close();
        if (x1 == x2 || y1 == y2) System.out.println("YES");
        else System.out.println("NO");
    }
}
