/**
 * Created by zoloe on 2016. 11. 02..
 */
public class Workshop10{
    public static void main(String[] args) {
        int j1 = 10;
        int j2 = 3;
        // tell if j1 is between j2 squared and j2 cubed

        boolean out;

        if (Math.pow(j2,2) < j1){
            if (Math.pow(j2,3)<j1){
                out=false;
            }
        }
        System.out.println( "j2^2= " + Math.pow(j2,2) );
        System.out.println( "j1= " + j1 );
        System.out.println( "j2^3= " + Math.pow(j2,3) );

        System.out.println( Math.pow(j2,2) < j1 );
    }
}