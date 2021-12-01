
//import java.util.*;
class Studen{
    private int roll;
    private String name;


    public Studen(){
        roll=0;
        name="unknown";
    }
    public Studen(int roll,String name){
        this.roll=roll;
        this.name=name;
    }
    public void display(){
        System.out.println("roll = "+roll);
        System.out.println("name = "+name);
    }
}
public class Java_lab1 {
    public static void main(String[] args) {
        Studen obj=new Studen();
        Studen obj2=new Studen(1,"rohit");
        obj.display();
        obj2.display();
    }
}
