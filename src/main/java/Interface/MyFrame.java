package  Interface;
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() {
      this.setSize(500, 500);
      this.setTitle("Horoskopas");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setVisible(true);
      this.setBackground(Color.GRAY);
      this.setLayout(new BorderLayout());
      ImageIcon logo = new ImageIcon("/src/main/zodiak-logo.png");
      this.setIconImage(logo.getImage());

   }
}

