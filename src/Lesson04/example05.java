/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson04;

/**
 * Определите среднее арифметическое элементов последовательности, завершающейся числом 0.
 * Число 0 в последовательность не входит. Числа, следующие за нулем, считывать не нужно.
 * Вводится последовательность целых чисел. Ввод завершается, когда будет введено число 0.
 * @author Денис
 */
import java.util.*;
public class example05 {
    static Scanner in = new Scanner (System.in);
    public static void main(String[] args){
        int i = 0;
        int test;
        System.out.println("Введите " + (i+1) + " число последовательности");
        int temp = 0;
        test = in.nextInt();
        if (test != 0){
            do {
                temp=temp+test;
                i++;
                System.out.println("Введите " + (i+1) + " число последовательности");
                test = in.nextInt();
            } while (test!=0);
        } System.out.println((double) temp / i);
    }
}
