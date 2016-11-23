import javax.swing.*;
import java.awt.*;

/**
 * Created by zoloe on 2016. 11. 23..
 */
public class HelloWorld extends JFrame{

    public HelloWorld() throws HeadlessException {

        this.setTitle("aaaaaaaarrrrrggggghhhhhhh");

        this.pack();
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
            // a fonti 4 kozepre rakja
        JPanel myPanel = new JPanel();
        JLabel label1 = new JLabel("Hereby I greet you, Zolo!\n");
        JLabel label2 = new JLabel("yolo");
        myPanel.add(label1);
        myPanel.add(label2);
        this.add(myPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
                "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
                "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
                "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
        int i = 0;

        JLabel[] labels = new JLabel[hellos.length];
        for (String salute:
             hellos) {
            labels[i] = new JLabel(salute);
            myPanel.add(labels[i]);
            i++;
        }

    this.setLocation(3, 3);
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension screenDim = tk.getScreenSize();
//    Dimension myFrameDim = this.getBounds();
    int x = (int) ((screenDim.getWidth() - this.getWidth()) / 2);
    int y = (int) ((screenDim.getHeight() - this.getHeight()) / 2);
    this.setLocation(x, y);
    }
}
