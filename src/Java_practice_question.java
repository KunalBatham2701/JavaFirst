class Student{
    int age;
    String name,address;
    Student(){
        name="unknown";
        age=0;
        address="not available";
    }
    void setinfo(int age,String name){
        this.age=age;
        this.name=name;
    }
    void setinfo(int age,String name,String address){
        this.age=age;
        this.name=name;
        this.address=address;
    }
    void display(){
        System.out.println("age : "+age);
        System.out.println("name : "+name);
        System.out.println("address : "+address);
    }
}
public class Java_practice_question {
    public static void main(String[] args) {
        Student[] obj = new Student[10];
        for(int i=0;i<3;i++){
            obj[i] = new Student();
        }
        for(int i=3;i<6;i++){
            obj[i]=new Student();
            obj[i].setinfo(18,"rahul");
        }
        for(int i=6;i<9;i++){
            obj[i]=new Student();
            obj[i].setinfo(20,"rohit","mumbai");
        }
        obj[9]=new Student();
        for(int i=0;i<10;i++){
            obj[i].display();
        }
    }
}
