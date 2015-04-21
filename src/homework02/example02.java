/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework02;

/**
 * Напишите программу, которая сортирует список работников компании по фамилии в 
 * алфавитном порядке. В списке не более 10000 строк, ввод заканчивается пустой строкой.
 * @author Денис
 */

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class example02 {
    public static void main (String[] args) throws IOException
    {
        Scanner in = new Scanner(new BufferedReader(new FileReader("D:\\java\\h02e02.txt")));
        System.out.println("Начали...");
        String temp = "";
        while(in.hasNext())
        temp += in.nextLine() + "\r\n";
        in.close();
        String substr = "\r\n";
        Pattern p = Pattern.compile(substr);
        Matcher m = p.matcher(temp);
        int counter = 0;
            while(m.find()) {
                counter++;
            }
        temp = temp.substring(0,temp.length()-2);
        String[] list = new String [counter];
        list=temp.split("\r\n", counter);
        String temp1;
        String temp2;
        for (int i=0; i<list.length; i++){
            temp1 = " " + list[i].substring(0 , list[i].lastIndexOf(' '));
            temp2 = list[i].substring(list[i].lastIndexOf(' ')+1, list[i].length());
            list[i]=temp2 + temp1;
        }
        Arrays.sort(list);
        for (int i=0; i<list.length; i++){
            temp1 = " " + list[i].substring(0 , list[i].indexOf(' '));
            temp2 = list[i].substring(list[i].indexOf(' ')+1, list[i].length());
            list[i]=temp2 + temp1;
        }
        for (int i=0; i<list.length; i++) System.out.println(i+1 + ". " + list[i]);
    }
}
