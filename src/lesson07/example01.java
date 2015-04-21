/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson07;

/**
 * Подсчитать количество слов "Татьяна" в "Война и мир"
 * @author Денис
 */
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.text.DecimalFormat;
public class example01 {
    
    public static void main (String[] args) throws IOException
    {
        DecimalFormat df = new DecimalFormat("#.###");
        Scanner in = new Scanner(new BufferedReader(new FileReader("D:\\Герои.txt")));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("D:\\reporthero.txt", true), "UTF-8"));
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
        String[] hero = new String [counter];
        int[] herocount = new int [counter];
        hero=temp.split("\r\n", counter);
        for (int i=0; i<counter; i++) herocount[i]=0;
//*************************************************************        
        Scanner in2 = new Scanner(new BufferedReader(new FileReader("D:\\Толстой Лев. Война и мир.txt")));
        temp = "";
        while(in2.hasNext())
        temp += in2.nextLine() + "\\s";
        String[] finder = temp.trim().split("[,;:.!?\\s]+");
        int total = 0;
        for (int j=0; j<finder.length; j++){
            for (int i=0; i<counter; i++){
                if (finder[j].equals(hero[i])) herocount[i]++;
            }
        }
        for (int i=0; i<counter; i++) total = total + herocount[i];
        for (int i=0; i<counter; i++) pw.println(hero[i] + " - " + herocount[i] + ", " + df.format((double)herocount[i]/(total/100)) + "%");
        pw.flush();
        pw.close();
        System.out.println("Результат записан в файл D:\\reporthero.txt");
    }
}
