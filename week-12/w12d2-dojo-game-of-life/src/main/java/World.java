import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by zoloe on 2017. 01. 17..
 */
public class World {
    char playground[][];

    public World(char[][] initMatrix) {
        this.playground =initMatrix;
    }

    public char[][] runEvolution(){
        return playground;
    }

    public int checkCell(int x, int y){

        int numberOfNeighbours = 0;
//        if ( playground[x][y-1] == playground[x][y]) neighbours++;
//        if ( playground[x-1][y-1] == playground[x][y]) neighbours++;
        ArrayList<Character> neighbours = new ArrayList<>(Arrays.asList(
                playground[x][y-1],
                playground[x-1][y-1],
                playground[x-1][y],
                playground[x-1][y+1],
                playground[x][y+1],
                playground[x+1][y+1],
                playground[x+1][y],
                playground[x+1][y-1]));

        for (Character c:neighbours){
            if(playground[x][y] == c){
                numberOfNeighbours++;
            }
        }
        return numberOfNeighbours;

    }
    public void printWorld(){
        for (int i = 0; i < playground.length ; i++) {
            for (int j = 0; j < playground[0].length; j++) {
                System.out.println(playground[i][j] + " " + i + " " + j);
            }
        }
    }
}

//
//    private char[][] testPlayground = new char[][]{
//            {'.', '.', '.', '.', '.', '.', '.', '.'},
//            {'.', '.', '.', '.', '*', '.', '.', '.'},
//            {'.', '.', '.', '*', '*', '.', '.', '.'},
//            {'.', '.', '.', '.', '.', '.', '.', '.'}
//    };
