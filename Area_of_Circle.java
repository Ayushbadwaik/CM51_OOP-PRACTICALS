import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        if (r <= 0) {
            System.out.println("Please enter a non-zero positive number for the radius.");
        } else {
            double ayush = Math.PI * r * r;
            double peri = 2 * Math.PI * r;
            System.out.printf("%.2f\n", ayush);
            System.out.printf("%.2f\n", peri);
        }
        scanner.close(); 
    }
}
