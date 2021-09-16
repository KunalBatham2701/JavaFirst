import java.util.*;

public class Java_Collection {
    public static void main(String[] args) {

//        int a[]=new int[5];
//        Scanner input=new Scanner(System.in);
//        for(int i=0;i<5;i++){
//            System.out.print("enter "+(i+1)+" no. : ");
//            a[i]=input.nextInt();
//        }

//        System.out.print("entered array is : ");
//        for(int i=0;i<5;i++){
//            System.out.print(a[i]+" ");
//        }

        // to copy array -> System.arraycopy(copyfromarray,start,copytoarray,start,length);

//        int b[]=new int[6];
//        System.arraycopy(a,0,b,0,5);
//
//        for(int i=0;i<6;i++){
//            System.out.print(b[i]+" ");
//        }

        // cloning an array

//        int b[]=new int[6];
//        b=a.clone();
//        for(int i:b)
//            System.out.print(i+" ");

        // array list
        // LinkedList is also same just the difference of name some methods are :- add(element), add(index,element) , addall(Linkedlist), remove(index or element), removeAll(), clear() , get(index), addFirst(element) , addLast(element)
        // List Interface is also same just the initialisation is difference :- List name = new ArrayList<>(); and List<Double> ld = new ArrayList<>();

//        ArrayList<String> names=new ArrayList<String>();
//        Scanner input=new Scanner(System.in);
//        String name;
//        for(int i=0;i<5;i++){
//            System.out.print("enter "+(i+1)+" name : ");
//            name=input.nextLine();
//            names.add(name);
//        }

        // different ways to print arraylist

//        System.out.println(names);
//
//        Iterator itr = names.iterator();
//        while(itr.hasNext())
//            System.out.println(itr.next());

//        for(String i:names)
//            System.out.println(i);

        // to print or get particular element of arraylist and similar tasks

//        System.out.println(names.get(0));
//        System.out.println(names.remove(0));
//        System.out.println(names);
//        System.out.println(names.size());
//        names.set(0,"jonny");
//        Collections.sort(names);
//        System.out.println(names);

        // to add all elements of one arraylist in another

//        ArrayList<String> ns= new ArrayList<String>();
//        ns.add("kullu");
//        ns.add("manali");
//        names.addAll(ns);
//        System.out.println(names);

        // you can add string and integer both in same list , means it can be heterogeneous

        // to convert array into list
        String s[]={"kunal","jonny","neeshu","kaju","harsh"};
        List<String> names= new ArrayList<String>();
        for(String i:s){
            names.add(i);
        }
        System.out.println(names);

    }
}


