/**
 * Вася загадал число от 1 до N. За какое наименьшее количество вопросов 
 * (на которые Вася отвечает "да" или "нет") Петя может угадать Васино число? 
 */
package lesson12;

import java.util.*;
import java.io.*;

public class example03 {
    public static void main(String[] args) throws IOException
    {
        Scanner inner = new Scanner(System.in);
        int SIZE = inner.nextInt();
        int[] list = new int [SIZE];
        for (int i = 0; i < list.length; i++) list[i] = i+1;
        int s = SIZE+1;
        Arrays.sort(list);
        search(list,s);
    }
    static boolean search(int[] list, int key)
    {
        int left = 0;
        int right = list.length;
        int mid = 0;
        int count = 0;
        while (!(left >= right))
        {
            mid = left + (right - left) / 2;

            if (list[mid] == key)
                return true;
            else count++;

            if (list[mid] > key)
                right = mid;
            else
                left = mid + 1;
        }
        System.out.println(count);
        return false;
    }
}