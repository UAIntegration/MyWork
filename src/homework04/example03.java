package homework04;

/**
 * Массив сортируется методом выбора по возрастанию (слева направо: ищется минимум 
 * и меняется с левым элементом). Сколько раз меняет свое место первый по порядку элемент? 
 * @author Денис
 */
import java.util.*;
public class example03 {
    static Scanner inner = new Scanner (System.in);
    public static void main (String[] args)
    {
        int SIZE = inner.nextInt();
        int massiv[] = new int [SIZE];
        int total=0;
        int was_first = 0;
        for(int i = 0; i <SIZE; i++ ) massiv[i] = inner.nextInt();
        for (int i = 0; i < SIZE; i++) {
                /* Найдем минимальный элемент на промежутке индексов [i; size);
                изначально его индекс равен i*/
                int minValueIndex = i;
                // Переберем оставшиеся элементы промежутка
                for (int j = i + 1; j < SIZE; j++) {
                    /* Если элемент в позиции j меньше элемента в позиции minValueIndex,
                    то необходимо обновить значение индекса*/
                    if (massiv[j] < massiv[minValueIndex]) minValueIndex = j;
                }
                if(was_first==i)
                {
                    total++;
                    was_first=minValueIndex;
                }
                // Меняем текущий элемент с минимальным
                int temp = massiv[i];
                massiv[i] = massiv[minValueIndex];
                massiv[minValueIndex] = temp;
            }
        System.out.println ( total );
    }
}
