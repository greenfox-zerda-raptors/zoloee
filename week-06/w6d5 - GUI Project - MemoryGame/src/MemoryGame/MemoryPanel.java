package MemoryGame;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by zoloe on 2016. 11. 25..
 */
public class MemoryPanel extends JPanel {
    // arraylist of images
    // majd kesobb megcsinalni, hogy magatol olvassa be a kepeket, es ahhoz igazitsa a meretet

    private ImageIcon closedCardIcon;

    private String filePathNameSlash = "./images/";
    private String imageFileNames = ("image1.png,image2.png,image3.png,image4.png"); //ebben kell tarolni a kepneveket
    private ArrayList<JButton> cards = new ArrayList<>(); // kartyak = array list of buttons

    public MemoryPanel(){
       closedCardIcon = new ImageIcon("closed.JPG");
       // imageket berakni a cardsba
       String[] separatedImageFilenames = imageFileNames.split(",");

       for (int i = 0; i <separatedImageFilenames.length; i++){
           Icon tempIcon = new ImageIcon(filePathNameSlash + separatedImageFilenames[i]);
           cards.add(i, new JButton(tempIcon));
       }
       GridLayout myGridlayout = new GridLayout(0,separatedImageFilenames.length);
//       this.add(myGridlayout)
        setLayout(myGridlayout);
        for (JButton card:
             cards) {this.add(card);
        }

//        super(new GridLayout(2,2));


    }// MemoryPanel()

// paintComponentet kivettem, mert nem azzal kell csinalni

}// class MemoryPanel
