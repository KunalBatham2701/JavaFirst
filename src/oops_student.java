import java.util.Scanner;

public class oops_student {
    int rollno,marks;
    float perc;
    String name;
    void insert(){
        Scanner input=new Scanner(System.in);
        System.out.print("enter the roll no : ");
        rollno=input.nextInt();
        input.nextLine();
        System.out.print("enter the name : ");
        name=input.nextLine();
        System.out.print("enter the marks out of 500 : ");
        marks=input.nextInt();
        input.nextLine();

    }
    void calPercentage(){
        perc=(float)marks/(float)5;
        System.out.println("percentage : "+perc);
    }
    void display(){
        System.out.println("rollno : "+rollno);
        System.out.println("name : "+name);
        calPercentage();
    }
}
