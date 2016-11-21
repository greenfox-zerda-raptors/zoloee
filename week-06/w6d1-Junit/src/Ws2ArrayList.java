import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by zoloe on 2016. 11. 21..
 */
public class Ws2ArrayList {

public static void main(String[] args){
    ArrayList<Integer> myIntList = new ArrayList(Arrays.asList(1,5,7,8));
    System.out.println(Sum(myIntList));

}

    public static Integer Sum(ArrayList<Integer> myIntList) {
        Integer sum = 0;
        for (Integer i :
                myIntList) {
            sum = sum + i;
        }
        return sum;
    }// sum

}// Ws2
