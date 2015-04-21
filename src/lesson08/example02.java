/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson08;

/**
 * Дана строка, Вам требуется преобразовать все идущие подряд пробелы в один.
 * @author Денис
 */
import java.io.*;

public class example02 {
    public static void main (String[] args) throws IOException
    {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));
        String str = scan.readLine();
        System.out.println(str.replaceAll("([\\s])\\1+", "$1"));
    }
}
