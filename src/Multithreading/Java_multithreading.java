package Multithreading;

import java.sql.SQLOutput;

class mythread implements Runnable{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("thread1");
            i++;
        }
    }
}
class mythread2 implements Runnable{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("thread2");
            i++;
        }
    }
}
public class Java_multithreading {
    public static void main(String[] args) {
        mythread b1=new mythread();
        Thread g1=new Thread(b1);
        mythread2 b2=new mythread2();
        Thread g2=new Thread(b2);
        g1.start();
        g2.start();
        int i=0;
        while(i<100) {
            System.out.println("main");
            i++;
        }
    }
}
