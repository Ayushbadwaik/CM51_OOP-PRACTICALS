import java.util.Scanner;
class PrintSequence implements Runnable {
     int n;
    static int bittu = 0;
     static Object lock = new Object();
   int ayush;
    public PrintSequence(int n, int ayush) {
        this.n = n;
        this.ayush = ayush;
    }
    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            synchronized (lock) {
                while (bittu % 2 != ayush) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }}
                System.out.print((bittu + 1) * 5 + " ");
                bittu++;
                lock.notifyAll();
            }}}}
public class Solution {
    public static void main(String ... args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        Thread AI = new Thread(new PrintSequence(n, 0));
        Thread ML = new Thread(new PrintSequence(n, 1));
        AI.start();
        ML.start();
    }
}