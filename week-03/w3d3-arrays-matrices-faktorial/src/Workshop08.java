/**
 * Created by zoloe on 2016. 11. 04..
 */
import java.util.Arrays;
    // ez kell a deepToStringhez
public class Workshop08{
    public static void main(String[] args) {
        // Task 1: Create (dynamically) a two dimensional array with the following matrix. Use a loop!
        // 1 0 0 0
        // 0 1 0 0
        // 0 0 1 0
        // 0 0 0 1

        // Task 2: Print this two dimensional array to the output

        int[][] array=new int[4][5];

        for (int i=0;i<array.length;i++) {
            for (int j = 0; j < array[0].length; j++) {
                    //ide a szelesseget visszaado fuggveny kene
                    //annyi volt a trukk, hogy az elso (aka .[0]) elem hosszusagat kellett nezni
                if (i == j) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }
        System.out.println();

        System.out.println(Arrays.deepToString(array));
            //irassuk ki az egeszet, hogy lassuk hogyan tarolja - egy 'sorban'
        System.out.println();
        System.out.println(array.length);
            //irassuk ki hogy a .length melyik dimenziora vonatkozik - ezek szerint a madassagra
        System.out.println();
        System.out.println(array[0].length);
            //ez pedig a szelesseg

        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[0].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}