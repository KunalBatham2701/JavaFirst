import java.util.Stack;

public class Java_Stack {
    public static void main(String[] args) {

        // The stack is linear data structure that is used to store the collection of objects. It is based on Last-In-First-Out (LIFO)

        Stack<Integer> ns = new Stack<>();
        ns.push(2);
        ns.push(5);
        ns.push(6);
        ns.push(3);
        ns.push(1);
        System.out.println(ns);
        System.out.println(ns.peek()); // it just shows the element it didn't pop it out
        System.out.println("position of 6 in stack"+ns.search(6));
        System.out.println("position of 4 in stack"+ns.search(4)); // it will show -1 if element is not present in the set
        System.out.print("popping order : ");

        ns.forEach(a->{                // to print elements of stack without removing them using for each , * pay attention to the syntax of this for each loop
            System.out.println(a);
        });

        for(int i=0;i<5;i++){
            System.out.print(ns.pop()+" ");
        }
        System.out.println();
        System.out.println(ns.isEmpty());
    }
}
