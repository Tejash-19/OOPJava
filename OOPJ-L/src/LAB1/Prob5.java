package LAB1;
import java.util.Scanner;
public class Prob5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String fname=sc.nextLine();
        System.out.println("Enter second name: ");
        String sname=sc.nextLine();
        System.out.println("Name: "+sname+" "+fname);
        sc.close();
    }
}
