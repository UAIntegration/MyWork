/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson04;

/**
 * В переменной n хранится вещественное число с ненулевой дробной частью. 
 * Создайте программу, округляющую число n до ближайшего целого 
 * и выводящую результат на экран.
 * @author Денис
 */
import java.util.*;
public class example06 {
    static Scanner in = new Scanner (System.in);
    public static void main(String[] args)
    {
        System.out.println("Введите n");
        double n = in.nextDouble();
        System.out.println ((n>(double)1.5)? ((int)n+1):(int)n);
    }
}
