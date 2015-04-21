/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework01;

/**
 * На сковородку одновременно можно положить k котлет. Каждую котлету нужно 
 * с каждой стороны обжаривать m минут непрерывно. За какое наименьшее время 
 * удастся поджарить с обеих сторон n котлет? Вводятся 3 числа: k, m и n. 
 * Все числа не превосходят 32000
 * @author Денис
 */
import java.util.*;
public class example01 {
    static Scanner in = new Scanner (System.in);
    public static void main (String[] args)
    {
        System.out.println("Сколько макс котлет на сковородке - k");
        short k = in.nextShort();
        System.out.println("Введите кол-во минут для обжарки - m");
        short m = in.nextShort();
        System.out.println("Введите количество котлет для обжарки - n");
        short n = in.nextShort();
        System.out.println ((n%k==0)? (n/k)*m*2: ((n/k)+1)*m*2);
    }
}
