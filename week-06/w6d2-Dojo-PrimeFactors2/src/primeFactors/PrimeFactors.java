package primeFactors;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zoloe on 2016. 11. 22..
 */
public class PrimeFactors {

    public static List<Integer> generate(int n) {
//        return new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();
//        if ( n == 1) {
//        }else {
//            result.add(n);
//        }
//
//        if (n > 1){
//            result.add(n);
//        }
//        if (n % 2 == 0){
//            result.add(n/2);
//            result.add(n/2);
//        }
//        if ( n % 2 == 0 ) {
//            result.add(2);
//            n /=2;
//        }
//        if ( n > 1 ) {
//            result.add(n);
//        }
        while ( n % 2 == 0 ) {
            result.add(2);
            n /=2;
        }
        if ( n > 1 ) {
            result.add(n);
        }
        return result;
    }
}
