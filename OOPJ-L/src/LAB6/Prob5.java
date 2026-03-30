package LAB6;
class CheckArgument extends Exception{
    CheckArgument(String message){
        super(message);
    }
}
public class Prob5 {
    public final int length(String[] args){
        return args.length;
    }
    static void main(String[] args){
        try {
            if (args.length < 4) {
                throw new CheckArgument("Number of inputs is less than 4.");
            }
            int sum =0;
            for(int i=0;i<args.length;i++){
                int n = Integer.parseInt(args[i]);
                sum = sum + (n * n);
            }
            System.out.println("Sum : " + sum);
        }
        catch(CheckArgument a){
            System.out.println(a.getMessage());
        }
        catch(NumberFormatException e){
            System.out.println("Enter Integers only !!!");
        }
    }
}
