import java.util.Arrays;

/**
 * Created by zoloe on 2016. 11. 21..
 */
public class App {
    public static void main(String[] args) {

        System.out.println();
        WordToolbox wSource = new WordToolbox ("Tarzan's toenails");
        System.out.println ("countHowMany(\"a\")=" + wSource.countHowMany('a')); // countHowMany("a")=3
        System.out.println ("countHowMany(\"T\")=" + wSource.countHowMany('T')); // countHowMany("T")=2
        System.out.println ("countHowMany(\"t\")=" + wSource.countHowMany('t')); // countHowMany("t")=2
        System.out.println ("countHowMany(\"x\")=" + wSource.countHowMany('x')); // countHowMany("x")=0
        System.out.println ("countHowMany(\" \")=" + wSource.countHowMany(' ')); // countHowMany(" ")=1

//       String[][] x = new String[24][2];
//        x[1][1] = "a";
//      String[][] x  = new String[][] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","x","y","z","\'"};
//        for (int i=0;i<24;i++){
//            for (int j=0;j<2;j++){
//                x[i][j]= Integer.toString(i);


            }
//        }
//        System.out.println(Arrays.deepToString(x));
//        String[] y = new String[2]
//                ArrayList
    }


