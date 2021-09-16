import java.util.Scanner;
import java.util.TreeSet;

public class Java_treeSet {
    public static void main(String[] args) {
        // TreeSet is same as HashSet just the difference is that it has more functions and method and the main difference is that it maintains the ascending order in the set

        TreeSet<String> names= new TreeSet<>();
        Scanner input=new Scanner(System.in);
        String name;
        for(int i=0;i<5;i++){
            System.out.print("enter "+(i+1)+" name : ");
            name=input.nextLine();
            names.add(name);
        }
        System.out.println(names);
//        System.out.println(names.pollFirst()); // as obvious it will print the first element of set means the smallest and first one according to ascending order
//        System.out.println(names.pollFirst()); // will print the next one because it is called already once
//        System.out.println(names.pollLast()); // will print the last element of set
        System.out.println(names.descendingSet());
        System.out.print("enter the name : ");
        name=input.nextLine();
        System.out.println(names.headSet(name,true));
        System.out.println(names.tailSet(name,true));
        System.out.print("enter name 2 : ");
        String name2=input.nextLine();
        System.out.println(names.subSet(name,true,name2,false));

    }
}
