/**
 * В первой строке входных данных содержатся натуральные числа N и K (0NK100000 ). 
 * Во второй строке задаются N элементов первого массива, отсортированного по 
 * возрастанию, а в третьей строке – K элементов второго массива. Элементы обоих 
 * массивов - целые числа, каждое из которых по модулю не превосходит 109
 */
package lesson12;

import java.util.*;
import java.io.*;

public class example04 {
    public static void main(String[] args) throws IOException
    {
        Scanner inner = new Scanner(System.in);
        int SIZE1 = inner.nextInt();
        int SIZE2 = inner.nextInt();
        int[] list1 = new int [SIZE1];
        int[] list2 = new int [SIZE2];
        for (int i = 0; i < list1.length; i++) list1[i] = inner.nextInt();
        for (int i = 0; i < list2.length; i++) list2[i] = inner.nextInt();
        for (int i = 0; i < list2.length; i++) System.out.println( (search(list1,list2[i]))? "YES":"NO");
            
    }
    static boolean search(int[] list, int key)
    {
        int left = 0;
        int right = list.length;
        int mid = 0;
        while (!(left >= right))
        {
            mid = left + (right - left) / 2;

            if (list[mid] == key)
                return true;

            if (list[mid] > key)
                right = mid;
            else
                left = mid + 1;
        }
        return false;
    }
}