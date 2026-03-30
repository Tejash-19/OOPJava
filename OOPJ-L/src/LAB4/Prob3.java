package LAB4;
import java.util.Scanner;
interface Org{
    void earnings();
    void deductions();
    void bonus();
}
abstract class Manage implements Org{
    double basic,da,hra;
    Manage(double basic){
        this.basic = basic;
        this.da = 0.8 * basic;
        this.hra = 0.15 * basic;
    }
    public void earnings(){
        double e = basic + da + hra;
        System.out.println("Earnings : "+e);
    }
    public void deductions(){
        double d = basic * 12 / 100;
        System.out.println("Deductions : "+d);
    }
    public abstract void bonus();
}
class Substaff extends Manage{
    Substaff(double basic){
        super(basic);
    }
    public void bonus(){
        double b = basic/2;
        System.out.println("Bonus : "+b);
    }
}
public class Prob3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Basic Salary : ");
        double sal = sc.nextDouble();
        Substaff s = new Substaff(sal);
        s.earnings();
        s.deductions();
        s.bonus();
    }
}
