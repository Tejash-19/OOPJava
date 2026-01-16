package LAB3;
import java.util.Scanner;
class Account{
    int acc_no;
    double balance;
    void input(Scanner sc){
        System.out.print("Enter the Account number : ");
        acc_no = sc.nextInt();
        System.out.print("Enter the balance : ");
        balance = sc.nextDouble();
    }
    void display(){
        System.out.println("Account no. : "+acc_no);
        System.out.println("Balance : "+balance);
    }
}
class Person extends Account{
    String name;
    long aadhar_no;
    @Override
    void input(Scanner sc){
        super.input(sc);
        sc.nextLine();
        System.out.print("Enter the Name : ");
        name = sc.nextLine();
        System.out.print("Enter the Aadhar Number : ");
        aadhar_no = sc.nextLong();
    }
    void display(){
        super.display();
        System.out.println("Name : "+name);
        System.out.println("Aadhar number : "+aadhar_no);
    }
}
public class Prob4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details for Person 1 : ");
        Person p1 = new Person();
        p1.input(sc);
        System.out.println("Enter the details for Person 2 : ");
        Person p2 = new Person();
        p2.input(sc);
        System.out.println("Enter the details for Person 3 : ");
        Person p3 = new Person();
        p3.input(sc);
        System.out.println("Details for Person 1 : ");
        p1.display();
        System.out.println("Details for Person 2 : ");
        p2.display();
        System.out.println("Details for Person 3 : ");
        p3.display();
    }
}
