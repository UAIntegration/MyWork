package lesson14;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/** 
* Calculate Primes -- находит столько простых чисел, сколько сможет найти за десять  
* секунд   
*/  

public class CalculatePrimes extends Thread { 
 

public static final int MAX_PRIMES = 1000000; 
public static final int TEN_SECONDS = 10000; 
 
public volatile boolean finished = false; 
 

public void run() { 
    int[] primes = new int[MAX_PRIMES]; 
    int count = 0; 
 
    for (int i=2; count<MAX_PRIMES; i++) {
    // Проверка, не сработал ли таймер 
        if (finished) { 
            break; 
        } 

        boolean prime = true; 
        for (int j=0; j<count; j++) { 
            if (i % primes[j] == 0) { 
                prime = false; 
                break; 
            } 
        } 

        if (prime) { 
            primes[count++] = i; 
            System.out.println("Found prime: " + i); 
        }
    } 
} 

/*public static void main(String[] args) { //try catch
    CalculatePrimes calculator = new CalculatePrimes(); 
    calculator.start(); 
    try { 
        Thread.sleep(TEN_SECONDS); 
    } 
    catch (InterruptedException e) { 
        // неудача 
    } 
 
calculator.finished = true; 
    }*/

public static void main(String[] args) {
    final Timer timer = new Timer();
    
    final CalculatePrimes calculator = new CalculatePrimes();
    calculator.start();
    
    timer.schedule(new TimerTask(){public void run(){calculator.finished = true;timer.cancel();}}, TEN_SECONDS);
}
}

