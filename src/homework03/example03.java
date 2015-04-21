package homework03;

/**
 * Дано число n. Создайте массив A[2*n+1][2*n+1] и заполните его по спирали, 
 * начиная с числа 0 в центральной клетке A[n+1][n+1]. Спираль выходит вверх, 
 * далее закручивается против часовой стрелки.
 * @author Денис
 */

import java.util.*;

public class example03 {
    static Scanner in = new Scanner (System.in);
    public static void main (String[] args)
    {
        int n = in.nextInt();
        int massiv[][] = new int [2*n+1][2*n+1];
        int i=0;
        int x = (2*n+1)/2;
        int y = (2*n+1)/2;
        int k = 1;
        massiv[x][y]=i;
        for (int set=0; set<n; set++)
        {
            //Up заполняем вверх
            for (int j=0; j<k; j++)
            {
                x = x - 1;
                i++;
                massiv[x][y]=i;
            }
            //Left влево
            for (int j=0; j<k; j++)
            {
                y = y - 1;
                i++;
                massiv[x][y]=i;
            }
            //Down вниз
            for (int j=0; j<(k+1); j++)
            {
                x = x + 1;
                i++;
                massiv[x][y]=i;
            }
            //Right вправо
            for (int j=0; j<(k+1); j++)
            {
                y = y + 1;
                i++;
                massiv[x][y]=i;
            }
            k = k + 2;
        }
        for (int j=0; j<k-1; j++)
        {
            x = x - 1;
            i++;
            massiv[x][y]=i;
        }
        
        for (int j=0; j<(2*n+1); j++)
        {
            for (int m=0; m<(2*n+1); m++) System.out.printf("%3s",massiv[j][m]);
            System.out.println("");
        }
    }
}
