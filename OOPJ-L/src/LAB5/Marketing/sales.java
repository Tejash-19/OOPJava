package LAB5.Marketing;

import LAB5.General.employee;

public class sales extends employee {

    public sales(int empid, String ename, int basic) {
        super(empid, ename, basic);
    }

    public double tallowance() {
        return 0.05 * earning();
    }
}