/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson01;

/**
 * N школьников делят K  яблок поровну, неделящийся остаток остается в корзинке. 
 * Сколько яблок достанется каждому школьнику?
 * Сколько яблок останется в корзинке?
 * Программа получает на вход числа Nи K и должна вывести искомое количество яблок.
 * @author Денис
 */
import java.io.*;
public class example03 {
    public static void main(String[] args) throws IOException
    {
        int N, K;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("N школьников делят K  яблок поровну, неделящийся остаток остается в корзинке.");
        System.out.println("Сколько школьников?");
        str = br.readLine();
        N = Integer.parseInt(str);
        System.out.println("Сколько яблок?");
        str = br.readLine();
        K = Integer.parseInt(str);
        System.out.println("Ребята получат по " + K/N + " яблок. " + K%N + " яблок(а) останется в корзине.");
    }
}
