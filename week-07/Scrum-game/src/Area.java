import java.awt.*;
import java.util.ArrayList;

/**
 * Created by zoloe on 2016. 12. 07..
 */
public class Area {
    ArrayList<Tile> tiles;

    public Area() {
                int[][] map = new int[][]{
                        {0, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {0, 1, 1, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 1, 1, 0, 1, 0, 0},
                        {0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                        {0, 1, 1, 1, 0, 1, 0, 1, 0, 0},
                        {0, 0, 1, 1, 0, 0, 0, 1, 1, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 1, 1, 0, 1, 1, 1, 0, 0},
                        {0, 0, 1, 1, 0, 1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
                };

                tiles = new ArrayList<>();

                for (int i = 0; i < 10; i += 1) {
                    for (int j = 0; j < 10; j += 1) {
                if (map[i][j] == 0) {
                    tiles.add(new Floor(j, i));
                } else if (map[i][j] == 1) {
                    tiles.add(new Wall(j, i)); // pos x is the horizontal axle
                }
            }
        }
    }
    public String getTilePositionAndisMoveable(int x, int y) {
        try {
            return Boolean.toString(tiles.get(10*y+x).moveable) + " " +
                    tiles.indexOf(tiles.get(10*y+x)) ;
        }catch (Exception e){}
        return "fuck";
    }

    public boolean getTileIsMoveable (int posX, int posY){
        boolean out;
        if ( posX >= 0 && posX <= 9 && posY >= 0 && posY <= 9){ //check if we stay inside the board
                out = tiles.get(10 * posY + posX).moveable; //check if its a wall or a floor
            }else {
            out =false;
        }
        return out;
    }

    public void draw(Graphics graphics){
        for (GameObject tile:
             tiles) {
            tile.draw(graphics);
        }

    }
}//class Area

// ebben kell lennie az alapterkepnek
