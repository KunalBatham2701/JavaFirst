import java.sql.SQLOutput;

@FunctionalInterface
interface i1{
    public abstract void m1();
}
class java_interface_lab {
    public static void main(String[] args) {
        i1 obj =new i1() {
            @Override
            public void m1() {
                System.out.println("hii");
            }
        };
    }

}
