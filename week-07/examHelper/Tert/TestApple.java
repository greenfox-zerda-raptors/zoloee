import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zoloe on 2016. 12. 05..
 */
//public class AppleTest {
//    @Test
//    public void add() throws Exception {
//
//    }
//
//    @Test
//    public void max_of_three() throws Exception {
//
//    }
//
//}

public class TestApple {
    private Apple apple;

    @Before
    public void setUp() throws Exception {
        apple = new Apple();
    }

    @Test
    public void testAdd() {
        assertEquals(5, apple.add(2, 3));
    }
    @Test
    public void testMax() {
        assertEquals(5, apple.max_of_three(3, 4, 5));
    }

}