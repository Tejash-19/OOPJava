package LAB2;
import java.util.Scanner;
class prob{
    void subtract(int a,int b){
        System.out.println("The difference of integer and integer : "+(a - b));
    }
     void subtract(float a,int b){
        System.out.println("The difference of float and integer :"+(a - b));
     }
     void subtract(double a,double b){
        System.out.println("The difference of double and double :"+(a - b));
     }
     void subtract(float a,float b){
        System.out.println("The difference of float and float :"+(a - b));
     }
     void subtract(double a,int b){
        System.out.println("The difference of double and integer :"+(a - b));
     }
    void subtract(double a,float b){
        System.out.println("The difference of double and float :"+(a - b));
    }
}
public class Prob6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("The following subtraction operations can be done : ");
            System.out.println("1. Two integers");
            System.out.println("2. One integer and one float");
            System.out.println("3. One integer and one double");
            System.out.println("4. Two floats");
            System.out.println("5. One float and one double");
            System.out.println("6. Two doubles");
            System.out.println("7. Exit.");
            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:{
                    System.out.println("Enter the values: ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    prob p1 = new prob();
                    p1.subtract(a,b);
                    break;
                }
                case 2:{
                    System.out.println("Enter the values: ");
                    int a = sc.nextInt();
                    float b = sc.nextFloat();
                    prob p1 = new prob();
                    p1.subtract(a,b);
                    break;
                }
                case 3:{
                    System.out.println("Enter the values: ");
                    int a = sc.nextInt();
                    double b = sc.nextDouble();
                    prob p1 = new prob();
                    p1.subtract(a,b);
                    break;
                }
                case 4:{
                    System.out.println("Enter the values: ");
                    float a = sc.nextFloat();
                    float b = sc.nextFloat();
                    prob p1 = new prob();
                    p1.subtract(a,b);
                    break;
                }
                case 5:{
                    System.out.println("Enter the values: ");
                    float a = sc.nextFloat();
                    double b = sc.nextDouble();
                    prob p1 = new prob();
                    p1.subtract(a,b);
                    break;
                }
                case 6:{
                    System.out.println("Enter the values: ");
                    double a = sc.nextDouble();
                    double b = sc.nextDouble();
                    prob p1 = new prob();
                    p1.subtract(a,b);
                    break;
                }
                case 7:{
                    sc.close();
                    return;
                }
                default:{
                    System.out.println("Invalid choice.");
                    break;
                }
            }
        }
    }
}
