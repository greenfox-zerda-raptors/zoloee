/**
 * Created by zoloe on 2016. 11. 04..
 */
public class Workshop03{
    public static void main(String[] args) {
        int[] r = new int[]{54, 23, 66, 12};
        // add the second the third

        r[2] = r[2] + r[1];
        for (int i : r) {
            System.out.print(i+" ");
        }
    }
}