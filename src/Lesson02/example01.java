/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson02;

import java.io.*;
/**
 * 1. Дано двузначное число. Найдите число десятков в нем.
 * 2. Дано натуральное число. Найдите число десятков в его десятичной записи 
 * (то есть вторую справа цифру его десятичной записи).
 * @author Денис
 */
public class example01 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("1. Введите двузначное число");
        str = br.readLine();
        int a = Integer.parseInt(str);
        System.out.println("Число десятков - " + a/10);
        System.out.println("2. Введите натуральное число");
        str = br.readLine();
        System.out.println("Число десятков - " + str.toCharArray()[str.length() - 2]);
    }
}
