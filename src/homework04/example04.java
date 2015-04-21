package homework04;

/**
 * что одну пару обуви можно надеть на другую, если она хотя бы на три размера больше. 
 * В магазин пришел покупатель. Требуется определить, какое наибольшее количество 
 * пар обуви сможет предложить ему продавец так, чтобы он смог надеть их все одновременно.
 * Сначала вводится размер ноги покупателя (обувь меньшего размера он надеть не сможет), 
 * затем количество пар обуви в магазине и размер каждой пары
 * @author Денис
 */
import java.util.*;
public class example04 {
    static Scanner inner = new Scanner (System.in);
    public static void main (String[] args)
    {
        int current = inner.nextInt();
        int SIZE = inner.nextInt();
        int massiv[] = new int [SIZE];
        for (int i=0; i<SIZE; i++) massiv[i]=inner.nextInt();
        Arrays.sort(massiv);
        int count = 0;
        int first=0;
        if(massiv[0]==current || massiv[0]==(current+1) || massiv[0]==(current+2))
        {
            count++;
            current = massiv[0];
            first=1;
        }
        for (int i=first; i<SIZE; i++)
        {
            if(massiv[i]>=(current+3))
            {
                count++;
                current=massiv[i];
            }
        }
        System.out.println(count);
    }
}
