package lesson14;

/**
печатаем две строки
 */
public class TwoThreads {
    public static class Thread1 extends Thread{
        @Override
        public void run(){
            for (int i=0; i < 10; i++) System.out.println("2 - " + i);
        }
    }
    
    public static class Thread2 extends Thread{
        @Override
        public void run(){
            synchronized (Thread2.class){
            for (int i=0; i < 10; i++) System.out.println("1 - " + i);
            }
        }
    }
    
    public static void main(String args[]){
        new Thread2().start();
        new Thread2().start();
    }
}