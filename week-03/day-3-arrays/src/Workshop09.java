import java.util.Arrays;

/**
 * Created by zoloe on 2016. 11. 04..
 */

public class Workshop09{
    public static void main(String[] args) {
        int[] ag = new int[] { 3, 4, 5, 6, 7 };
        // please double all the elements of the list

            System.out.println();
        System.out.println(Arrays.toString(ag));
            // irjuk ki az elejen a tombot
            System.out.println();

        int j = 0;
            // ebbe szamoljuk, hogy a foreach melyik elemnel tart
        for (int i : ag) {
            System.out.print("foreach count (j="+ j+") | ");
            System.out.print("value of i= "+ i +" | ");
            ag[j]=2*i;
            System.out.println("ag[j]= "+ag[j]);
            j++;
            System.out.println();
        }
        System.out.println(Arrays.toString(ag));
            //irjuk ki, hogy mi lett a tombbol
    }
}
