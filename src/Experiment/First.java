package Experiment;
class First{
    public static void main(String args[]){
        System.out.println("First main");
        Second.main("lets see","ok");
        Second.m1();
        m2();
    }
    public static void m2(){
        System.out.println("m2");
    }
}
class Second{
    public static void main(String args[]){
        System.out.println("Second main");
        main("lets see","ok");
        First.m2();
        m1();
    }
    public static void m1(){
        System.out.println("m1");
    }
    public static void main(String lets_see, String ok) {
        System.out.println("what");
    }
}
