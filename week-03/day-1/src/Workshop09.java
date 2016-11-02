/**
 * Created by zoloe on 2016. 11. 02..
 */
public class Workshop09{
    public static void main(String[] args) {
        long i = 1357988018575474L;
        boolean out;
            // az L azert kell, mert long integer
        // tell if it has 11 as a divisor
        if ((i % 11) == 0 ) {
            out=true;
        }
        else {
            out=false;
        }
        System.out.println(out);
    }
}