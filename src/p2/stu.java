package p2;

public class stu {
    public  int roll;
    public String name;
    public stu(){
        roll=0;
        name="unknown";
    }
    public stu(int roll,String name){
        this.roll=roll;
        this.name=name;
    }
    public void display(){
        System.out.println(roll);
        System.out.println(name);
    }
}
