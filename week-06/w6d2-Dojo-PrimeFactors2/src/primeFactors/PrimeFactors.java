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
//        while ( n % 2 == 0 ) {
//            result.add(2);
//            n /=2;
//        }
//        if ( n > 1 ) {
//            result.add(n);
//        }
//        int candidate = 2;
//        while ( n > 1 ) {
//            while ( n % candidate == 0 ) {
//                result.add(candidate);
//                n /= candidate;
//            }
//            candidate++;
//        }
//        if ( n > 1 ) { -- ez torolheto, mert a while-bol csak 1-nel jovnk ki
//            result.add(n);
//        }

        for ( int candidate = 2; n > 1; candidate++ ){
            for( ; n % candidate == 0; n /= candidate){ //nem kell kezdeti feltetel, mert az n mar be van allitva
                result.add(candidate);
            }
//            candidate++;
        }
// while to for moriczka pelda ide
// vegtelen for( ; ; )

        return result;
    }
}
