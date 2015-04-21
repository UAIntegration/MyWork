package lesson10;

/**
 * сортировка вставками, выбором, Шеллом и слиянием
 * @author Денис
 */

import java.util.*;

public class example01 {
    static Scanner in = new Scanner (System.in);
    public static void main (String[] args) throws Exception
    {
        int SIZE = 10;
        double massiv[] = new double [SIZE];
        for(int i = 0; i <SIZE; i++ ) massiv[i] = (double)(1+(Math.random()*(100-1)));
        int choose = 0;
        System.out.println("Каким методом сортируем?\r\nвставками - 1; выбором - 2; "
                + "Шеллом - 3; слиянием - 4; Быстрая сортировка - 5; "
                + "Пирамидальная (J) сортировка - 6; Timsort - 7");
        while (choose!=1 & choose!=2 & choose!=3 & choose!=4 & choose!=5 & choose!=6 & choose!=7) choose=in.nextInt();
        if (choose ==1)
        {
            for(int i=1; i<SIZE; i++)     
            for(int j=i;j>0 && massiv[j-1]>massiv[j];j--)// пока j>0 и элемент j-1 > j, x-массив int
            {// меняем местами элементы j и j-1
                double temp = massiv[j-1];
                massiv[j-1]=massiv[j];
                massiv[j]=temp;
            }
        }
        if (choose==2)
        {
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
                // Меняем текущий элемент с минимальным
                double temp = massiv[i];
                massiv[i] = massiv[minValueIndex];
                massiv[minValueIndex] = temp;
            }
        }
        if (choose ==3)
        {
            int step = SIZE / 2;//инициализируем шаг.
            while (step > 0)//пока шаг не 0
            {
                for (int i = 0; i < (SIZE - step); i++)
                {
                    int j = i;
                    //будем идти начиная с i-го элемента
                    while (j >= 0 && massiv[j] > massiv[j + step])
                    //пока не пришли к началу массива
                    //и пока рассматриваемый элемент больше
                    //чем элемент находящийся на расстоянии шага
                    {
                        //меняем их местами
                        double temp = massiv[j];
                        massiv[j] = massiv[j + step];
                        massiv[j + step] = temp;
                        j--;
                    }
                }
                step = step / 2;//уменьшаем шаг
            }
        }
        if (choose ==4)
        {
            mergeSort(massiv, 0, massiv.length);
        }
        if (choose ==5)
        {
            doSort(massiv, 0, massiv.length-1);
        }
        if (choose ==6)
        {
            Pisort(massiv);
        }
        if (choose ==7)
        {
            Arrays.sort(massiv);
        }
        for (int i=0; i < massiv.length; i++ ) System.out.print( massiv[i] + "\r\n" );
    }
    public static void mergeSort(double[] a, int low, int high) {
        if (low + 1 < high) 
        {
            int mid = (low + high) >>> 1;
            mergeSort(a, low, mid);
            mergeSort(a, mid, high);

            int SIZE = high - low;
            double[] b = new double[SIZE];
            int i = low;
            int j = mid;
            for (int k = 0; k < SIZE; k++) {
                if (j >= high || i < mid && a[i] < a[j]) 
                {
                    b[k] = a[i++];
                }
                else {
                    b[k] = a[j++];
                }
            }
            System.arraycopy(b, 0, a, low, SIZE);
        }
    }
    public static void doSort(double[] array, int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                double temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur) cur = j;
                else if (j == cur) cur = i;
            }
        }
        doSort(array, start, cur);
        doSort(array, cur+1, end);
    }
    //С помошью неполной НЕУБЫВАЮЩЕЙ кучи 
    //крупные элементы закидываем поближе к концу массива
    static void reheap (double a[], int length, int i) throws Exception {
        
        //С этим родителем ещё не разобрались
        boolean done = false;
        
        //Запоминаем отдельно родителя 
        //и смотрим на его потомка слева
        double T = a[i];
        int parent = i;
        int child = 2 * (i + 1) - 1;
        
        //Просматриваем потомков, а также потомков потомков
        //и сравниваем их с родителем (если что - передвигаем потомков влево)
        //Цикл продолжается пока не выпадем за пределы массива
        //или пока не обменяем какого-нибудь потомка на родителя.		
        while ((child < length) && (!done)) {
            
            //Если правый потомок в пределах массива
            if (child < length - 1) {
                //То из левого и правого потомка выбираем наименьшего
                if (a[child] >= a[child + 1]) {
                    child += 1;
                }
            }
            
            //Родитель меньше потомков?
            if (T < a[child]) {
                
                //Тогда с этим родителем и его потомками разобрались
                done = true;
            
            //Родитель НЕ меньше чем наименьший из его потомков.
            //Перемещаем потомка на место родителя
            //и с родителем в цикле сравниваем уже потомков этого потомка			
            } else {			

                a[parent] = a[child];
                parent = child;
                child = 2 * (parent + 1) - 1;
                
            }
        }
        
        //Родитель, с которого всё начиналось
        //передвигается ближе к концу массива
        //(или остаётся на месте если не повезло)
        a[parent] = T;
        
    }

    //С помошью неполной НЕВОЗРАСТАЮЩЕЙ кучи 
    //мелкие элементы закидываем поближе к началу массива
    static void invreheap (double a[], int length, int i) throws Exception {
    
        //С этим родителем ещё не разобрались
        boolean done = false;

        //Запоминаем отдельно родителя 
        //и смотрим на его потомка слева
        double T = a[length - 1 - i];
        int parent = i;
        int child = 2 * (i + 1) - 1;
        
        //Просматриваем потомков, а также потомков потомков
        //и сравниваем их с родителем (если что - передвигаем потомков)
        //Цикл продолжается пока не выпадем за пределы массива
        //или пока не обменяем какого-нибудь потомка на родителя.
        while ((child < length) && (!done)) {
            
            //Если левый потомок в пределах массива
            if (child < length - 1) {
                
                //То из левого и правого потомка выбираем наибольшего
                if (a[length - 1 - child] <= a[length - 1 - (child + 1)]) {
                    child += 1;
                }
                
            }
            
            //Родитель больше потомков?
            if (T > a[length - 1 - child]) {
                
                //Тогда с этим родителем и его потомками разобрались
                done = true;
                
            } else {

                //Родитель НЕ больше чем наибольший из его потомков.
                //Перемещаем потомка на место родителя
                //и с родителем в цикле сравниваем уже потомков этого потомка	
                a[length - 1 - parent] = a[length - 1 - child];
                parent = child;
                child = 2 * (parent + 1) - 1;
                
            }
        }
        
        //Родитель, с которого всё начиналось
        //передвигается ближе к началу массива
        //(или остаётся на месте если не повезло)
        a[length - 1 - parent] = T;
        
    }

    //Основная процедура сортировки
    static void Pisort(double a[]) throws Exception {

        //Строим неубывающую кучу
        //Большие элементы из начала массива
        //закидываем поближе к концу
        for (int i = a.length-1; i >= 0; i--)
            reheap (a, a.length, i);
        
        //Строим невозрастающую кучу
        //Меньшие элементы из конца массива
        //закидываем поближе к началу
        for (int i = a.length - 1; i >= 0; i--)
            invreheap (a, a.length, i);
        
        //Массив ПОЧТИ упорядочен
        //Досортировываем вставками
        for (int j = 1; j < a.length; j++) {
            double T = a[j];
            int i = j - 1;
            while (i >= 0 && a[i] > T) {
                a[i + 1] = a[i];
                i -= 1;
            }
            a[i + 1] = T;
        }

    }
}
