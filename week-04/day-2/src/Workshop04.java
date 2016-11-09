/**************************************************************************************************
 * Workshop: Practice Exceptions: Cascading problems
 *
 * What if there are lots of different types of errors?
 *
 * We've got an array and a mad man writing idiotic code (me!).  Deal with my mayhem and get to
 * the ::::FINISH LINE::::
 *
 * Note that there should not be Compile Time errors.
 *
 **************************************************************************************************/
import java.util.*;

public class Workshop04{
    public static void main(String[] args){

        int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8};
        String two = "2";

        try {
            System.out.println("Testing ...");
            a[2] = a[3]/a[0];
        }catch (ArithmeticException ea){
            System.out.println(ea);
        }
            System.out.println("Past hurdle 1");
        try {
            a[9] = Integer.parseInt(two);
        }catch (ArrayIndexOutOfBoundsException eai){
            System.out.println(eai);
        }
            System.out.println("Past hurdle 2");
        try {
            a[10] = Integer.parseInt("ten");
        }catch (NumberFormatException enf){
            System.out.println(enf);
        }
            System.out.println("Past hurdle 3...  And I realized perhaps I'm wrong");
        try {
            a[10] = 10;
        }catch (Exception e){
            System.out.println(e);
        }
            System.out.println("Past hurdle 4");
        try {
            two = "two";
        }catch (Exception ee) {
            System.out.println(ee);
        }
            System.out.println("Past hurdle 5");
        try {
            a[9] = Integer.parseInt(two);
        }catch (Exception eee) {
            System.out.println(eee);
        }


        System.out.println("*** FINISH LINE ***");
    }
}
