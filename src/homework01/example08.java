/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework01;

/**
 * Дано натуральное число n. Выведите в порядке возрастания 
 * все трехзначные числа, сумма цифр которых равна n. 
 * @author Денис
 */

import java.util.*;
public class example08 {
    static Scanner in = new Scanner (System.in);
    public static void main (String[] args)
    {
        System.out.println("Введите число n");
        int n = in.nextInt();
        int a, b, c;
        for (int i =100; i<1000; i++)
        {
            a=i/100;
            b=(i-a*100)/10;
            c=i-a*100-b*10;
            if (a+b+c == n) System.out.println(a + "" + b + "" + c);
        }
    }
}
