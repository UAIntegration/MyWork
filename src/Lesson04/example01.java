/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson04;

/**
 * Размеры шкафа A × B × C. Возможно ли его пронести через 
 * дверной проем размерами X × Y?
 * @author Денис
 */
import java.io.*;
import java.util.*;
public class example01 {
    static Scanner in = new Scanner (System.in);
    public static void main(String[] args)
    {
        System.out.println("Размеры шкафа: А х В х С \nВведите размер А");
        short a = in.nextShort();
        System.out.println("Введите размер B");
        short b = in.nextShort();
        System.out.println("Введите размер С");
        short c = in.nextShort();
        System.out.println("Дверной проем имеет размеры X x Y \nВведите размер Х");
        short x = in.nextShort();
        System.out.println("Введите размер Y");
        short y = in.nextShort();
        short res = 0;
        if (a<=x){
            if(b<=y || c<=y) res=1;
        } else if (a<=y){
            if(b<=x || c<=x) res=1;
        } else if (b<=x){
            if(a<=y || c<=y) res=1;
        } else if (b<=y){
            if(a<=x || c<=x) res=1;
        } else if (c<=x){
            if(a<=y || b<=y) res=1;
        } else if (c<=y){
            if(a<=x || b<=x) res=1;
        }
        System.out.println ((res==0) ? "NO":"YES");
    }
}
