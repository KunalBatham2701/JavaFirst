package Experiment;

abstract class Abstractclass {
    public abstract void m1();
    public void m2(){
        System.out.println("method with body");
    }
}
class sub extends Abstractclass{
    public void m1(){
        System.out.println("method defined in the extended class");
    }
}
class test{
    public static void main(String[] args) {
        sub obj=new sub();
        obj.m1();
        obj.m2();
    }
}
