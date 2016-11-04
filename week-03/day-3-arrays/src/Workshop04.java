/**
 * Created by zoloe on 2016. 11. 04..
 */
public class Workshop04{
    public static void main(String[] args) {
        int[] s = new int[] { 1, 2, 3, 8, 5, 6 };
        // change the 8 to 4

        s[3]=8;
        System.out.println(s[0]);
        System.out.println(s[1]);
        System.out.println(s[2]);
        System.out.println(s[3]);
        System.out.println(s[4]);
        System.out.println(s[5]);

        for( int i : s ){
            System.out.print(i);
        }
    }
}