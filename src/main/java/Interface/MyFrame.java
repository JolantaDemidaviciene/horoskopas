package  Interface;
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() {
      this.setSize(600,600);
      this.setTitle("Horoskopas");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setVisible(true);
      this.setBackground(Color.decode("#f4f4f4"));
      this.setLayout(new BorderLayout());
      ImageIcon logo = new ImageIcon("./src/main/java/zodiak-logo.png");
      this.setIconImage(logo.getImage());
    }
}

