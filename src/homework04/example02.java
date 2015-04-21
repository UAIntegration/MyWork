package homework04;

/**
 * Какое число окажется в середине, если расставить элементы массива по возрастанию? 
 * В первой строке дано одно натуральное нечетное число n ( 1 ≤ n < 1000 , 
 * n — нечетное) — количество элементов массива
 * @author Денис
 */
import java.util.*;

public class example02 {
    static Scanner inner = new Scanner (System.in);
    public static void main (String[] args)
    {
        int SIZE = inner.nextInt();
        int massiv[] = new int [SIZE];
        for(int i = 0; i <SIZE; i++ ) massiv[i] = inner.nextInt();
        Arrays.sort(massiv);
        System.out.println (massiv[SIZE/2]);
    }
}
