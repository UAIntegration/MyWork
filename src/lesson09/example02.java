/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson09;

/**
 * Во время проведения олимпиады каждый из участников получил свой идентификационный 
 * номер – натуральное число. Необходимо отсортировать список участников олимпиады 
 * по количеству набранных ими баллов. 
 * Если у некоторых участников одинаковые баллы, то их между собой нужно упорядочить 
 * в порядке возрастания идентификационного номера. 
 * @author Денис
 */

import java.io.*;
import java.util.*;

public class example02 {
    public static void main (String[] args) throws IOException
    {
        String locale = "D:\\java\\l09e02.txt";
        Scanner in = new Scanner (new BufferedReader (new FileReader(locale)));
        int totallenth = in.nextInt();
        int olimpres[][] = new int [totallenth][2];
        for (int i=0; i<totallenth; i++)
        {
            olimpres[i][0]= in.nextInt();
            olimpres[i][1]= in.nextInt();
        }
        for (int i= totallenth-1; i>=1; i--)
        {
            boolean sorted = true;
            for (int j = 0; j < i; j++)
            {
                if (olimpres[j][1] < olimpres[j+1][1]) 
                {
                    int temp = olimpres[j][1];
                    olimpres[j][1] = olimpres[j+1][1];
                    olimpres[j+1][1] = temp;
                    temp = olimpres[j][0];
                    olimpres[j][0] = olimpres[j+1][0];
                    olimpres[j+1][0] = temp;
                    sorted = false;
                }
                if (olimpres[j][1] == olimpres[j+1][1])
                {
                    if (olimpres[j][0] > olimpres[j+1][0])
                    {
                        int temp = olimpres[j][0];
                        olimpres[j][0] = olimpres[j+1][0];
                        olimpres[j+1][0] = temp;
                    }
                }
            }
            if(sorted) break;
        }
        for (int i=0; i<totallenth; i++)
        {
            System.out.print(olimpres[i][0]);
            System.out.print(" " + olimpres[i][1] + "\r\n");
        }
    }
}
