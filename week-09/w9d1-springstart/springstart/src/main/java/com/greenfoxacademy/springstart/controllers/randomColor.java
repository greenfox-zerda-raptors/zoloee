package com.greenfoxacademy.springstart.controllers;

import java.util.Random;

/**
 * Created by zoloe on 2016. 12. 19..
 */
public class randomColor {
    String letters[] = "0123456789ABCDEF".split("");
    int min=letters.length-(letters.length/3);
    int max=letters.length;
    Random rnd=new Random(1000);
    String colorEx[]= new String[]{"00","00","00"};
    int colorChange=0;
    int addColorChange=1;

    protected String getRandomColor() {
        StringBuilder color = new StringBuilder("#");
        int highColor=rnd.nextInt(2)+1;
        for (int i = 0; i<3; i++) {
            int addColor=0;
            if (i==highColor)
                highColor=min;

            color.append(colorEx[i]);

            if (colorChange==i) {
                if (colorEx[i].equals("00"))
                    colorEx[i]="55";
                else if (colorEx[i].equals("55"))
                    colorEx[i]="AA";
                else if (colorEx[i].equals("AA"))
                    colorEx[i]="FF";
                else {
                    if (i>0 && !"00".equals(colorEx[i-1]))
                        colorEx[i-1]="00";
                    else if (i<2)
                        colorEx[i+1]="00";
                    colorChange+=addColorChange;
                    //colorChange++;
                    if (colorChange>2 || colorChange<0) {
                        //colorChange=0;
                        addColorChange=-addColorChange;
                        colorChange+=addColorChange;
                        colorChange+=addColorChange;
                    }
                }
            }
        }
        return color.toString();
    }
}
