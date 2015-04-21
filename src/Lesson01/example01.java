/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson01;

/**
 * найти большее из 3-х введенных чисел
 * @author Денис
 */
public class example01 {
    public static void main(String[] args) {
        int ch1, ch2, ch3;
        ch1 = 3;
        ch2 = 5;
        ch3 = 1;
        if(ch1>ch2 && ch1>ch3) System.out.println("Число 1 - '" + ch1 + "' - больше всех");
        else if(ch2>ch3) System.out.println("Число 2 - '" + ch2 + "' - больше всех");
        else System.out.println("Число 3 - '" + ch3 + "' - больше всех");
        // TODO code application logic here
    }
}
