import java.util.Scanner;
public class Solution{
    public static void main(String [] args){
        Scanner ayush = new Scanner(System.in);
        String Bittu = ayush.nextLine();
        String [] Bhai = Bittu.trim().split("\\s+");
        System.out.println(Bhai[Bhai.length - 1 ]+ "," + Bhai[0]);
    }
}