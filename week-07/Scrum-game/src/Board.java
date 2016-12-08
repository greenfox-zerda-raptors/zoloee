import javax.swing.*;
import javax.swing.text.Position;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;


/**
 * Created by zoloe on 2016. 12. 05..
 */
public class Board extends JPanel implements KeyListener{
    MoveableThing myHero;
    ArrayList<MoveableThing> enemies;
    Area myArea;
    Random myRandom = new Random();
    int numberOfEnemies;
    int level;

    public Board()  {
        level = 1;
        myArea = new Area();
        myHero = new Hero(0,0);
        enemies = new ArrayList<MoveableThing>();
        enemies = fillEnemies(level);

        addKeyListener(this);
        setFocusable(true); //ez kell hogy a Jframe helyett a Jpanelen legyen a focus
        setPreferredSize(new Dimension(720, 900));
        setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP : {
                if (myArea.getTileIsMoveable(myHero.getPosX(),myHero.getPosY()-1)) {
                    myHero.moveUp();
                }
                break;
            }
            case KeyEvent.VK_DOWN : {
                if (myArea.getTileIsMoveable(myHero.getPosX(),myHero.getPosY()+1)) {
                    myHero.moveDown();
                }
                break;
            }
            case KeyEvent.VK_RIGHT : {
                if (myArea.getTileIsMoveable(myHero.getPosX()+1,myHero.getPosY())) {
                    myHero.moveRight();
                }
                break;
            }case KeyEvent.VK_LEFT : {
                if (myArea.getTileIsMoveable(myHero.getPosX()-1,myHero.getPosY())) {
                    myHero.moveLeft();
                }
                break;
            }
            default:{
                break;
            }
        }
        repaint();
    }
    protected ArrayList<MoveableThing> fillEnemies(int lev){
        int i = 1;
        ArrayList<MoveableThing> generatedEnemies = new ArrayList<>();
        numberOfEnemies = myRandom.nextInt(4)+(lev * 3);
        do{
            int randX = myRandom.nextInt(10);
            int randY = myRandom.nextInt(10);
            boolean occupiedSpace = false;
            if (myArea.tiles.get(10 * randY + randX).moveable){
                try {
                    for (MoveableThing enemy :
                            generatedEnemies) {
                        if (enemy.getPosX() == randX) {
                            occupiedSpace = true;
                        }
                        if (enemy.getPosY() == randY) {
                            occupiedSpace = true;
                        }
                    }
                }catch (Exception e){}

                if (!occupiedSpace) {
                    generatedEnemies.add(new Skeleton(randX,randY,lev));
                    i++;
                }
            }
        }while ( i <= numberOfEnemies );
        return generatedEnemies;
    }// fillEnemies

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void paint(Graphics graphics){
        myArea.draw(graphics);
        myHero.draw(graphics);
            graphics.drawString("Tile: " + myArea.getTilePositionAndisMoveable(myHero.getPosX(),myHero.getPosY()),10,735);
            graphics.drawString( "Hero XY : " + myHero.getPosX() + " " +myHero.getPosY(), 10, 750); //kirajzolja az xy poziciojat
            //        hibakereseshez
        myHero.drawStats(graphics);
        for (MoveableThing enemy :
                enemies) {
            enemy.draw(graphics);
        }
        graphics.drawString("number of enemies: " + Integer.toString(numberOfEnemies), 10,780);
    }//paint

}//Board
