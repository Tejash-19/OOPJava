package LAB6;
import java.util.Scanner;
class Operations{
    int a;
    int b;
        void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("First number : ");
        a = sc.nextInt();
        System.out.println("Second number : ");
        b = sc.nextInt();
    }

    void div(){
        try {
            int d = a / b;
            System.out.println("Quotient : " + d);
            int e = a % b;
            System.out.println("Remainder : " + e);
        }
        catch(ArithmeticException e){
            System.out.println("Exception handled.");
        }
        finally {
            System.out.println("The denominator should not be 0.");
        }
    }
}
public class Prob2 {
    public static void main(String[] args){
        Operations o = new Operations();
        o.getdata();
        o.div();
    }
}
