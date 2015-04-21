/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson01;

import java.io.*;

/**
 * Дано натуральное число. Выведите его последнюю цифру.
 * @author Денис
 */
public class example04 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Введите натуральное число");
        str = br.readLine();
        System.out.println("Последняя цифра цисла - " + str.toCharArray()[str.length() - 1]);
    }
}
