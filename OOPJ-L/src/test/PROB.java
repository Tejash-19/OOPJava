package test;
import java.util.Scanner;
class InvalidNameException extends Exception{
    void show(){
        System.out.println("Name should have more than 2 characters.");
    }
}
class InvalidDOBException extends Exception{
    void show(){
        System.out.println("The year of birth should be between 2010 and 1970.");
    }
}
class KIITEE2025{
    String name;
    int dd;
    int mm;
    int yyyy;
    void getinfo(){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Name : ");
            name = sc.nextLine();
            if(name.length() < 2){
                InvalidNameException i = new InvalidNameException();
                throw i;
            }
        }
        catch(InvalidNameException e){
            e.show();
        }
        try{
            System.out.println("D.O.B :");
            System.out.print("Day :");
            dd = sc.nextInt();
            System.out.print("Month :");
            mm = sc.nextInt();
            System.out.print("Year :");
            yyyy = sc.nextInt();
            if(yyyy>2010 | yyyy<1970){
                InvalidDOBException j = new InvalidDOBException();
                throw j;
            }
        }
        catch(InvalidDOBException j){
            j.show();
        }
    }
}
public class PROB {
    public static void main(String[] args){
        KIITEE2025 k = new KIITEE2025();
        k.getinfo();
    }
}