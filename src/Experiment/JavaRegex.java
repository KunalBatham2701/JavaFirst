package Experiment;
import java.util.Scanner;
import java.util.regex.*;
public class JavaRegex{
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("(0|91)?[6-9][0-9]{9}");
        Scanner sc = new Scanner(System.in);
        String phone = sc.next();
        Matcher m = p1.matcher(phone);
        Pattern p2 = Pattern.compile("(A|R)[a-z A-Z]*");
        String name  = sc.next();
        Matcher my = p2.matcher(name);
        String no[] = new String[m.groupCount()];
        String n_list[] = new String[my.groupCount()];

    }
}
