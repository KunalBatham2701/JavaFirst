import java.util.*;
enum days{
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
}
public class Java_enum_set {
    public static void main(String[] args) {

        Set<days> ns= EnumSet.allOf(days.class);
//        Set<days> ns=EnumSet.of(days.Monday,days.Sunday);
//        Set<days> ns=EnumSet.noneOf(days.class);
        System.out.println(ns);

    }
}
