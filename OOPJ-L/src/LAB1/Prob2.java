package LAB1;
import java.util.Scanner;
public class Prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark:");
        int mark = sc.nextInt();
        int g = mark / 10;
        if(mark > 100 || mark < 0) {
            System.out.println("Invalid Mark");
        }
        else {
            if(g == 10 || g == 9) {
                System.out.println("Grade is O.");
            }
            else if(g == 8) {
                System.out.println("Grade is E");
            }
            else if(g == 7) {
                System.out.println("Grade is A");
            }
            else if(g == 6) {
                System.out.println("Grade is B");
            }
            else if(g == 5) {
                System.out.println("Grade is C");
            }
            else {
                System.out.println("Failed");
            }
        }
        sc.close();
    }
}
