import java.util.*;

public class Java_Queue {
    public static void main(String[] args) {
//        Queue<Integer> q= new LinkedList<>(); // first in first out
//        // PriorityQueue is same as queue just the difference is that it does not follow first in first out and it arranges the element in ascending order
//        // PriorityQueue -> use q.element() to get last element of the queue
//        Scanner input= new Scanner(System.in);
//        int a;
//        for(int i=0;i<5;i++){
//            System.out.print("enter the no. : ");
//            a=input.nextInt();
//            q.add(a);
//        }
//        System.out.println(q);
//        System.out.println(q.peek()); // it gives the first element of queue
//        System.out.println(q);
//        System.out.println(q.poll()); // it removes the first element of queue while giving it
//        System.out.println(q);
//        System.out.println(q.remove()); // removes first element because queue is meant for that FIFO
//        System.out.println(q);
//        System.out.println(q.remove(4)); // it removes the particular element while giving true if present
//        System.out.println(q);

        // java Dequeue

        // unlike queue we can add or remove elements from both sides
        // Null elements are not allowed in the ArrayDequeue
        // array dequeue is not thread safe , in the absence of external synchronization
        // array dequeue has no capacity restrictions
        // array dequeue is faster than linkedlist and stacks.

        Deque<String> ns= new ArrayDeque<>();
        ns.add("rahul");
        ns.add("rohit");
        ns.add("topu");
        ns.offerFirst("first");
        ns.offerFirst("latest First");
        ns.offerLast("last");
        System.out.println(ns);
        System.out.println(ns.poll());
        System.out.println(ns.pollFirst());
        System.out.println(ns.remove());
        System.out.println(ns.removeFirst());
        System.out.println(ns);
        System.out.println(ns.removeFirstOccurrence("topu"));
        System.out.println(ns);
    }
}
