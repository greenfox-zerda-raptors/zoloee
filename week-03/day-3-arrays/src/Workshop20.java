/**
 * Created by zoloe on 2016. 11. 07..
 */
public class Workshop20{
    public static void main(String[] args) {
        // create a function that returns it's input factorial

        System.out.println(fakt(5));
    }
    public static double fakt(double m){
        double fa=1;
        for (double i=m;i > 0;i--){
            fa=fa*i;
        }
        return fa;
    }
}
