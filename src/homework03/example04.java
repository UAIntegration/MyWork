package homework03;

/**
 * Требуется в каждую клетку квадратной таблицы размером NxN поставить ноль или 
 * единицу так, чтобы в любом квадрате размера KxK было ровно S единиц.
 * Во входном файле записаны три числа — N, K, S (1<=N<=100, 1<=K<=N, 0<=S<=K*K)
 * @author Денис
 */

import java.io.*;
import java.util.*;

public class example04 {
    public static void main (String[] args) throws IOException
    {
        Scanner in = new Scanner(new BufferedReader(new FileReader("D:\\java\\h03e04.txt")));
        PrintWriter out1 = new PrintWriter(new FileWriter("D:\\java\\h03e04out.txt"));
        int N = in.nextInt(), K = in.nextInt(), S = in.nextInt();
        //System.out.println( N + "" + K + "" + S);
        int massiv[][] = new int [N][N];
        
        out1.flush();
        out1.close();
    }
}
