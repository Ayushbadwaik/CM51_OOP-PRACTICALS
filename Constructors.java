import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class CompanyData {
    private String companyN;
    private String empN;
    private int empID;
    
    
    public CompanyData() {
        this.companyN= "Emtech Corp";
        this.empN = "Ravi Asati";
        this.empID = 1001;
    }
    
    
    public CompanyData(String companyN, String empN, int empID) {
        this.companyN = companyN;
        this.empN= empN;
        this.empID = empID;
    }
    
    
    public void displayInfo() {
        System.out.println("Company Name: " + companyN);
        System.out.println("Employee Name: " + empN);
        System.out.println("Employee ID: " + empID);
    }
}

public class Solution {

    public static void main(String[] args) {
       CompanyData company1 = new CompanyData();
        company1.displayInfo();
        
        System.out.println();
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        String empN = scanner.nextLine();
        scanner.close();
        
        
        CompanyData company2 = new CompanyData("XYZ Ltd", empN, 2002);
        company2.displayInfo();
    }
}