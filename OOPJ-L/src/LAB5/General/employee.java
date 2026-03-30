package LAB5.General;

public class employee {
    protected int empid;
    private String ename;
    protected int basic;

    public employee(int empid, String ename, int basic) {
        this.empid = empid;
        this.ename = ename;
        this.basic = basic;
    }

    public double earning() {
        double da = 0.8 * basic;
        double hra = 0.15 * basic;
        return basic + da + hra;
    }

    public int getEmpid() {
        return empid;
    }

    public String getEname() {
        return ename;
    }
}