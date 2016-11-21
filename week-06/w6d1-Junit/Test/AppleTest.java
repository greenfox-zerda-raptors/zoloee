import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zoloe on 2016. 11. 21..
 */
public class AppleTest {
    @Test
    public void getApple() throws Exception {
        Apple myApple = new Apple();
        assertEquals("Apple", myApple.getApple());
    }

}