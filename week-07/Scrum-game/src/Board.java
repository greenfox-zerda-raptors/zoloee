import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


/**
 * Created by zoloe on 2016. 12. 05..
 */
public class Board extends JPanel{

    ArrayList<Tile> tiles;

    public Board() {
        tiles = new ArrayList<>();
        for (int j = 0; j < 720; j += 72) {
            for (int k = 0; k < 720; k += 72) {
//                if (k % 350 == 0) {
//                    Tile image = new Tile("images/wall.png", k, j);
//                    tiles.add(image);
//                }else {
                Tile image = new Tile("images/floor.png", k, j);
                tiles.add(image);
            }
        }
//    }
        //ide folhozni a for

        // set the size of your draw board
        setPreferredSize(new Dimension(720, 900));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics){
        super.paint(graphics);
        // here you have a 700x900 canvas
        // you can create and draw an image using the class below e.g.

//        Tile image = new Tile("images/floor.png", 0, 0);
//        image.draw(graphics);


        for (Tile tile :
             tiles) {
            tile.draw(graphics);
        }

//        for (int j = 0; j < 720; j += 72 ){
//            for (int k = 0; k < 720; k += 72 ){
//                if ( k % 350 == 0 ) {
//                    Tile image = new Tile("images/wall.png", k, j );
//                    image.draw(graphics);
//                }else {
//                    Tile image = new Tile("images/floor.png", k, j );
//                    image.draw(graphics);
//                }
//
//            }
//        }
    }//paint
}//Board