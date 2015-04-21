/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework01;

/**
 * Витя работает недалеко от одной из станций кольцевой линии Московского метро, 
 * а живет рядом с другой станцией той же линии. Требуется выяснить, мимо какого 
 * наименьшего количества промежуточных станций необходимо проехать Вите по кольцу, 
 * чтобы добраться с работы домой.
 * @author Денис
 */

import java.util.*;
public class example06 {
    static Scanner in = new Scanner (System.in);
    public static void main (String[] args)
    {
        int N =0;
        do {
            System.out.println("Введите количество станций кольцевой линии N <100");
            N = in.nextInt();
        } while (N>100||N<1);
        int i=0, j=0;
        do {
            System.out.println("Введите номер станции посадки");
            i = in.nextInt();
        } while (i>N||i<1);
        do {
            System.out.println("Введите номер станции прибытия");
            j = in.nextInt();
        } while (j>N||j<1||j==i);
        int res=0;
        if (i>j)res = N-i-1+j;
        else res = ((j-i)<(N-j+1)) ? (j-i-1):(N-j+i-1);
        System.out.println(res);
    }
}
