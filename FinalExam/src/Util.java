
//Create a function that takes an array of integers
// and retunrs the biggest from each of its second elements
// like: [1, 3, 8, 6, 7, 4] would return 6
/**
 * Created by zoloe on 2017. 02. 17..
 */
public class Util {

    public Util() {
    }

    public Integer getBiggestFromPairs(int[] ints){
        int length = ints.length;
        int biggest = ints[1];

        for (int i = 1; i < length; i=i+2){
                if (ints[i] > biggest) {
                    biggest = ints[i];
            }
        }
        return biggest;
    }

}
