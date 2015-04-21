/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson03;

/**
 * Требуется определить, бьет ли слон, стоящий на клетке с указанными координатами 
 * (номер строки и номер столбца), фигуру, стоящую на другой указанной клетке. 
 * Вводятся четыре числа: координаты слона и координаты другой фигуры.
 * @author Денис
 */
import java.io.*;
import java.util.*;
public class example02 {
    static Scanner in = new Scanner (System.in);
    public static void main(String[] args)
    {
        System.out.println("Бъет ли слон фигуру?");
        System.out.println("   1 2 3 4 5 6 7 8  \n   ---------------  \n8 |* * * * * * * *| 8");
        System.out.println("7 |* * * * * * * *| 7\n6 |* * * * * * * *| 6\n5 |* * * * * * * *| 5");
        System.out.println("4 |* * * * * * * *| 4\n3 |* * * * * * * *| 3\n2 |* * * * * * * *| 2");
        System.out.println("1 |* * * * * * * *| 1\n   ---------------  \n   1 2 3 4 5 6 7 8  ");
        System.out.println("Введите координату 1 для слона");
        short x1 = in.nextShort();
        System.out.println("Введите координату 2 для слона");
        short y1 = in.nextShort();
        System.out.println("Введите координату 1 для фигуры");
        short x2 = in.nextShort();
        System.out.println("Введите координату 2 для фигуры");
        short y2 = in.nextShort();
        in.close();
        if ((x1-y1)==(x2-y2)||(x1+y1)==(x2+y2)) System.out.println("YES");
        else System.out.println("NO");
    }
}
