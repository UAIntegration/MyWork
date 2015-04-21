//двоичный поиск
package lesson12;

/**
 *
 * @author Денис
 */
import java.util.*;
import java.io.*;

public class example02 {
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(new BufferedReader(new FileReader("D:\\java\\l12e01.txt")));
        Scanner inner = new Scanner(System.in);
        int SIZE = 200000000;
        int[] list = new int [SIZE];
        for (int i = 0; i < list.length; i++) list[i] = (int)(1+(Math.random()*(1000-1)));;
        System.out.println("Enter your search digit:");
        int s = inner.nextInt();
        Arrays.sort(list);

        long startTime = System.currentTimeMillis();
        System.out.println("Search result is " + search(list, s));
        System.out.println("Min is " + min(list));
        System.out.println("Max is " + max(list));
        //System.out.println("Less than " + s + " = " + rank(list, s) + " digits");
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("программа выполнялась " + timeSpent + " миллисекунд");
    }
    static int min (int[] list)
    {
        return list[0];
    }
    static int max (int[] list)
    {
        return list[list.length-1];
    }
    static int rank (int[] list, int search)
    {
        int rank = 0;
        for (int i = 0; i < list.length; i++)
        {
            if (list[i] < search) rank++;
        }
        return rank;
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
