import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        
        if (a == 1) {
            System.out.println("C Compiler");
        } else if (a == 2) {
            System.out.println("C++ Compiler");
        } else if (a == 3) {
            System.out.println("Java Compiler");
        } else if (a == 4) {
            System.out.println("Python Compiler");
        } else {
            System.out.println("Invalid input");
        }
        
        scanner.close();
    }
}