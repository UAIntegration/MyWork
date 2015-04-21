/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson03;

/**
 * Требуется определить, можно ли от шоколадки размером n × m долек отломить k долек, 
 * если разрешается сделать один разлом по прямой между дольками 
 * (то есть разломить шоколадку на два прямоугольника). 
 * Вводятся 3 числа: n, m и k; k не равно n × m. 
 * Гарантируется, что количество долек в шоколадке не превосходит 30000.
 * @author Денис
 */
import java.io.*;
import java.util.*;
public class example06 {
    static Scanner in = new Scanner (System.in);
    public static void main(String[] args)
    {
        short k = 0, m = 0, n = 0;
        do {
        System.out.println("Введите число n");
        n = in.nextShort();
        System.out.println("Введите число m");
        m = in.nextShort();
        } while (n*m>30000);
        do {
        System.out.println("Введите число k, не равное " + m*n);
        k = in.nextShort();
        } while (k == n*m);
        if (k>n*m) System.out.println("NO");
        else if ( k%n == 0 || k%m == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
