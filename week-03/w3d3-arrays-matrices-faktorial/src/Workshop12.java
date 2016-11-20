/**
 * Created by zoloe on 2016. 11. 06..
 */
public class Workshop12{
    public static void main(String[] args) {
        // Swap the first element of the array
        // Expected outpt: third second first
        String[] abc = new String[] { "first", "second", "third" };

//        for (int i=0;<)
        String temp=abc[0];
        abc[0]=abc[2];
        abc[2]=temp;


        for(int i=0;i<abc.length;i++){
            System.out.print(abc[i] + " ");
        }
    }
}