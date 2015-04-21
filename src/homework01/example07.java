/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework01;

/**
 * Ящики и контейнер имеют вид прямоугольных параллелепипедов. Длина, ширина и высота 
 * первого ящика – l1, w1 и h1, соответствующие размеры второго ящика – l2, w2 и h2. 
 * Контейнер имеет длину, ширину и высоту lc, wc и hc. 
 * каждый из них должен остаться в строго вертикальном положении. Таким образом, 
 * ящики можно разместить рядом или один на другом. Для надежного закрепления в контейнере 
 * стороны ящиков должны быть параллельны его сторонам. Выясните, можно ли поместить ящики 
 * в контейнер с соблюдением указанных условий. 
 * @author Денис
 */

import java.util.*;

public class example07 {
    static Scanner in = new Scanner (System.in);
    public static void main (String[] args)
    {
        int l1,l2,lc,w1,w2,wc,h1,h2,hc;
        System.out.println("Введите длину 1 ящика"); l1 = in.nextInt();
        System.out.println("Введите ширину 1 ящика"); w1 = in.nextInt();
        System.out.println("Введите высоту 1 ящика"); h1 = in.nextInt();
        System.out.println("Введите длину 2 ящика"); l2 = in.nextInt();
        System.out.println("Введите ширину 2 ящика"); w2 = in.nextInt();
        System.out.println("Введите высоту 2 ящика"); h2 = in.nextInt();
        System.out.println("Введите длину контейнера"); lc = in.nextInt();
        System.out.println("Введите ширину контейнера"); wc = in.nextInt();
        System.out.println("Введите высоту контейнера"); hc = in.nextInt();
        in.close();
        if (l1<=lc && l2<=lc && w1<=wc && w2<=wc && h1<=hc && h2<=hc){
            if ( (l1+l2)<=lc || (w1+w2)<=wc || (h1+h2)<=hc) System.out.println("YES");
            else if (( (w1+l2)<=wc && w2<=lc) || ( (w1+l2)<=lc && l1<=wc)) System.out.println("YES");
            else if (( (l1+w2)<=lc && l2<=wc) || ( (l1+w2)<=wc && w1<=lc)) System.out.println("YES");
            else System.out.println("NO");
        } else System.out.println("NO");
    }
}
