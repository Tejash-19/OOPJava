package LAB4;
interface Motor{
    int capacity = 760;
    void run();
    void consume();
}
class WashingMachine implements Motor{
    public void run(){
        System.out.println("The Motor is now Running.");
    }
    public void consume(){
        System.out.println("The Motor of capacity "+capacity + "lbs is now consuming water.");
    }
}
public class Prob2 {
    public static void main(String[] args){
        WashingMachine w = new WashingMachine();
        w.run();
        w.consume();
    }
}
