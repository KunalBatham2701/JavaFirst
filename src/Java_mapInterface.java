import java.util.HashMap;
import java.util.Map;

public class Java_mapInterface {
    public static void main(String[] args) {
        Map<Integer,String>  ns= new HashMap<>();
        ns.put(1,"hii");
        ns.put(3,"jonny");
        ns.put(4,"lol");
        ns.put(3,"topu");
        ns.put(2,"jonny");
        System.out.println(ns); // do notice that map interface has curly brackets as output whereas other have [] brackets.
        for(Map.Entry m:ns.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        ns.put(new Integer(1),"kunal");
        // or
        ns.put(1,"KUNAL");
        System.out.println(ns);
        System.out.println(ns.remove(4)); // to print the value of key removed
        System.out.println(ns);
        System.out.println(ns.size());
    }
}
