import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zoloe on 2016. 11. 23..
 */
public class Counter extends JFrame implements ActionListener {
    int mouseClicks = 0;
    JLabel cLabel = new JLabel("Pressed: null");
        //ez ket field azert van kozvetlen a class-ban, hogy az Action Listener elerje
    //init Jframe with default empty constructor:
    public Counter() throws HeadlessException {

        this.setTitle("Click Counter");

        //init Jpanel:
        JPanel cPanel = new JPanel();

        JButton cButton = new JButton("Press me!");
        JButton cResetButton = new JButton("Reset");

        cButton.setActionCommand("Click");
        cResetButton.setActionCommand("Reset");

        cButton.addActionListener(this); //az action listener ezen ovjektumon belul kerul implementalasra
        cResetButton.addActionListener(this);

        cPanel.add(cButton);
        cPanel.add(cResetButton);

        cPanel.add(cLabel);

        this.add(cPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }


    @Override //Az Action Listener izejet overrideoljuk
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand(); //ezzel vizsgaljuk hogy melyik gombt nyomtak meg
        switch (command){
            case "Click" : {
                mouseClicks++;
                break;
            }
            case "Reset" : {
                mouseClicks = 0;
                break;
            }default: break;
        }
        cLabel.setText("Pressed: " + mouseClicks);
    }
}
