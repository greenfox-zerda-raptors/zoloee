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

    public MemoryPanel(){
        // imageket berakni az iconarrayba
        //a kepnev stringet foldarabolom, hogy konnyebb legyen kezelni
        String[] separatedImageFilenames = imageFileNames.split(",");

        int j = 0;       //dupla kartyakat kell csinalnunk, ehhez kell egy masik valtozo is
        for (int i = 0; i <separatedImageFilenames.length; i++){
            icons.add(j++, new ImageIcon(imageFilePath + separatedImageFilenames[i]));
            icons.add(j++, new ImageIcon(imageFilePath + separatedImageFilenames[i])); // igy lesz 2 egyforma ugyanoyan kep
        }
        Collections.shuffle(icons); //megkeveri az arraylistet

        //letre kell hozni a buttonokat, arccal leforditva (closedcardicon)
        for (int i = 0; i < separatedImageFilenames.length * 2; i++){
            cards.add(i, new JButton(closedCardIcon)); //leforditott keppel hozza letre
        }
        //action listener hozzadasa a buttonokhoz:
        for (JButton card:
                cards) {
            card.addActionListener(new ImageButtonListener());
        }

        //kitalalni hogy hogy szamoljam ki hogy hany sor / oszlop legyen
        int numOfrows = (separatedImageFilenames.length / 2);
        while (!(separatedImageFilenames.length % numOfrows == 0)){
            numOfrows--;
        }

        GridLayout myGridlayout = new GridLayout(numOfrows,0);       //cols: 0 => ahny elem van, azt belefaszazza...

        setLayout(myGridlayout);
        for (JButton card:
                cards) {
            this.add(card);
        }

    }// MemoryPanel()

    private class ImageButtonListener implements ActionListener {
                            // mi tortenik, ha megnyomjak?
       private int numOfCliks = 0;
       private JButton tempCard;

        @Override
        public void actionPerformed(ActionEvent e) {
            //check if 1stclick


//            if ( numOfCliks == 0 ){

            cards.get(cards.indexOf(e.getSource())).setIcon(icons.get(cards.indexOf(e.getSource())));
            tempCard = cards.get(cards.indexOf(e.getSource()));
            numOfCliks++;
//            } if ( numOfCliks == 2){
//                    cards.get(cards.indexOf(e.getSource())).setIcon(icons.get(cards.indexOf(e.getSource())));
//                    if ( !(cards.get(cards.indexOf(e.getSource())) == tempCard)){
//                        tempCard.setIcon(closedCardIcon);
//                        cards.get(cards.indexOf(e.getSource()));
        }//actionPerformed
     }//ImageButtonListener
}// class MemoryPanel
