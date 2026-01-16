package LAB2;
import java.util.Scanner;
class student{
    int roll;
    String name;
    float cgpa;
    student(int roll,String name,float cgpa){
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }
    void display(){
        System.out.println("Roll : "+this.roll+" , Name : "+this.name+" , CGPA : "+this.cgpa);
    }
}
public class Prob5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students : ");
        int n = sc.nextInt();
        student[] a = new student[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the details of "+(i+1)+"th student:");
            System.out.print("Roll number : ");
            int r = sc.nextInt();
            sc.nextLine();
            System.out.print("Name : ");
            String m = sc.nextLine();
            System.out.print("CGPA : ");
            float c = sc.nextFloat();
            a[i] = new student(r,m,c);
        }
        System.out.println("The list of students is: ");
        student l =a[0];
        for(int j=0;j<a.length;j++){
            if(a[j].cgpa<l.cgpa){
                l=a[j];
            }
        }
        for(int i=0;i<n;i++){
            a[i].display();
        }
        System.out.println("The student with lowest cgpa is : "+l.name);
        sc.close();
    }
}