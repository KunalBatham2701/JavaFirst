import java.util.Locale;

public class String_Methods {
    public static void main(String[] args) {
        int a=65;
        String s="I am Kunal Batham";
        String s2="jonny Batham";
        long startTime=System.currentTimeMillis();
        System.out.println(s.charAt(0));
        System.out.println(s.length());
        System.out.println(s.substring(0,5));
        System.out.println(s.concat(" ").concat(s2)); // but after concatation also, s string remains same
        System.out.println(s.contains("batham")); // it is case sensitive
        System.out.println(s.equals("kunal Batham")); // it is also case sensitive
        System.out.println(s.replace("kunal","rahul")); // but still after replacement s string remains same , u need to store the new string in another variable
        System.out.println(s.indexOf("B")); // returns -1 if not present and also has a second parameter : index from which to start in string
        System.out.println(s.toLowerCase()); // vice versa toUpperCase but in both cases need to store in another variable
        System.out.println("hii" + String.valueOf(a)); // added hii to show that it really converted to string because integer cannot get add up with string
        System.out.println("hii again"+Integer.toString(a));
        String[] word=s.split("\\s"); // need to store the split words in a string array
        for(String i:word)  // pay attention here that for each loop is used with string because word is a string array not an integer array
            System.out.println(i);
        System.out.println(System.currentTimeMillis()-startTime+" ms"); // nice method to calculate time difference anywhere in the program




    }
}
