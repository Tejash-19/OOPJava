package test;
abstract class A{
    abstract void messageA();
}
abstract class B extends A{
    abstract void messageB();
}
public class test1 extends B{
    void messageA(){
        System.out.println("This is method of second abstract class.");
    }
    void messageB() {
        System.out.println("This is method of first abstract class.");
    }
    public static void main(String[] args){
        test1 o = new test1();
        o.messageA();
        o.messageB();
    }
}