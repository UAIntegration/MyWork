/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson03;

/**
 * Требуется определить, бьет ли конь, стоящий на клетке с указанными координатами 
 * (номер строки и номер столбца), фигуру, стоящую на другой указанной клетке. 
 * Вводятся четыре числа: координаты коня и координаты другой фигуры.
 * @author Денис
 */
import java.io.*;
import java.util.*;
public class example04 {
    static Scanner in = new Scanner (System.in);
    public static void main(String[] args)
    {
        System.out.println("Бъет ли конь фигуру?");
        System.out.println("   1 2 3 4 5 6 7 8  \n   ---------------  \n8 |* * * * * * * *| 8");
        System.out.println("7 |* * * * * * * *| 7\n6 |* * * * * * * *| 6\n5 |* * * * * * * *| 5");
        System.out.println("4 |* * * * * * * *| 4\n3 |* * * * * * * *| 3\n2 |* * * * * * * *| 2");
        System.out.println("1 |* * * * * * * *| 1\n   ---------------  \n   1 2 3 4 5 6 7 8  ");
        System.out.println("Введите координату 1 для коня");
        short k = in.nextShort();
        System.out.println("Введите координату 2 для коня");
        short l = in.nextShort();
        System.out.println("Введите координату 1 для фигуры");
        short m = in.nextShort();
        System.out.println("Введите координату 2 для фигуры");
        short n = in.nextShort();
        in.close();
        if (((k-1)==m&&(l-2)==n)||((k-2)==m&&(l-1)==n)||
                ((k-2)==m&&(l+1)==n)||((k-1)==m&&(l+2)==n)||((k+1)==m&&(l+2)==n)||
                ((k+2)==m&&(l+1)==n)||((k+2)==m&&(l-1)==n)||((k+1)==m&&(l-2)==n)) 
            System.out.println("YES");
        else System.out.println("NO");
    }
}
