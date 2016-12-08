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


    public Board()  {
        int level = 1;
        myArea = new Area();
        myHero = new Hero(0,0);
        enemies = new ArrayList<MoveableThing>();
        int i = 1;
        do{
            int randX = myRandom.nextInt(10);
            int randY = myRandom.nextInt(10);
            boolean occupiedSpace = false;
            if (myArea.tiles.get(10 * randY + randX).moveable){
                try {
                    for (MoveableThing enemy :
                            enemies) {
                        if (enemy.getPosX() == randX) {
                            occupiedSpace = true;
                        }
                        if (enemy.getPosY() == randY) {
                            occupiedSpace = true;
                        }
                    }
                }catch (Exception e){}

                if (!occupiedSpace) {
                    enemies.add(new Skeleton(randX,randY,1));
                    i++;
                }
            }
        }while ( i < level + 5 );

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
            graphics.drawString(myArea.getTilePositionAndisMoveable(myHero.getPosX(),myHero.getPosY()),10,735);
            graphics.drawString( "hero XY : " + myHero.getPosX() + " " +myHero.getPosY(), 10, 745); //kirajzolja az xy poziciojat
            //        hibakereseshez
        myHero.drawStats(graphics);
        for (MoveableThing enemy :
                enemies) {
            enemy.draw(graphics);
        }
    }//paint

}//Board
