import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by zoloe on 2016. 12. 04..
 */
public class AbstractAnimalTest {
    private Horse testAnimal;

    @Before
    public void setUp() throws Exception {
            testAnimal = new Horse("tesztlo");
    }


    @Test
    public void eat() throws Exception {
        int feedCounterBefore = testAnimal.getFeedCounter();
        testAnimal.eat();
        int feedCounterAfter = testAnimal.getFeedCounter();
        assertEquals(20,feedCounterAfter - feedCounterBefore);

    }

    @Test
    public void setChildrenNum() throws Exception {
        testAnimal.setChildrenNum(-1);
    }

}