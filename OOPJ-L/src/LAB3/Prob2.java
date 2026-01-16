package LAB3;
import java.util.Scanner;
class plate{
    int l,w;
    plate(int l,int w){
        this.l=l;
        this.w=w;
    }
    void display(){
        System.out.println("Length = "+l+"\n"+"Width = "+w);
    }
}
class box extends plate{
    int h;
    box(int l,int b,int h){
        super(l,b);
        this.h=h;
    }
    @Override
    void display(){
        super.display();
        System.out.println("Height = "+h);
    }
}
class woodbox extends box{
    int t;
    woodbox(int l , int b,int h,int t){
        super(l,b,h);
        this.t=t;
    }
    @Override
    void display(){
        super.display();
        System.out.println("Thickness = "+t);
    }
}
public class Prob2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length :");
        int l = sc.nextInt();
        System.out.print("Enter the width :");
        int w = sc.nextInt();
        System.out.print("Enter the height :");
        int h = sc.nextInt();
        System.out.print("Enter the thickness :");
        int t = sc.nextInt();
        woodbox wb = new woodbox(l,w,h,t);
        wb.display();
    }
}
