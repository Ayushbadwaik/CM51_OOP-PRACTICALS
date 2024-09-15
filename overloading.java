import java.util.Scanner;
public class VolumeCalculator {
    public static final double PI = 3.14;
    public static double volume(double s) {
        return s * s * s;
    }
    public static double volume(double length, double width, double height) {
        return length * width * height;
    }
    public static double volume(double ayush51, double height) {
        return PI * ayush51 * ayush51 * height;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cubes = scanner.nextDouble();
        if (cubes <= 0) {
            System.out.println("Enter Non Zero Value");
        } else {
            double cubeVolume = volume(cubes);
            System.out.printf("Cube :%.1f%n", cubeVolume);
        }
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        if (length <= 0 || width <= 0 || height <= 0) {
            System.out.println("Enter Non Zero Value");
        } else {
            double boVol = volume(length, width, height);
            System.out.printf("Rectangular Box :%.1f%n", boVol);
        }
        double ayush51 = scanner.nextDouble();
        double cylinderHeight = scanner.nextDouble();
        if (ayush51 <= 0 || cylinderHeight <= 0) {
            System.out.println("Enter Non Zero Value");
        } else {
            double cylinderVolume = volume(ayush51, cylinderHeight);
            double roVol = Math.round(cylinderVolume * 100.0) / 100.0;
            System.out.printf("Cylinder :%.2f%n", roVol);
        }
        scanner.close();}}