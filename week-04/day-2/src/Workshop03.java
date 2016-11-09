
/**************************************************************************************************
 * Workshop: Practice With Exceptions: Arithmetic Overflow
 * Write a routine that catches an arithmetic overflow (that is, larger than the Integer.MAX_VALUE)
 * Note that Integer and int are NOT the same thing; and that Integer offers you properties such as
 * MAX_VALUE.
 * Use the Scanner routine to take the input from the keyboard; if the value is okay then
 * print "Yum", and then 1/2 the value entered.  For example:-
 * INPUT or 0 to end?  12334556677723131
 * Invalid value 
 * (and the Java exception messages)
 * INPUT or 0 to end?  12345678
 * Yum 1234
 * INPUT or 0 to end?  123456
 * Yum 123
 * INPUT or 0 to end? 0
 * Bye!
 **************************************************************************************************/

import java.util.*;

public class Workshop03{

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){
        int x=1;
        do {
            System.out.println("INPUT or 0 to end?");
            try {
                userInput = new Scanner(System.in);
                x = userInput.nextInt();
                if (x == 0 ) {
                    System.out.println("Bye");
                }else {
                    System.out.println("Yum "+ Integer.toString(x).substring(0, Integer.toString(x).length()/2));
                }
            }
            catch (InputMismatchException e){
                System.out.println("Invalid value ");
                System.out.println();
            }
        } while (x != 0);

    } //main
} //Workshop03

