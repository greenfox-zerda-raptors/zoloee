package primeFactors;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by zoloe on 2016. 11. 22..
 */
public class PrimeFactorsTests {
    private List<Integer> list(int... inputs) {
//        return new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        for (int i:
             inputs) {
            result.add(i);
        }
        return result;
    }

    @Test
    public void testOne() throws Exception{
        assertEquals(list(), PrimeFactors.generate(1));
    }

    @Test
    public void testTwo() throws Exception{
        assertEquals(list(2), PrimeFactors.generate(2));
    }

    @Test
    public void testThree() throws Exception{
        assertEquals(list(3), PrimeFactors.generate(3));
    }

    @Test
    public void testFour() throws Exception{
        assertEquals(list(2,2), PrimeFactors.generate(4));
    }
    // 5-r nem nezzuk, mert prim
    @Test
    public void testSix() throws Exception{
        assertEquals(list(2,3), PrimeFactors.generate(6));
    }
}
