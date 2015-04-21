/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson08;

/**
 * Капитан Флинт зарыл клад на Острове сокровищ. Он оставил описание, как найти клад. 
 * Описание состоит из строк вида: "North 5", где  слово – одно из "North", "South", 
 * "East", "West", – задает направление движения, а  число – количество шагов, которое 
 * необходимо пройти в этом направлении. Напишите программу, которая по описанию пути 
 * к кладу определяет точные координаты клада, считая, что начало координат находится 
 * в начале пути, ось OX направлена на восток, ось OY – на север. 
 * @author Денис
 */
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class example03 {
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(new BufferedReader(new FileReader("D:\\java\\l08e03.txt")));
        String temp = "";
        int x=0, y=0;
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
        for (int i=0; i<list.length; i++){
            System.out.println(list[i]);
            if (list[i].substring(0 , list[i].indexOf(' ')).equals("North")) y= y + Integer.parseInt(list[i].substring(list[i].indexOf(' ')+1, list[i].length()));
            if (list[i].substring(0 , list[i].indexOf(' ')).equals("South")) y= y - Integer.parseInt(list[i].substring(list[i].indexOf(' ')+1, list[i].length()));
            if (list[i].substring(0 , list[i].indexOf(' ')).equals("West")) x= x - Integer.parseInt(list[i].substring(list[i].indexOf(' ')+1, list[i].length()));
            if (list[i].substring(0 , list[i].indexOf(' ')).equals("East")) x= x + Integer.parseInt(list[i].substring(list[i].indexOf(' ')+1, list[i].length()));
        }
        System.out.println(x + " " + y);
    }
}
