import java.util.HashSet;
import java.util.LinkedHashSet;

public class java_HashSet {
    public static void main(String[] args) {
        HashSet<String> a=new HashSet<String>();
        a.add("kunal");
        a.add("rahul");
        a.add(null); // the new thing is you can add null in hashset
        a.add("jonny");
        a.add("rahul"); // hashSet is like a set , you cannot add same element twice , it will show only once
        System.out.println(a); // all elements will be printed randomly because set has no order

        // you can also use methods like remove(element) , addAll(another set) , isEmpty() to check whether the set is empty or not.

        // LinkedHashSet is same as Hash set just the difference is that LinkedHashSet maintains the order whereas HashSet doesn't but still it will not take 2 same values

        LinkedHashSet se=new LinkedHashSet();
        se.add("hii");
        se.add(23);
        se.add(5.5);
        se.add("hii");
        se.add(null);
        se.add(true);
        System.out.println(se);
    }
}
