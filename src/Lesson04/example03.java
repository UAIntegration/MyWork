/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson04;

/**
 * В первый день спортсмен пробежал x километров, а затем он каждый день увеличивал 
 * пробег на 70% от предыдущего значения. По данному числу y определите номер дня, 
 * на который пробег спортсмена составит не менее y километров.
 * Числа положительные, действительные, не превосходят 1000, заданы с 
 * точностью до шести знаков после запятой.
 * @author Денис
 */
import java.util.*;
public class example03 {
    static Scanner in = new Scanner (System.in);
    public static void main (String[] args)    
    {
        System.out.println("Введите число x");
        float x = in.nextFloat();
        System.out.println("Введите число y");
        float y = in.nextFloat();
        int z =1;
        do{
            x=(float) (x*1.7);
            z++;
        }while(x<=y);
        System.out.println(z);
    }
}
