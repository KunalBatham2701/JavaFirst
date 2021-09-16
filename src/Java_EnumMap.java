import java.util.EnumMap;
import java.util.Map;

enum days2{
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
        }
public class Java_EnumMap {
    public static void main(String[] args) {
        EnumMap<days2,String> ns = new EnumMap<days2, String>(days2.class);
        ns.put(days2.Monday,"1");
        ns.put(days2.Tuesday,"2");
        ns.put(days2.Wednesday,"3");
        ns.put(days2.Thursday,"4");
        ns.put(days2.Friday,"5");
        ns.put(days2.Saturday,"6");
        ns.put(days2.Sunday,"7");
        System.out.println(ns); // to print it in set form (means in square brackets) you can use ns.EntrySet()

        for(Map.Entry a:ns.entrySet()){
            System.out.println("key = "+a.getKey()+", value = "+a.getValue());
        }

    }
}
