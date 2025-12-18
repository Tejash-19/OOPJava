package LAB2;
import java.util.Scanner;
class rectangle{
    int length;
    int breadth;
    int area;
    int perimeter;
    rectangle(int length , int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    void read(){
        System.out.println("Length: "+length+"\n"+"Breadth: "+breadth);
    }
    void calculate(){
        area = this.length * this.breadth;
        perimeter = 2*(this.length + this.breadth);
    }
    void display(){
        System.out.println("Area: " +area);
        System.out.print("Perimeter: " +perimeter);
    }
}
public class Prob4 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length: ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth: ");
        int b= sc.nextInt();
        rectangle r1 = new rectangle(l,b);
        System.out.println("The dimensions are: ");
        r1.read();
        r1.calculate();
        System.out.println("The calculations on the rectangle are: ");
        r1.display();
        sc.close();
    }
}
