import java.util.HashMap;

public class Java_HashMap {
    public static void main(String[] args) {
        // HashMap is same as map interface just the difference is that it doesn't maintain the order and u can include one null key and many null values.
        // maintains no order means doesn't maintains the input order.

        // *LinkedHashMap is same as HashMap is just the difference is that it maintains the insertion(input) order whereas Hashmap doesn't

        // HashTable is also same as HashMap only the difference is that u can't have null key nor value , and one more thing it's definition is something like this - HashTable is an array of list and each list is known as bucket.

        HashMap<Integer,String> ns= new HashMap<>();
        ns.put(1,"hii");
        ns.put(3,"ok");
        ns.put(5,"lol");
        ns.put(null,"this is null");
        ns.put(null,"latest null");
        ns.put(null,null); // this is also legal
        ns.put(7,null);
        ns.put(8,null);
        ns.remove(3);
        System.out.println(ns);
        ns.replace(5,"changed");
        System.out.println(ns);
        System.out.println(ns.getOrDefault(1,"not found"));
        System.out.println(ns.getOrDefault(2,"not found"));
        ns.replaceAll((i,v)->"kunal");
        System.out.println(ns);
        System.out.println(ns.entrySet()); // to print the map in set format([]) instead of curly brackets({})
//        System.out.println(ns.keySet());
//        System.out.println(ns.values());

        // you can also use for each loop to print key and value pairs like we use in Java_mapInterface

//        ns.putIfAbsent(4,"done");
//        ns.putIfAbsent(4,"check");
//        System.out.println(ns);


//        HashMap<Integer,String> m=new HashMap<>();
//        m.put(3,"my choice");
//        m.put(6,"last");
//        m.putAll(ns); // key 3 of ns is added later so it takes the value of 3 of ns
//        System.out.println(m);

    }
}
