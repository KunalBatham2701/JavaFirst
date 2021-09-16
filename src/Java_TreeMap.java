import java.util.TreeMap;

public class Java_TreeMap {
    public static void main(String[] args) {
        // Java Tree map is same as HashMap just the difference is that it maintains the ascending order(remember the ascending order not input order) and it doesn't have null key , just have null value

        TreeMap<Integer,String> ns=new TreeMap<>();
        ns.put(1,"hii");
        ns.put(3,"lol");
        ns.put(2,"done");
        ns.put(4,"last");
        ns.put(5,"hahahaa");
        System.out.println(ns);
        System.out.println(ns.headMap(3,true)); // write false here if you dont want to include 3
        System.out.println(ns.descendingMap());
        System.out.println(ns.tailMap(3,false));
        System.out.println(ns.subMap(2,4));
        System.out.println(ns.subMap(2,false,4,true));
    }
}
