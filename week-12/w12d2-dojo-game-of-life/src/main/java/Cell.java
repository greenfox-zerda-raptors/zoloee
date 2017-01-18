/**
 * Created by zoloe on 2017. 01. 17..
 */
public class Cell {
    private int coordinateX;
    private int coordinateY;

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    private char type;
    private int numberOfNeighbours;

    public int getNumberOfNeighbours() {
        return numberOfNeighbours;
    }

    public void setNumberOfNeighbours(int numberOfNeighbours) {
        this.numberOfNeighbours = numberOfNeighbours;
    }

    public Cell(int coordinateX, int coordinateY, char type) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.type = type;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    @Override
    public String toString() {
        return coordinateX + "|" + coordinateY ;
    }
}
