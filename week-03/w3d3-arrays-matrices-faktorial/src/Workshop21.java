/**
 * Created by zoloe on 2016. 11. 07..
 */
public class Workshop21 {
    public static void main(String[] args) {
        // create a recursive function that returns it's input factorial

            System.out.println();
        System.out.println(faktdown(5));
//        ezt irtam "magamtol, ezt ertem
            System.out.println();
//        System.out.println(faktup(5)); <-- igy nem lehet kilepo feltetelt adni
            System.out.println();
        System.out.println(faktsimple(5));
//        ezt mutatta Misi
    }

    public static int faktdown(int m) { //        ezt irtam "magamtol, ezt ertem
        int fa = m;
        if (fa == 0) {
            fa = 1;
        } else {
            fa = fa * faktdown(fa - 1);
        }
        return fa;
    }

    public static int faktsimple(int m) { //        ezt mutatta Misi
        if (m == 0) return 1;
        return m * faktdown(m - 1);
    }

//    public static int faktup(int m){ // <-- igy nem lehet kilepo feltetelt adni
//        int fa = m;
//        int count = 1;
//
//        if (fa == 0){
//            fa = 1;
//        }
//        else {
//            fa = fa * faktup(fa+1);
//        }
////        return fa;
//    }
//

}