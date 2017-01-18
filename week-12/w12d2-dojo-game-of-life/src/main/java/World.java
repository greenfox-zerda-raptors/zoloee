import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by zoloe on 2017. 01. 17..
 */
public class World {
    char playground[][];
    ArrayList<Cell> livingCellArrayList = new ArrayList<>();
    ArrayList<Cell> cellArrayList = new ArrayList<>();
    Cell cellArray[][];

    public World(char[][] initMatrix) {
        this.playground =initMatrix;
    }

    public void getCellArray(){
        for (int i = 0; i < playground.length; i++) {
            for (int j = 0; j < playground[0].length; j++) {
                cellArray[i][j].setCoordinateX(i);
                cellArray[i][j].setCoordinateY(j);
                cellArray[i][j].setType(playground[i][j]);
            }
        }
    }

    public void setNumberOfLivingNeigbours(){

    }



    public char[][] runEvolution(){
        return playground;
    }

    public int checkCell(int x, int y){
        int numberOfNeighbours = 0;
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
    public void getLivingCellArrayList() {
        livingCellArrayList = null;
        for (int i = 0; i < cellArray.length; i++) {
            for (int j = 0; j < cellArray[0].length; j++) {
                if (cellArray[i][j].getType() == '*') {
                    livingCellArrayList.add(cellArray[i][j]);
//                            new Cell(i, j, playground[i][j]));
                }
            }
        }
    }

    public void setNumberOfNeighboursForAllCells{
        for (int i = 0; i < cellArray.length ; i++) {
            for (int j = 0; j < cellArray[0].length; j++) {
                cellArray[i][j].setNumberOfNeighbours(checkCellFromList(i,j));
            }

        }
    }

    public int checkCellFromList(int x, int y){
        int numberOfNeighbours = 0;

        for (Cell cell: livingCellArrayList
             ) {
            if ( cell.getCoordinateX() == x ){
                if ((cell.getCoordinateY() == (y-1)) || cell.getCoordinateY() == (y+1) ){
                    numberOfNeighbours++;
                }
            } else if ( cell.getCoordinateX() == (x-1)){
                if (cell.getCoordinateY() == (y-1) ||
                    cell.getCoordinateY() == y ||
                    cell.getCoordinateY() == (y+1)) {
                        numberOfNeighbours++;
                }
            } else if ( cell.getCoordinateX() == (x+1)){
                if (cell.getCoordinateY() == (y+1) ||
                    cell.getCoordinateY() == y ||
                    cell.getCoordinateY() == (y-1)){
                        numberOfNeighbours++;
                }
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
