package LAB6;
import java.util.*;
class NegativeNumberException extends Exception{
    NegativeNumberException(String message){
        super(message);
    }
}
public class Prob3 {
    static int Process_input(int n) throws NegativeNumberException{
        if(n < 0){
            throw new NegativeNumberException("Negative number found.");
        } else{
            n = 2 * n;
            return n;
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number : ");
        int n = sc.nextInt();
        try{
            int result = Process_input(n);
            System.out.println("Positive Number found. " + "\nDouble : " + result);
        }
        catch(NegativeNumberException e){
            System.out.println("Exception caught : " + e.getMessage());
        }
    }
}
