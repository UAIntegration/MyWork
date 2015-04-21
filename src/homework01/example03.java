/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework01;

/**
 * Даны три натуральных числа a, b, c, записанные в отдельных строках. 
 * Определите, существует ли треугольник с такими сторонами.
 * @author Денис
 */
import java.util.*;
public class example03 {
    static Scanner in = new Scanner (System.in);
    public static void main (String[] args)
    {
        System.out.println("Введите длину стороны a");
        short a = in.nextShort();
        System.out.println("Введите длину стороны b");
        short b = in.nextShort();
        System.out.println("Введите длину стороны c");
        short c = in.nextShort();
        System.out.println( (a<(b+c) && b<(a+c) && c<(a+b)) ? "YES" : "NO");
    }
}
