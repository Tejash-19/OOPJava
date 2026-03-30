package test;
import java.util.Scanner;
public class Prob1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("Enter 10 numbers: ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int even_count =0;
        int odd_count =0;
        for(int j=0;j<a.length;j++){
            if(a[j]%2==0){
                even_count++;
            }
            else{
                odd_count++;
            }
        }
        System.out.println("Even count : "+even_count+" Odd count :"+odd_count);
    }
}
