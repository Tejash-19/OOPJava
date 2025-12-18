package LAB1;
import java.util.Scanner;
public class Prob5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String fname=sc.nextLine();
        System.out.print("Enter last name: ");
        String lname=sc.nextLine();
        System.out.print("Name: "+lname+" "+fname);
        sc.close();
    }
}
