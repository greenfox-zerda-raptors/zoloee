import org.junit.Test;

import java.util.Arrays;

import static com.sun.tools.attach.VirtualMachine.list;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by zoloe on 2017. 01. 17..
 */
public class WorldTest {
    private char[][] testPlayground = new char[][]{
            {'.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '*', '.', '.', '.'},
            {'.', '.', '.', '*', '*', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.'}
    };
    World testWorld = new World(testPlayground);

    @Test
    public void checkEvolution() {
        char[][] testAgainst = new char[][]{
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '*', '.', '.', '.'},
                {'.', '.', '.', '*', '*', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'}
        };
        System.out.println(Arrays.asList(testAgainst));
        assertEquals(Arrays.asList(testWorld.runEvolution()), Arrays.asList(testAgainst) );


    }
}


