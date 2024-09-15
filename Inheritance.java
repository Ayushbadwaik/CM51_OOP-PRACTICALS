import java.util.Scanner;
class Emerging_Technologie {}
class AIML extends Emerging_Technologie {
    AIML() {System.out.println("AIML instance created.");}}
class AIDS extends Emerging_Technologie {
    AIDS() {System.out.println("AIDS instance created.");}}
class CSE extends Emerging_Technologie {
    CSE() {System.out.println("CSE instance created.");}}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int CM23051 = scanner.nextInt();
        switch (CM23051) {
            case 1:new AIML();
                break;
            case 2:new AIDS();
                break;
            case 3:new CSE();
                break;
            default:System.out.println("Enter correct Number");
                break;
        }scanner.close();}}