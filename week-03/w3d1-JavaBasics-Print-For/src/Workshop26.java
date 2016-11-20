/**
 * Created by zoloe on 2016. 11. 03..
 */
public class Workshop26{
    public static void main(String[] args) {
        String x = "cheee";
        // Tell if the x has even or odd number of
        // characters with a True for even and
        // false False output otherwise

        boolean y;

        if (x.length() % 2 == 0) {
            y=true;
        }
        else{
            y=false;
        }

        System.out.println(y);
    }
}