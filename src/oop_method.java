public class oop_method {
    // to access a private value in the class
//    private String evenOdd(int n) {
//        String answer;
//        if (n % 2 == 0)
//            answer = "even";
//        else
//            answer = "odd";
//        return answer;
//    }
//    public void check(int a){
//        System.out.println(evenOdd(a));
//    }

    // use of this
//    private int roll;
//    private String name;
//    private static String course="it"; // use static if you want to make a value fixed for all and use it if you don't want to create an object
//
//    static void change(){  // if you want to change the value of static variable;
//        course="b.tech";
//    }
//
//    public void setroll(int roll){
//        this.roll=roll;
//    }
//    public void setname(String name){
//        this.name=name;
//    }

//    public int getroll(){
//        return roll;
//    }
//    public String getname(){
//        return name;
//    }
//    public void display(){
//        System.out.println("name = "+name+"\nroll no. = "+roll+"\ncourse = "+course);
//    }
    // didn't teach abstract class properly

    // we can also reuse the constructor by using : this(passing the arguments of constructor)

    oop_method getA(){
        return this;
    }
    void msg(){System.out.println("hello Java");}
}
