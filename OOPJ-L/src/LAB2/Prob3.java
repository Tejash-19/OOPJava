package LAB2;
import java.util.Scanner;
class box{
    int length;
    int width;
    int height;
    box(int length, int width, int height) {
        this.length = length;
        this.width  = width;
        this.height = height;
    }

    int volume() {
        int vol = this.length * this.width * this.height;
        return vol;
    }
}
class demo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int l= sc.nextInt();
        System.out.print("Enter the width: ");
        int w = sc.nextInt();
        System.out.print("Enter the height: ");
        int h = sc.nextInt();
        box b1 = new box(l,w,h);
        System.out.print("The volume of the box is: "+b1.volume());
    }
}
