/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework01;

/**
 * Билет на одну поездку в метро стоит 15 рублей, билет на 10 поездок стоит 125 рублей, 
 * билет на 60 поездок стоит 440 рублей. Пассажир планирует совершить n поездок. 
 * Определите, сколько билетов каждого вида нужно приобрести, чтобы суммарное количество
 * оплаченных поездок было не меньше n, а общая стоимость приобретенных билетов – минимальна.
 * @author Денис
 */

import java.util.*;
public class example05 {
    static Scanner in = new Scanner (System.in);
    public static void main (String[] args)
    {
        System.out.println("Введите количество поездок n");
        int n = in.nextInt();
        //1 8 35
        int bil60 = 0;
        int bil10 = 0;
        int bil1 = 0;
        while (n>=35) {
            bil60++;
            n=n-60;
        }
        while (n>=9) {
            bil10++;
            n=n-10;
        }
        while (n>=1) {
            bil1++;
            n--;
        }
        System.out.println(bil1 + " " + bil10 + " " + bil60);
    }
}
