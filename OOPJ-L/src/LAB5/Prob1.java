package LAB5;

import LAB5.General.employee;
import LAB5.Marketing.sales;
import java.util.Scanner;

public class Prob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Employee ID: ");
        int e = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Employee Name: ");
        String n = sc.nextLine();

        System.out.print("Basic Salary: ");
        int b = sc.nextInt();
        sales s = new sales(e, n, b);
        double earning = s.earning();
        double ta = s.tallowance();
        System.out.println("ID: " + s.getEmpid());
        System.out.println("Name: " + s.getEname());
        System.out.println("Basic Salary: " + b);
        System.out.println("Total Earnings: " + earning);
        System.out.println("Travelling Allowance: " + ta);
    }
}