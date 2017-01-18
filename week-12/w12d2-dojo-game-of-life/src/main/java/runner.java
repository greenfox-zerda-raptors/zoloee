/**
 * Created by zoloe on 2017. 01. 17..
 */
public class runner {
    public static void main(String[] args) {

        char[][] testPlayground = new char[][]{
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '*', '.', '.', '.'},
                {'.', '.', '.', '*', '*', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'}
        };

        World world = new World(testPlayground);
//        world.printWorld();

        world.getCellList();
        System.out.println(world.livingCellArrayList.toString());




    }
}
