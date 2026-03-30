package LAB4;
import java.util.Scanner;
abstract class Student
{
    long roll;
    long reg_no;
    void getinput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Roll No. = ");
        roll = sc.nextLong();
        System.out.print("Registration No. = ");
        reg_no=sc.nextLong();
    }
    abstract void course();
}
class kiitian extends Student{
    void course(){
        System.out.println("Roll No. = "+roll);
        System.out.println("Registration No. = "+reg_no);
        System.out.println("Course = B.Tech(Computer Science & Engg)");
    }
}
public class Prob1 {
    public static void main(String[] args){
        kiitian k = new kiitian();
        k.getinput();
        k.course();
    }
}
