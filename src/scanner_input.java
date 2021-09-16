import java.util.Scanner;

public class scanner_input {
    public static void main(String[] args) {
        int a;
        Scanner input=new Scanner(System.in);
        System.out.print("enter the no. : ");
        a=input.nextInt();
        input.nextLine();
        String str;
        System.out.print("enter the name : ");
        str=input.nextLine();
        System.out.print("name is "+str+" and no. is "+a);

    }
}
