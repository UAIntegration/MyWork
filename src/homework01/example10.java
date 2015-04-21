/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework01;

/**
 * устройство, выдающее каждую секунду очередное число последовательности 
 * 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5 Дано количество секунд (от 1 до 1000000), 
 * которые работает генератор после включения. 
 * @author Денис
 */

import java.util.*;
public class example10 {
    static Scanner in = new Scanner (System.in);
    public static void main (String[] args)
    {
            String res = "";
            int n, total=0;
            System.out.println("Введите количество секунд");
            n = in.nextInt();
            for (int i=0; i<n; i++){
                    total++;
                    for (int j=0; j<total; j++){
                        res = res + (i+1);
                    }
            }
            System.out.println(res.substring(0,n));
    }
}
