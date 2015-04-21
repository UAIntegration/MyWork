package lesson14;

import java.util.Random;

public class TenThreads {private static class WorkerThread extends Thread{ 

    int max = Integer.MIN_VALUE; 
    int[]ourArray; 

    public WorkerThread(int[] ourArray){ 
        this.ourArray=ourArray; 
    }

    //Поиск максимального значения в некотором фрагменте массива 

    public void run(){ 
        for(int i=0; i < ourArray.length; i++)
            max = Math.max(max, ourArray[i]);
    }

    public int getMax(){ 
        return max;
    }
} 

private static int[][]getBigHairyMatrix(int SIZE){ 
    
    int[][] bigMatrix = new int[10][SIZE];
    /*{
    {61,62,63,64,65,66,67,68,69,70}, 
    {71,72,73,74,75,76,77,78,79,80}, 
    {10,91,92,93,94,95,96,97,98,99}, 
    {80,81,82,83,84,85,86,87,88,89}, 
    {1,2,3,4,5,6,7,8,9,10}, 
    {31,32,33,34,35,36,37,38,39,40}, 
    {51,52,53,54,55,56,57,58,59,50}, 
    {41,42,43,44,45,46,47,48,49,50}, 
    {21,22,23,24,25,26,27,28,29,40}, 
    {11,12,13,14,15,16,17,18,19,20} 
    };*/
    for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                bigMatrix[i][j] = Randomsnum();
                //System.out.print(bigMatrix[i][j] + " ");
            }
            //System.out.println();
        }
    return bigMatrix; 
} 
public static int Randomsnum(){
  int randoms = 0;
  Random rn = new Random();
  randoms = rn.nextInt(100) + 1;
  return randoms;
}

public static void main (String[]args){
    System.out.println("available processor count = " + Runtime.getRuntime().availableProcessors());
    int SIZE = 10000000;
    WorkerThread[]threads=new WorkerThread[10];
    
    int[][]bigMatrix=getBigHairyMatrix(SIZE); 
    int max=Integer.MIN_VALUE;
    
    //Выделение каждому потоку фрагмента матрицы, с которым он будет работать 
    for(int i=0;i<10;i++){ 
        threads[i] = new WorkerThread(bigMatrix[i]); 
        threads[i].start(); 
    } 

    //Ожидание завершения работы потока 
    try{
        for(int i=0;i<10;i++){
            threads[i].join();
            max=Math.max(max,threads[i].getMax());
        }
    }
    catch(InterruptedException e){ 
    //неудача 
    }
    System.out.println("Maximum value was = " + max);
}

}
