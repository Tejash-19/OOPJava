package LAB4;
import java.util.Scanner;
interface Emploee{
    void getDetails();
}
interface Manager extends Emploee{
    void getDeptDetails();
}
class Head implements Manager{
    int eid,did;
    String ename,dname;
    Head(int eid,int did,String ename,String dname){
        this.eid=eid;
        this.did=did;
        this.ename=ename;
        this.dname=dname;
    }
    public void getDeptDetails(){
        System.out.println("Department ID : "+did);
        System.out.println("Department Name : "+dname);
    }
    public void getDetails(){
        System.out.println("Employee ID : "+eid);
        System.out.println("Employee Name : "+ename);
    }
}
public class Prob4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Employee ID : ");
        int eid = sc.nextInt();
        sc.nextLine();
        System.out.print("Employee Name : ");
        String ename = sc.nextLine();
        System.out.print("Department ID : ");
        int did = sc.nextInt();
        sc.nextLine();
        System.out.print("Department Name : ");
        String dname = sc.nextLine();
        Head h = new Head(eid,did,ename,dname);
        h.getDetails();
        h.getDeptDetails();
    }
}
