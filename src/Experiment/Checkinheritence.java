package Experiment;
class base{
    private int a=10;
    protected int b=20;
    public int c=30;
    public static void ok(){
        System.out.println("hello");
    }
}
class child extends base{
    public static void ok(){
        System.out.println("let me tell you");
    }
    public void m1(){
        System.out.println(b);
    }
}
public class Checkinheritence{
    public static void main(String args[]){
        base obj=new base();
        System.out.println(obj.b);
        child obj2=new child();
        System.out.println(obj2.b);
        obj2.m1();
        obj.ok();
        obj2.ok();
    }

}
