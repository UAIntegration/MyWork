package lesson11;

/**
 * Последовательность чисел назовем симметричной, если она одинаково читается как 
 * слева направо, так и справа налево. Требуется определить, какое минимальное 
 * количество и каких чисел надо приписать в конец этой последовательности, 
 * чтобы она стала симметричной.
 * Сначала вводится число N — количество элементов исходной последовательности 
 * (1 ≤ N ≤ 100). Далее идут N чисел — элементы этой последовательности, 
 * натуральные числа от 1 до 9
 * @author Денис
 */

import java.util.*;

public class example01 {
    static Scanner in = new Scanner (System.in);
    public static void main (String[] args)
    {
        int SIZE = in.nextInt();
        int massiv[] = new int [SIZE];
        for (int i=0; i<SIZE; i++) massiv[i]=in.nextInt();
        int result=0;
        for (int i=0; i<=(massiv.length/2); i++){
            if (massiv[i]!=massiv[massiv.length-i-1]) {
                result=1;
                break;
            }
        }
        if (result==0) System.out.println ("0");
        else {
            if(SIZE>5 && massiv[SIZE-1]==massiv[SIZE-5] && massiv[SIZE-2]==massiv[SIZE-4]) {
                System.out.println ((SIZE-5));
                for (int i=(SIZE-6); i>=0; i--) System.out.print (massiv[i] + " ");
            }
            else if(SIZE>4 && massiv[SIZE-1]==massiv[SIZE-4] && massiv[SIZE-2]==massiv[SIZE-3]) {
                System.out.println ((SIZE-4));
                for (int i=(SIZE-5); i>=0; i--) System.out.print (massiv[i] + " ");
            }
            else if(SIZE>2 && massiv[SIZE-1]==massiv[SIZE-3]) {
                System.out.println ((SIZE-3));
                for (int i=(SIZE-4); i>=0; i--) System.out.print (massiv[i] + " ");
            }
            else if(massiv[SIZE-1]==massiv[SIZE-2]) {
                System.out.println ((SIZE-2));
                for (int i=(SIZE-3); i>=0; i--) System.out.print (massiv[i] + " ");
            }
            else {
                System.out.println ((SIZE-1));
                for (int i=(SIZE-2); i>=0; i--) System.out.print (massiv[i] + " ");
            }
        }
    }
}
