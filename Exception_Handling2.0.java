import java.util.Scanner;
public class Solution{
    public static void validate(int Ayush){
        if(Ayush < 18){
            throw new ArithmeticException("Invalid input. Please enter a valid integer.");
        } else {
            System.out.println("Welcome to vote!");
        }
    }
    public static void main(String ... args){
        Scanner scanner = new Scanner(System.in);
        int Ayush = scanner.nextInt();
        try{
            validate(Ayush);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}