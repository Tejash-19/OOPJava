package LAB1;
import java.util.Scanner;

public class Prob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = sc.nextLine();
        System.out.println("Enter Roll Number:");
        long roll = sc.nextLong();
        System.out.println("Enter Section:");
        int sec = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Branch:");
        String branch = sc.nextLine();
        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + roll);
        System.out.println("Section : CSE" + sec);
        System.out.println("Branch : " + branch);
        sc.close();
    }
}
