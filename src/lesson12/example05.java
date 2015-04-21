/*
 * 
 */
package lesson12;

import java.util.*;
import java.io.*;

public class example05 {
    public static void main(String[] args) throws IOException
    {
        Scanner inner = new Scanner(System.in);
        int SIZE1 = inner.nextInt();
        int SIZE2 = inner.nextInt();
        int[] list1 = new int [SIZE1];
        int[] list2 = new int [SIZE2];
        for (int i = 0; i < list1.length; i++) list1[i] = inner.nextInt();
        for (int i = 0; i < list2.length; i++) list2[i] = inner.nextInt();
        for (int i = 0; i < list2.length; i++) search(list1,list2[i]);
            
    }
    static void search(int[] list, int key)
    {
        int left = 0;
        int right = list.length;
        int mid = 0;
        int left0 = 0;
        int right0 = 0;
        int temp =0;
        while (!(left >= right))
        {
            mid = left + (right - left) / 2;

            if (list[mid] == key)
            {
                temp = 1;
                left0 = mid;
                if (left0 != 0){
                    while (key==list[left0] && left0 != 0)
                    {
                        if (list[left0 - 1] == key) left0--;
                        else break;
                    }
                }
                System.out.print(left0+1 + " ");
                right0 = mid;
                if (right0 != list.length){
                    while (key==list[right0] && right0 != list.length-1)
                    {
                        if (list[right0 + 1] == key) right0++;
                        else break;
                    }
                }
                System.out.println(right0+1);
            }

            if (list[mid] > key)
                right = mid;
            else
                left = mid + 1;
        }
        if (temp == 0) System.out.println(0);
    }
}