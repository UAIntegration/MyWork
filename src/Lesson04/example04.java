/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson04;

/**
 * Необходимо определить, получает ли животное достаточное количество питательных веществ. 
 * Известно, что животному требуется в сутки X белков, Y жиров и Z углеводов.
 * животное получает в сутки N продуктов питания, и для каждого из них известны 
 * Ai, Bi, Ci и Qi – соответственно, энергетическая ценность единицы продукта в белках, 
 * жирах и углеводах и количество единиц этого продукта
 * Все числа – действительные, заданные с точностью до 5 знаков после запятой
 * @author Денис
 */
import java.util.*;
public class example04 {
    static Scanner in = new Scanner (System.in);
    public static void main (String[] args)
    {
        System.out.println("Введите х");
        float x = in.nextFloat();
        System.out.println("Введите y");
        float y = in.nextFloat();
        System.out.println("Введите z");
        float z = in.nextFloat();
        System.out.println("Введите N - количество продуктов");
        int N = in.nextInt();
        float a[] = new float [N];
        float b[] = new float [N];
        float c[] = new float [N];
        float q[] = new float [N];
        for (int j=0; j<N; j++){
            System.out.println("Введите a" + (j+1));
            a[j] = in.nextFloat();
            System.out.println("Введите b" + (j+1));
            b[j] = in.nextFloat();
            System.out.println("Введите c" + (j+1));
            c[j] = in.nextFloat();
            System.out.println("Введите q" + (j+1));
            q[j] = in.nextFloat();
        }
        float x0 =0;
        float y0 =0;
        float z0 =0;
        for (int j=0; j<N; j++){
            x0 = x0 + (float) a[j] * q[j];
            y0 = y0 + (float) b[j] * q[j];
            z0 = z0 + (float) c[j] * q[j];
        }
        if (x0>=x && y0>=y && z0>=z) System.out.println("YES");
        else System.out.println("NO");
    }
}
