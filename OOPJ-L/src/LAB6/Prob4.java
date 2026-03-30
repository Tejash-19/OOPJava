package LAB6;
import java.util.*;

class HrsException extends Exception {
    HrsException(String message) {
        super(message);
    }
}
class MinException extends Exception {
    MinException(String message) {
        super(message);
    }
}
class SecException extends Exception {
    SecException(String message) {
        super(message);
    }
}

public class Prob4 {
    static void validateTime(int h, int m, int s) throws Exception {
        StringBuilder errors = new StringBuilder();

        if (h < 0 || h > 23) {
            errors.append("InvalidHourException -> Hours must be between 0 and 23.\n");
        }
        if (m < 0 || m > 59) {
            errors.append("InvalidMinuteException -> Minutes must be between 0 and 59.\n");
        }
        if (s < 0 || s > 59) {
            errors.append("InvalidSecondException -> Seconds must be between 0 and 59.\n");
        }
        if (errors.length() > 0) {
            throw new Exception(errors.toString());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hours : ");
        int h = sc.nextInt();
        System.out.print("Minutes : ");
        int m = sc.nextInt();
        System.out.print("Seconds : ");
        int s = sc.nextInt();

        try {
            validateTime(h, m, s);
            System.out.println("Correct time -> " + h + " hours " + m + " minutes " + s + " seconds");
        } catch (Exception e) {
            System.out.println("Exception(s) Caught:\n" + e.getMessage());
        }
    }
}