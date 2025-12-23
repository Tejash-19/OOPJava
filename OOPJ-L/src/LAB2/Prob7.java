package LAB2;
import java.util.Scanner;
    class Rect {
        double length;
        double breadth;
        Rect() {
            length = 0;
            breadth = 0;
        }
        Rect(double l, double b) {
            length = l;
            breadth = b;
        }
        void area() {
            double area = length * breadth;
            System.out.println("The area of the rectangle is : " + area);
        }
    }
public class Prob7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Rect r = new Rect();
        System.out.println("Area using default constructor : ");
        r.area();
        System.out.println("Area using parameterized constructor : ");
        System.out.println("Enter the length : ");
        double l = sc.nextDouble();
        System.out.println("Enter the breadth : ");
        double b = sc.nextDouble();
        Rect r1 = new Rect(l,b);
        r1.area();
        sc.close();
    }
}
