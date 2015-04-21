/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson06;

/**
 * Где находится самый уязвимый участок стены? Участок стены является уязвимым, 
 * если он целиком состоит из подряд идущих рядов, высота которых меньше 5 и 
 * ограничен с обеих сторон либо границами стены, либо рядами блоков максимальной высоты.
 * Один участок стены считается более уязвимым чем другой, если для его полного 
 * восстановления понадобится больше блоков.
 * Определите номера рядов, с которого начинается и которым заканчивается самый 
 * уязвимый участок стены, а также количество блоков, которые необходимы для его 
 * полного восстановления. Если возможны несколько вариантов ответа, выведите любой.
 * @author Денис
 */

import java.util.*;
import java.io.*;
public class example01 {
    static Scanner in = new Scanner (System.in);
    public static void main (String[] args) throws IOException
    {
        //Scanner in = new Scanner(new BufferedReader(new FileReader("D:\\input.txt")));
        //PrintWriter out = new PrintWriter(new FileWriter("D:\\output.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длину стены N");
        int N = in.nextInt();
        System.out.println("Введите через пробел высоту каждого ряда стены (от 0 до 5)");
        int data[] = new int [N];
        int dataold[] = new int [N+2];
        int j=0;
        String str = br.readLine().trim();
        char[] chars = str.toCharArray();
        String temps = "";
        for (int i=0; i<str.length()-1; i++)
        {
            if (chars[i] == ' ')
            {
                    data[j]=Integer.parseInt(temps);
                    j++;
                    i++;
                    temps = "";
            }
            temps = temps + Character.toString(chars[i]);
        }
        data[j]=Integer.parseInt(temps);
        j= (j==N-1)? 0:1;
        for (int i=0; i<N; i++) {
            if (data[i]>5 || data[i]<0) j = 1;
            if (data[i]<=5){
                dataold[i+1]=data[i];
            }
        }
        dataold[0]=5;
        dataold[N+1]=5;
        System.out.println(j!=0? "Введены неверные данные стены":"Начинаем расчет...");
        int cost = 0;
        int res = 0;
        int first = 0;
        int last = 1;
        int last0 = 1;
        int flag = 0;
        int first0 = 0;
        int allfirst[] = new int [N+2];
        for (int i=0; i<N+2; i++){
            if (dataold[i] !=5 && dataold[i-1] == 5){
                allfirst[i]=i;
            }else allfirst[i]=1001;
        }
        if (j==0) for (int i=0; i<N+2; i++) {
            if (flag==0 && dataold[i] !=5) {
                first=i;
                flag=1;
            }
            cost = cost + (5 - dataold[i]);
            last = (i-1)!=first? (i-1):first;
            if (dataold[i] == 5) {
                if (cost>res && last != first){
                    res=cost;
                    last0 = (i-1);
                }
                cost = 0;
            }
        }
        for (int i=0; i<N+2; i++){
            if (last0>allfirst[i]) first0 = allfirst[i];
        }
        System.out.println(first0 + " " + last0 + " " + res);
    }
}