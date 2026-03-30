package LAB6;
import java.util.Scanner;

public class Prob1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        try{
            System.out.println("Enter the elements of the array : ");
            for(int i=0 ; i<=n;i++){
                a[i]=sc.nextInt();
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of Bound Exception handled");
        }
    }
}
