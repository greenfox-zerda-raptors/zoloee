import java.awt.*;
import java.util.ArrayList;

/**
 * Created by zoloe on 2016. 12. 07..
 */
public class Area {
    ArrayList<GameObject> tiles;

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

    public void draw(Graphics graphics){
        for (GameObject tile:
             tiles) {
            tile.draw(graphics);
        }
    }
}//class Area

// ebben kell lennie az alapterkepnek
