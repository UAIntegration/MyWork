package homework04;

/**
 * Определите, сколько обменов сделает алгоритм пузырьковой сортировки по 
 * возрастанию для данного массива. 
 * @author Денис
 */
import java.util.*;

public class example01 {
    static Scanner inner = new Scanner (System.in);
    public static void main (String[] args)
    {
        int SIZE = inner.nextInt();
        int massiv[] = new int [SIZE];
        for(int i = 0; i <SIZE; i++ ) massiv[i] = inner.nextInt();
        int total=0;
        int j=0;
        boolean swapped = true;
        do {
            swapped = false;
            j++;
            for(int i = 0; i < massiv.length - 1; i++) {
                if(massiv[i] > massiv[i + 1]) {
                    total++;
                    int temp = massiv[i];
                    massiv[i] = massiv[i + 1];
                    massiv[i + 1] = temp;
                    swapped = true;
                }
            }
        } while(swapped);
        System.out.println( total );
    }
}
