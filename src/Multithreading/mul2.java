package Multithreading;
class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    public void run(){
        System.out.println("hello peter!");
    }
}
public class mul2 {
    public static void main(String[] args) {
        Mythr th= new Mythr("nikunj");
        System.out.println(th.getName());
        th.start();
        System.out.println(th.getName());

    }
}
