/**
 * Created by zoloe on 2016. 11. 07..
 */
public class Workshop18{
    public static void main(String[] args) {
        // write a function that sum all the numbers until the given parameter



        System.out.println(addTo(10));
    }

    public static int addTo(int i){
        int j=1;
        int temp=0;
        for (j=1;j<i;j++){
            temp = temp+j;
        }
        return temp;
    }
}
