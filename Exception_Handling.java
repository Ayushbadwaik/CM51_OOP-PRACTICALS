import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner Ayush = new Scanner(System.in);
        try {
            int x = Ayush.nextInt();
            int y = Ayush.nextInt();
           
            int r = divide(x, y);
            System.out.println("Result: " + r);
        } catch (ArithmeticException e) {
           
            System.out.println("Division by zero is not allowed.");
        } catch (Exception e) {
           
            System.out.println("Invalid input. Please enter valid integers.");
        } finally {
        
            Ayush.close();
        }
    }

    public static int divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return x / y;
    }}