package LAB3;
import java.util.Scanner;
class Plasticxy {
    double l;
    double b;
    void getdimension(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        l = sc.nextDouble();
        System.out.print("Enter the breadth : ");
        b = sc.nextDouble();
    }
    void calculate(){
        double ar = l * b;
        System.out.print("The 2D Plastic is of "+ar+" square ft. and the cost is "+40*ar+" rupees");
    }
}
class Plasticxyz extends Plasticxy {
    double h;
    void getdimension(){
        super.getdimension();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        h = sc.nextDouble();
    }
    void calculatee(){
        double ar = l * b * h;
        System.out.print("The 3D Plastic is of "+ar+" cubic ft. and the cost is "+60*ar+" rupees");
    }
}
public class Prob1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to plastic store");
        System.out.println("1. 2D sheets");
        System.out.println("2. 3D box");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: {
                Plasticxy sheet = new Plasticxy();
                sheet.getdimension();
                sheet.calculate();
                break;
            }
            case 2: {
                Plasticxyz box = new Plasticxyz();
                box.getdimension();
                box.calculatee();
                break;
            }
            default:
                System.out.println("Invalid choice");
        }
    }
}
