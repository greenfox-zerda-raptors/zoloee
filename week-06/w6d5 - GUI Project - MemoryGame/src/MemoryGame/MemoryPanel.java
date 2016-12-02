package MemoryGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by zoloe on 2016. 11. 25..
 */
public class MemoryPanel extends JPanel {
    // arraylist of images
    // majd kesobb megcsinalni, hogy magatol olvassa be a kepeket, es ahhoz igazitsa a meretet


    private String imageFilePath = "./images/";
    private String imageFileNames = ("image1.png,image2.png,image3.jpg,image4.png,duck2.jpg,duck.jpg"); //ebben kell tarolni a kepneveket
    private ImageIcon closedCardIcon = new ImageIcon(imageFilePath + "closed.JPG");            ;
    private ArrayList<JButton> cards = new ArrayList<>(); // kartyak = array list of buttons
    private ArrayList<ImageIcon> icons = new ArrayList<>(); // leforditott karyak kepeit tarolo arraylis
    private int numOfClicks = 0;
    private int indexOfCurrentClick = -1;
    private int indexOfFormerClick = -1;

    public MemoryPanel(){
        // imageket berakni az iconarrayba
        //a kepnev stringet foldarabolom, hogy konnyebb legyen kezelni
        String[] separatedImageFilenames = imageFileNames.split(",");

        int j = 0;       //dupla kartyakat kell csinalnunk, egyik a felforditott, masik a leforditott "pakli" ehhez kell egy masik valtozo is
        for (int i = 0; i <separatedImageFilenames.length; i++){
            icons.add(j++, new ImageIcon(imageFilePath + separatedImageFilenames[i]));
            icons.add(j++, new ImageIcon(imageFilePath + separatedImageFilenames[i])); // igy lesz 2 egyforma ugyanoyan kep
        }
        Collections.shuffle(icons); //megkeveri az arraylistet

        //letre kell hozni a buttonokat, arccal leforditva (closedcardicon)
        for (int i = 0; i < separatedImageFilenames.length * 2; i++){
            cards.add(i, new JButton(closedCardIcon)); //leforditott keppel hozza letre
        }

        for (JButton card:
                cards) {
            card.addActionListener(new ImageButtonListener());
        }

        //kiszamolni hogy hany sor / oszlop legyen
        int numOfrows = (separatedImageFilenames.length / 2);
        while (!(separatedImageFilenames.length % numOfrows == 0)){
            numOfrows--;
        }

        GridLayout myGridlayout = new GridLayout(numOfrows,0);       //cols: 0 => ahany elem van, azt belefaszazza...

        setLayout(myGridlayout);
        for (JButton card:
                cards) {
            this.add(card);
        }

    }// MemoryPanel()

    private class ImageButtonListener implements ActionListener {
                            // mi tortenik, ha megnyomjak?

       private JButton tempCard;

        @Override
        public void actionPerformed(ActionEvent e) {
            //check if 1stclick

//            System.out.println("num: " + numOfClicks);
//            System.out.println("current: " + indexOfCurrentClick);
//            System.out.println("former: " + indexOfFormerClick);
//            System.out.println("==================");;

            if ( numOfClicks == 0 ){
                indexOfCurrentClick = cards.indexOf(e.getSource());
                cards.get(indexOfCurrentClick).setIcon(icons.get(indexOfCurrentClick));
                numOfClicks++;
            }else if ( numOfClicks == 1 ) { //azaz egyet mar kattintottak korabban, tehat ez a masodik katt
                indexOfFormerClick = indexOfCurrentClick;
                indexOfCurrentClick = cards.indexOf(e.getSource());
                cards.get(indexOfCurrentClick).setIcon(icons.get(indexOfCurrentClick));
                numOfClicks++;
                if (icons.get(indexOfCurrentClick) == icons.get(indexOfFormerClick)){
                    //a pair
                    //reset
                    numOfClicks = 0;
                    indexOfCurrentClick = -1;
                    indexOfFormerClick = -1;
                }
            }else if ( numOfClicks == 2 ) { //azaz mar kettot kattintottak korabban / ide csak akkor jutunk, ha nem volt par
                cards.get(indexOfFormerClick).setIcon(closedCardIcon);
                cards.get(indexOfCurrentClick).setIcon(closedCardIcon);
                numOfClicks = 0;
                indexOfCurrentClick = -1;
                indexOfFormerClick = -1;
            }
            try {
                System.out.println(icons.get(indexOfCurrentClick) == icons.get(indexOfFormerClick));
            }catch(ArrayIndexOutOfBoundsException e1){

            }
            System.out.println("num: " + numOfClicks);
            System.out.println("current: " + indexOfCurrentClick);
            System.out.println("former: " + indexOfFormerClick);
            System.out.println("==================");;
        }//actionPerformed
     }//ImageButtonListener
}// class MemoryPanel























