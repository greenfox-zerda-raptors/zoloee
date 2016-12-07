import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


/**
 * Created by zoloe on 2016. 12. 05..
 */
public class Board extends JPanel implements KeyListener{
    GameObject myHero;
    Area myArea;
    public Board()  {

        myArea = new Area();
        myHero = new Hero(0,0);
        addKeyListener(this);
        setFocusable(true); //ez kell hogy a Jframe helyett a Jpanelen legyen a focus
        setPreferredSize(new Dimension(720, 900));
        setVisible(true);
    }
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP : {
                myHero = new Hero("images/hero-up.png",myHero.getPosX(),myHero.getPosY()-1);
                break;
            }
            case KeyEvent.VK_DOWN : {
                myHero = new Hero("images/hero-down.png",myHero.getPosX(),myHero.getPosY()+1);
                break;
            }
            case KeyEvent.VK_RIGHT : {
                myHero = new Hero("images/hero-right.png",myHero.getPosX()+1,myHero.getPosY());
                break;
            }case KeyEvent.VK_LEFT : {
                myHero = new Hero("images/hero-left.png",myHero.getPosX()-1,myHero.getPosY());
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
//        super.paint(graphics);
        // here you have a 720x900 canvas
        // you can create and draw an image using the class below e.g.
        myArea.draw(graphics);
        myHero.draw(graphics);
    }//paint
}//Board
