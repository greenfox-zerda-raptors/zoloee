import org.junit.Test;

import java.util.Arrays;

import static com.sun.tools.attach.VirtualMachine.list;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

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
                {'.', '.', '.', '*', '*', '.', '.', '.'},
                {'.', '.', '.', '*', '*', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'}
        };
        assertArrayEquals(testWorld.runEvolution(), testAgainst);
    }
    @Test
    public void checkNeighbours(){
        assertEquals(testWorld.checkCell(1,4),2 );
    }

    @Test
    public void checkNeighboursFromList() {
        assertEquals(testWorld.checkCellFromList(1, 4), 2);
    }
    @Test
    public void checkNeighboursFromList2(){
        assertEquals(testWorld.checkCellFromList(0,0),0);
    }
    @Test
    public void checkNeighboursFromList3(){
        assertEquals(testWorld.checkCellFromList(1,3),3);
    }
}


