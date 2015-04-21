/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson09;

/**
 * Мальчик подошел к платной лестнице. Чтобы наступить на любую ступеньку, нужно 
 * заплатить указанную на ней сумму. Мальчик умеет перешагивать на следующую ступеньку, 
 * либо перепрыгивать через ступеньку. Требуется узнать, какая наименьшая сумма 
 * понадобится мальчику, чтобы добраться до верхней ступеньки.
 * @author Денис
 */

import java.io.*;
import java.util.*;

public class example01 {
    public static void main (String[] args) throws IOException
    {
        Scanner in = new Scanner(new BufferedReader(new FileReader("D:\\java\\l09e01.txt")));
        int[] allcost = new int [in.nextInt()];
        for (int i=0; i<allcost.length; i++) allcost[i]=in.nextInt();
        int totalamount=0;
        for (int i=0; i<allcost.length; i++)
        {
            if (i<allcost.length-3)
            {
                if (allcost[i]<allcost[i+1] && 
                        (
                        (allcost[i]+allcost[i+1])<(allcost[i+1]+allcost[i+2]) ||
                        (allcost[i]+allcost[i+1])<(allcost[i+1]+allcost[i+3]) ||
                        (allcost[i]+allcost[i+2])<(allcost[i+1]+allcost[i+2]) ||
                        (allcost[i]+allcost[i+2])<(allcost[i+1]+allcost[i+3])
                        ))
                {
                    totalamount = totalamount + allcost[i];
                } 
                else {
                    totalamount = totalamount + allcost[i+1];
                    i++;
                }
            } else if (i<allcost.length-2)
            {
                if (allcost[i]<allcost[i+1])
                {
                    totalamount = totalamount + allcost[i];
                }
                else {
                    totalamount = totalamount + allcost[i+1];
                    i++;
                }
            } else if (i == allcost.length-2) 
            {
                totalamount = totalamount + allcost[i+1];
                i++;
            }
            else if (i == allcost.length-1) totalamount = totalamount + allcost[i];
        }
        System.out.println(totalamount);
    }
}
