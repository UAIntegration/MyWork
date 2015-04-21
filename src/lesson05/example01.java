/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson05;

/**
 * Вероятность выиграша в лотерее?
 * n*(n-1)*(n-2)...*(n-k+1)
 * @author Денис
 */

import java.util.*;
import java.math.*;
public class example01 {
    static Scanner in = new Scanner (System.in);
    public static void main (String[] args)
    {
        System.out.println("Введите n");
        int n = in.nextInt();
        System.out.println("Введите k");
        int k = in.nextInt();
        int j=0;
        long res1=1;
        int res2=1;
        String top = "(";
        String bottom = "(";
        BigInteger res10= BigInteger.valueOf(1);
        BigInteger res20= BigInteger.valueOf(1);
        for (int i=n; i>=(n-k+1); i--){
            res1=res1*(n-j);
            res10 = res10.multiply(BigInteger.valueOf(n-j));
            top = top + (n-j) + "*";
            j++;
            res2=res2*j;
            res20 = res20.multiply(BigInteger.valueOf(j));
            bottom = bottom + j + "*";
        }
        //System.out.println("Вероятность выигрыша " + k + " номеров из " + n + " равна 1 из " + res1/res2 + " так как");
        System.out.println("Вероятность выигрыша " + k + " номеров из " + n + " равна 1 из " + res10.divide(res20) + " так как");
        //System.out.println(top.substring(0, top.length()-1) + ")/" + bottom.substring(0, bottom.length()-1) + ")= " + res1/res2);
        System.out.println(top.substring(0, top.length()-1) + ")/" + bottom.substring(0, bottom.length()-1) + ")= " + res10.divide(res20));
    }
}
