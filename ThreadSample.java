
package questions;

public class ThreadSample extends Thread{
    public static void main(String args[]) {
        ThreadSample t1 = new ThreadSample();
        ThreadSample t2 = new ThreadSample();
        System.out.println("For 1st Thread");
        
        t1.start();
        System.out.println("For 2st Thread");
        t2.start();
    }
    public synchronized void  run() {
        for(int i=0;i<=100;i++) {
            System.out.println(i+" ");
        }
    }
    
}
