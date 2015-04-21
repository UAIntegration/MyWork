/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework01;

/**
 * Определите тип треугольника (остроугольный, тупоугольный, прямоугольный) с данными сторонами.
 * right для прямоугольного треугольника, acute для остроугольного треугольника, 
 * obtuse для тупоугольного треугольника или impossible, если входные числа не образуют треугольника.
 * @author Денис
 */
import java.util.*;
public class example04 {
    static Scanner in = new Scanner (System.in);
    public static void main (String[] args)
    {
        System.out.println("Введите длину стороны a");
        short a = in.nextShort();
        System.out.println("Введите длину стороны b");
        short b = in.nextShort();
        System.out.println("Введите длину стороны c");
        short c = in.nextShort();
        if (a>=(b+c) && b>=(a+c) && c>=(a+b)) System.out.println("impossible");
        else if ((a*a + b*b) == c*c) System.out.println("right");
        else if ((a*a+b*b) > c*c && (a*a+c*c) > b*b && (c*c+b*b) > a*a) System.out.println("acute");
        else System.out.println("obtuse");
    }
}
