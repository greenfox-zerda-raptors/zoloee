import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;


/**
 * Created by zoloe on 2016. 12. 05..
 */
public class Board extends JPanel implements KeyListener{
    Hero myHero;
    ArrayList<MovableThing> enemies;
    Area myArea;
    Random myRandom = new Random();
    int numberOfEnemies;
    int level;
    boolean thereIsAbattle;
    MovableThing enemyToFight;

    public Board()  {
        level = 1;
        myArea = new Area();
        myHero = new Hero(0,0);
        enemies = new ArrayList<MovableThing>();
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
                if (!thereIsAbattle) {
                    if (myArea.getTileIsMoveable(myHero.getPosX(), myHero.getPosY() - 1)) {
                        myHero.moveUp();
                    }
                }
                break;
            }
            case KeyEvent.VK_DOWN : {
                if (!thereIsAbattle) {
                    if (myArea.getTileIsMoveable(myHero.getPosX(),myHero.getPosY()+1)) {
                        myHero.moveDown();
                    }
                }
                break;
            }
            case KeyEvent.VK_RIGHT : {
                if (!thereIsAbattle) {
                    if (myArea.getTileIsMoveable(myHero.getPosX()+1,myHero.getPosY())) {
                        myHero.moveRight();
                    }
                }
                break;
            }
            case KeyEvent.VK_LEFT : {
                if (!thereIsAbattle) {
                    if (myArea.getTileIsMoveable(myHero.getPosX() - 1, myHero.getPosY())) {
                        myHero.moveLeft();
                    }
                }
                break;
            }
            case KeyEvent.VK_SPACE : {
                if (thereIsAbattle){
                    MovableThing winnerOfBattle = myHero.strike(enemyToFight);

                    if ( winnerOfBattle == myHero ) { //enemy Killed
                        enemies.remove(enemies.indexOf(enemyToFight));
                        thereIsAbattle = false;
                        myHero.setImageDown();
                        myHero.levelUp();
                        enemyToFight = null;
                    } else if ( winnerOfBattle == enemyToFight ){ //GameOver
                        thereIsAbattle = false;
                        myHero.setImageDown(); // GameOverImagekell
                        enemyToFight = null;
                    }
                }
                break;
            }
            default:{
                break;
            }
        }
        repaint();

        for (MovableThing enemy: //check if there is a thereIsAbattle
             enemies) {
            if (enemy.getPosX() == myHero.getPosX()){
                if (enemy.getPosY() == myHero.getPosY()) {
                    thereIsAbattle = true;
                    enemyToFight = enemy;
                    myHero.setImageBattle();
                }
            }
        }// foreach
    }// keyPressed

    protected ArrayList<MovableThing> fillEnemies(int lev){
        int i = 1;
        ArrayList<MovableThing> generatedEnemies = new ArrayList<>();
        numberOfEnemies = myRandom.nextInt(4)+(lev * 3);
        do{
            int randX = myRandom.nextInt(10);
            int randY = myRandom.nextInt(10);
            boolean occupiedSpace = false;
            if (myArea.tiles.get(10 * randY + randX).moveable){
                try {
                    for (MovableThing enemy :
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
                    generatedEnemies.add(new Skeleton(randX,randY,lev,"Skeleton" + Integer.toString(i)));
                    i++;
                }
            }
        }while ( i <= numberOfEnemies );
        generatedEnemies.get(0).setKeyHolder(true);  // az elso Skeleton legyen a keyholder
        return generatedEnemies;
    }// fillEnemies

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void paint(Graphics graphics){
        myArea.draw(graphics);
        graphics.setFont(new Font("System", Font.BOLD, 13));

            graphics.drawString("Tile: " + myArea.getTilePositionAndisMoveable(myHero.getPosX(),myHero.getPosY()),10,735);
            graphics.drawString( "Hero XY : " + myHero.getPosX() + " " +myHero.getPosY(), 10, 750); //kirajzolja az xy poziciojat
            //        hibakereseshez

        if (!( enemyToFight == null )) {
            enemyToFight.drawStats(graphics);
        }

        for (MovableThing enemy :
                    enemies) {
                enemy.draw(graphics);
        }
        myHero.draw(graphics);
        myHero.drawStats(graphics);
//        graphics.drawString("number of enemies: " + Integer.toString(numberOfEnemies), 300,735); // for error checking
//        graphics.drawString( );   // ki kell irni hogy ki nyert
    }//paint

}//Board
