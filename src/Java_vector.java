import java.util.Vector;

public class Java_vector {
    public static void main(String[] args) {

        // vector is like dynamic array which can grow or shrink its size
        Vector<String> ns= new Vector<>(5); // now i know , we can give size in these brackets
        ns.add("kunal");
        ns.add("hii");
        ns.add("bye");
        ns.add("See you soon");
        ns.addElement("topu");
        ns.addElement("master"); // idk why adding a sixth element is not giving any error while i am giving size of vector as 5
        System.out.println(ns);
        System.out.println(ns.size()); // but we have assigned only 4 values so it will show 4 as size
        ns.remove(1);
        System.out.println(ns);
        if(ns.contains("kunal"))
            System.out.println("kunal is present");
        else
            System.out.println("kunal is not present");

    }
}
