package Experiment;

public class Exceptionhandling {
    public static void main(String[] args) {
        int a=10;
//        String s=null;
        try{
//            System.out.println(s.length());
            int b=10/0;
            System.out.println(b);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(ArithmeticException f){
            System.out.println("my message on arithmetic exception");
        }
        System.out.println("just the remaining things");
    }
}
