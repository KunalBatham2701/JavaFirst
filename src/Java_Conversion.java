import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Java_Conversion {
    public static void main(String[] args) throws Exception {
        /*int no;
        String stringno;
        Scanner input=new Scanner(System.in);

        // string to integer and integer to string

        System.out.println("enter the no. : ");
        stringno=input.nextLine();
        no=Integer.parseInt(stringno)+10; // or we can use Integer.valueOf(stringno);
        stringno=Integer.toString(no); //or we can use String.valueOf(no);
        System.out.println(stringno+20);

        // long to string and string to long

        long n=10000;
        String s=Long.toString(n); // String.valueOf(n) // to convert string into long
        n=Long.parseLong(s); // to convert long into string
        System.out.println(n+1);

        // similarly double to string and string to double , float to string and string to float , boolean to string and string to boolean
*/
        // string to date and date to string

        /*String sdate="27/01/2003";
        Date date1= new SimpleDateFormat("dd/MM/yyyy").parse(sdate);
        System.out.println(date1);

        Date date=Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy  hh:mm:ss"); // you can give your format as you want to print date
        String strdate=dateFormat.format(date);
        System.out.println(strdate);*/


        // .intValue method to convert long to int and you can convert int to long easily just by directly passing value to long because int is smaller than long

        // character.getNumericValue(char); to convert character into integer

        // binary to decimal and decimal to binary

        String bin="11011";
        int decimal=Integer.parseInt(bin,2);
        System.out.println(decimal);

        bin=Integer.toBinaryString(decimal);
        System.out.println(bin);

        // hexadecimal to decimal and decimal to hexadecimal

        // binary to hex -> Integer.parseInt(hex,16);
        // hex to binary -> Integer.toHexString(decimal);

        // hexadecimal to binary and vice versa -> just convert hexadecimal to decimal than that decimal to binary and that's it you are done aur idhar udhar conversion karne hai toh thoda dimaaag laga le inki madad se ho jayega


    }
}
