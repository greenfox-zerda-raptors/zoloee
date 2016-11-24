import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zoloe on 2016. 11. 24..
 */
public class WrapperAppMenu extends JFrame implements ActionListener {
    JMenuItem exitMenuItem = new JMenuItem("Exit"); // itt kell lennie, ha hasznalni akarom az Action Eventben

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitMenuItem){
            System.exit(0);
        }else System.out.println("fuck");
    }// actionPerformed

    public WrapperAppMenu() throws HeadlessException {
        JMenuBar myMenubar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        myMenubar.add(fileMenu);
        fileMenu.add(exitMenuItem);
        setJMenuBar(myMenubar); //ez volt az uj

        exitMenuItem.addActionListener(this);

//        Box box = Box.createVerticalBox();
//        this.add(box, BorderLayout.CENTER);
        JPanel ImagePanel = new ImagePanel();
        this.add(ImagePanel);
        this.setSize(600, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
//        this.setResizable(false);
        this.setVisible(true);
    }// WrapperAppMenu()
}// class WrapperAppMenu
