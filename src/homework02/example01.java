/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework02;

/**
 * Напишите программу, которая определяет, является ли заданная строка (возможно, 
 * содержащая пробелы) палиндромом, то есть верно ли, что она после удаления пробелов 
 * читается одинаково слева направо и справа налево
 * @author Денис
 */

import java.io.*;

public class example01 {
    public static void main (String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку");
        String str = br.readLine().replaceAll (" ","");
        int result=0;
        char[] chars = str.toCharArray();
        for (int i=0; i<=(chars.length/2); i++){
            if (chars[i]!=chars[chars.length-i-1]) {
                System.out.println("111");
                result=1;
                break;
            }
        }
        System.out.println ((result==0)? "YES":"NO");
    }
}
