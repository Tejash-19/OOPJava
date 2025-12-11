package LAB1;
import java.util.Scanner;
public class Prob3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number for the month December 2025: ");
        int date=sc.nextInt();
        if(date>31||date<1){
            System.out.println("Invalid Date");
        }
        else {
            int d = date%7;
            switch (d) {
                case 0: {
                    System.out.println("Sunday");
                    break;
                }
                case 1: {
                    System.out.println("Monday");
                    break;
                }
                case 2: {
                    System.out.println("Tuesday");
                    break;
                }
                case 3: {
                    System.out.println("Wednesday");
                    break;
                }
                case 4: {
                    System.out.println("Thursday");
                    break;
                }
                case 5: {
                    System.out.println("Friday");
                    break;
                }
                case 6: {
                    System.out.println("Saturday");
                    break;
                }
            }
        }
        sc.close();
    }
}
