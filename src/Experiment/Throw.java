package Experiment;

public class Throw {
    public static void m1(int a)  {
        if(a<18){
            throw new ArithmeticException("my choice , no person below 18");
        }
        else
            System.out.println("person is eligible");
    }
    public static void main(String args[])  {
        m1(15);
        System.out.println("rest of the code");
    }
}
