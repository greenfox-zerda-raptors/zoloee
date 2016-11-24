import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by zoloe on 2016. 11. 24..
 */
public class EventCounter extends JFrame implements KeyListener {
    int counterMcount = 0;
    int counterWcount = 0;
    JLabel mCount = new JLabel("-");
    JLabel wCount = new JLabel("-");

    public EventCounter() throws HeadlessException i {
        int counterKcount = 0;
        JTextField TextField = new JTextField(20);
        JLabel kCount = new JLabel("-");

        JLabel nameKcount = new JLabel("Keyboard counter:");
        nameKcount.setLabelFor(kCount);

        JLabel nameMcount = new JLabel("Mouse counter:");
        nameMcount.setLabelFor(mCount);

        JLabel nameWcount = new JLabel("Window counter:");
        nameWcount.setLabelFor(nameWcount);

        TextField.addKeyListener(this);
        this.addMouseListener(new ListenForMouse());
        this.addWindowListener(new listenForWindow());

        Box ecBox = Box.createVerticalBox();

        ecBox.add(Box.createVerticalStrut(10));
        ecBox.add(TextField);
        ecBox.add(Box.createVerticalStrut(10));
        ecBox.add(nameMcount);
        ecBox.add(mCount);
        ecBox.add(Box.createVerticalStrut(10));
        ecBox.add(nameKcount);
        ecBox.add(kCount);
        ecBox.add(Box.createVerticalStrut(10));
        ecBox.add(nameWcount);
        ecBox.add(wCount);
        ecBox.add(Box.createVerticalStrut(10));

        this.setTitle("EventCounter");
        this.add(ecBox, BorderLayout.CENTER);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
//        this.setSize(400,400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        @Override
        public void keyPressed(KeyEvent) {
//            setCounter(counterKcount,kCount);  // valamiert ez csak egyszer fut
            counterKcount++;
            kCount.setText(Integer.toString(counterKcount));
        }

        @Override
        public void keyReleased(KeyEvent) {
            counterKcount++;
            kCount.setText(Integer.toString(counterKcount));
        }

        @Override
        public void keyTyped(KeyEvent) {
        }

//    private class ListenForKeys implements KeyListener{
//        @Override
//        public void keyPressed(KeyEvent e) {
////            setCounter(counterKcount,kCount);  // valamiert ez csak egyszer fut
//            counterKcount++;
//            kCount.setText(Integer.toString(counterKcount));
//        }
//
//        @Override
//        public void keyReleased(KeyEvent e) {
//            counterKcount++;
//            kCount.setText(Integer.toString(counterKcount));
//        }
//
//        @Override
//        public void keyTyped(KeyEvent e) {
//
//        }
//    }
    private void setCounter(int counter, JLabel label){
        counter++;
        label.setText(Integer.toString(counter));
    }

    private class ListenForMouse implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {
            counterMcount++;
            mCount.setText(Integer.toString(counterMcount));
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

    private class listenForWindow implements WindowListener {
        @Override
        public void windowOpened(WindowEvent e) {
            counterWcount++;
            wCount.setText(Integer.toString(counterWcount));
        }

        @Override
        public void windowClosing(WindowEvent e) {

        }

        @Override
        public void windowClosed(WindowEvent e) {

        }

        @Override
        public void windowIconified(WindowEvent e) {
            counterWcount++;
            wCount.setText(Integer.toString(counterWcount));
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            counterWcount++;
            wCount.setText(Integer.toString(counterWcount));
        }

        @Override
        public void windowActivated(WindowEvent e) {
            counterWcount++;
            wCount.setText(Integer.toString(counterWcount));
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            counterWcount++;
            wCount.setText(Integer.toString(counterWcount));
        }
    }
}
