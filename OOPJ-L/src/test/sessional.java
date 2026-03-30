package test;
import java.util.Scanner;
class BankAccount{
    int accountnumber;
    double balance;
    BankAccount(int accountnumber , double balance){
        this.accountnumber = accountnumber;
        this.balance=balance;
    }
    void deposit(double d){
        balance = balance + d;
    }
    void withdraw(double w){
        balance = balance - w;
    }
}
public class sessional {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Account Number : ");
        int a = sc.nextInt();
        System.out.print("Balance : ");
        double b = sc.nextDouble();
        System.out.print("Deposit : ");
        double d = sc.nextDouble();
        System.out.print("Withdrawal : ");
        double w = sc.nextDouble();
        BankAccount obj = new BankAccount(a,b);
        obj.deposit(d);
        obj.withdraw(w);
        System.out.println("Balance : " + obj.balance);
    }
}
