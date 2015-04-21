/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework03;

/**
 * Дана строка, содержащая пробелы. Слова разделены ровно одним пробелом.
 * Найдите в ней самое длинное слово, выведите  это слово и его длину
 * @author Денис
 */

import java.io.*;
import java.util.regex.*;

public class example01 {
    public static void main (String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку");
        String str = br.readLine().trim();
        Pattern p = Pattern.compile(" ");
        Matcher m = p.matcher(str);
        int counter = 1;
        while(m.find()) counter++;
        String[] words = new String [counter];
        words=str.split(" ", counter);
        int maxlenth = 0;
        for (int i=1; i<counter; i++) maxlenth = words[i].length()>words[i-1].length()? i:maxlenth;
        System.out.println(words[maxlenth] + "\r\n" + words[maxlenth].length());
    }
}
