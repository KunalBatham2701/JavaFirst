import my_package.*;
public class oops{ // you can extend Java_inheritence2 here and it will be mulitlevel inheritence

//    int id,no=10;
//    String place,name="rahul";
//    float bonus= 10000;
//    void run(){          // it will override the base class method
//        System.out.println("main is running");
//        super.run(); // use super if you want to acces the method from base class
        // to call the constructor of base class just use super();
        // remember : if you want to call base class method do it inside a method and if you want to call base class constructor do it inside a constructor
//    void run(){
//        System.out.println("running safely");
//    }
//    public void draw(){
//        System.out.println("drawing smoothly");
//    }
    public static void main(String[] args) {

        //user defined package
        package_class ns= new package_class();
        ns.check();


//        Interface_class ns= new oops();
//        ns.draw();


//        Abstract_class ns= new oops();
//        ns.run();

        // you can use final keyword before instance(data type) and the value will not be able to change and will give error
        // and you can use final keyword in method and the method can never be overriden and will give error if tried
        // and you can even use final in class like : final class bike{} and it can never be inherited
        // you can only put value in a final variable by using constructor
        // if you created a static final variable you can initialize its value using this way : static { Pan_Card_number="sasdf3r34";}
        // ex- final int a=10; , final void run(){}, static final Pan_Card_Number;

        // pay attention :method overloading is when we create 2 methods with same name with different arguments or types in a same class
        //  but method overriding is when we inherit one class in another class and both have exactly same method with same arguments and type

        //method overriding
//        oops ns=new oops();
//        ns.run();


        // Method_overloading
//        System.out.println(Method_overloading.add(10,20));
//        System.out.println(Method_overloading.add(10,20,30));
//        System.out.println(Method_overloading.add(10.0,30.0));



        // note :- multiple inheritence and hybrid inheritence are not valid in java

//        oops ns= new oops();
//        Java_inheritence2 ns=new Java_inheritence2(); // i was not knowing that this is legal that we can make object of one class in another class without inheritence // it is all because they are in same package
//        ns.show();
//        ns.display();
//        System.out.println(ns.salary);
//        System.out.println(ns.bonus);

//        oop_method ns=new oop_method(); // but if you don't want to make an object you can just make the function static like in this case : public static String evenOdd(int n)
//        ns.check(21);

//        System.out.println(oop_method.evenOdd(5)); // in case you have prepared static function because for that you don't need to create an object

//        oops_student obj=new oops_student();
//        obj.insert();
//        obj.display();

        // normal assigning and getting value in oop
//        oops object1= new oops();
//        System.out.println(object1.id);
//        System.out.println(object1.no);
//        System.out.println(object1.place);
//        System.out.println(object1.name);
//
//        oops object2= new oops();
//        object2.id=object1.no;
//        object2.place=object1.name;
//
//        System.out.println(object2.id);
//        System.out.println(object2.no);
//        System.out.println(object2.place);
//        System.out.println(object2.name);

        //mutator method
//        oop_method ns=new oop_method();
//        ns.setname("rahul");
//        ns.setroll(3);
////        System.out.println(ns.getroll());
////        System.out.println(ns.getname());
//        ns.display();
//        oop_method.change(); // to change the static course // pay attention we used class name here not object
//        System.out.println();
//        ns.display();

//        new oop_method().getA().msg();


    }
}
