import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by zoloe on 2016. 11. 21..
 */
public class Ws2ArrayListTest {

    private Ws2ArrayList myWs2 = new Ws2ArrayList();

    @Test
    public void sum() throws Exception {
        ArrayList<Integer> myIntList = new ArrayList(Arrays.asList(1,5,7,8));
        assertEquals(tSum(myIntList), myWs2.Sum(myIntList));
    }

    @Test
    public void sumIfEmpty() throws Exception {
        ArrayList<Integer> myEmptyList = new ArrayList<>();
        assertEquals(tSum(myEmptyList), myWs2.Sum(myEmptyList));
    }

    @Test
    public void sumIfOneElement() throws Exception {
        ArrayList<Integer> myIntList = new ArrayList(Arrays.asList(3));
        assertEquals(tSum(myIntList), myWs2.Sum(myIntList));
    }

    @Test
    @Ignore
    public void sumIfNull() throws Exception {
        Integer[] arr = null;
        ArrayList<Integer> myNulledList = new ArrayList(Arrays.asList(arr));
        assertEquals(tSum(myNulledList), myWs2.Sum(myNulledList));
    }

    public Integer tSum(ArrayList<Integer> l){
        int s = 0;
        for (Integer i :
                l) {
            s = s + i;
        }
        return s;
    }
}