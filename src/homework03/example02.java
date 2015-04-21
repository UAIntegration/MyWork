/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework03;

/**
 * Напишите функцию boolean IsDigit(char c), определяющую, является ли данный 
 * символ цифрой или нет. Задан единственный символ c.
 * @author Денис
 */

import java.io.*;
import java.util.*;

public class example02 {
    static Scanner in = new Scanner (System.in);
    static boolean IsDigit(char c)
    {
        return (c >= '0' && c <= '9')? true:false;
    }
    public static void main (String[] args)
    {
        char c = in.next().charAt(0);
        System.out.println(IsDigit(c)? "yes":"no");
    }
}
