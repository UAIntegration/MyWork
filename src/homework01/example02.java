/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework01;

/**
 * Даны координаты двух точек на плоскости, требуется определить, лежат ли они 
 * в одной координатной четверти или нет (все координаты отличны от нуля). 
 * Вводятся 4 числа: координаты первой точки (x1, y1) и координаты второй точки (x2, y2). 
 * @author Денис
 */
import java.util.*;
public class example02 {
    static Scanner in = new Scanner (System.in);
    public static void main(String[] args)
    {
        System.out.println("Введите координату первой точки x1");
        short x1 = in.nextShort();
        System.out.println("Введите координату первой точки y1");
        short y1 = in.nextShort();
        System.out.println("Введите координату второй точки x2");
        short x2 = in.nextShort();
        System.out.println("Введите координату второй точки y2");
        short y2 = in.nextShort();
        if (x1>0 && x2>0) System.out.println( ((y1>0 && y2>0)||(y1<0 && y2<0)) ? "YES" : "NO");
        else if (x1<0 && x2<0) System.out.println( ((y1>0 && y2>0)||(y1<0 && y2<0)) ? "YES" : "NO");
        else System.out.println("NO");
    }
}
