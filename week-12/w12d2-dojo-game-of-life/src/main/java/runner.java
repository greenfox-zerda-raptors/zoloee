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
        System.out.println(world.checkCell(1,4));


    }
}
