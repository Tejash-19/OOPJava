package LAB2;

    class Counter{
        private static int count =0;
        Counter(){
            count++;
        }
        public static int getCount(){
            return count;
        }
    }
    public class Prob2{
        public static void main(String[] args){

            Counter c1 = new Counter();
            Counter c2 = new Counter();
            Counter c3 = new Counter();
            Counter c4 = new Counter();
            System.out.println("The number of objects are :"+Counter.getCount());
        }
    }
