import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


/**
 * Created by zoloe on 2016. 12. 05..
 */
public class Board extends JPanel{

    ArrayList<GameObject> tiles;
    GameObject myHero;
    int[][] map = new int[][]{
            {0,1,1,1,1,1,1,1,1,1},
            {0,1,1,0,0,0,0,0,0,0},
            {0,0,0,0,1,1,0,1,0,0},
            {0,1,1,0,0,1,0,1,0,0},
            {0,1,1,1,0,1,0,1,0,0},
            {0,0,1,1,0,0,0,1,1,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,1,1,0,1,1,1,0,0},
            {0,0,1,1,0,1,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0}
    };

    public Board() {
        tiles = new ArrayList<>();
//        tiles.add(new Wall(1,0));
        for (int i = 0; i < 10; i += 1) {
            for (int j = 0; j < 10; j += 1){
                if ( map[i][j] == 0 ){
                    tiles.add(new Floor(j,i));
                }else if ( map[i][j] == 1 ){
                    tiles.add(new Wall(j,i)); // pos x is the horizontal axle
//                }else if ( map[i][j] == 2 ){
//                    tiles.add(new Floor(j,i));
//                    tiles.add(new Hero(j,i));
                }
            }
        }
        myHero = new Hero(0,0);

        // set the size of your draw board
        setPreferredSize(new Dimension(720, 900));
        setVisible(true);
    }


    @Override
    public void paint(Graphics graphics){
        super.paint(graphics);
        // here you have a 720x900 canvas
        // you can create and draw an image using the class below e.g.

        for (GameObject tile :
                tiles) {
            tile.draw(graphics);
        }
        myHero.draw(graphics);
    }//paint

    class myKeyListener implements KeyListener {

        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_DOWN : {
                    myHero = new Hero(0,0);
                    break;
                }
                case KeyEvent.VK_RIGHT : {
                    break;
                }
                default:{
                    break;
                }
            }
            repaint();
        }

        @Override
        public void keyReleased(KeyEvent e) {
            // TODO Auto-generated method stub

        }

        @Override
        public void keyTyped(KeyEvent e) {
        }
    }// myKeyListener
}//Board
