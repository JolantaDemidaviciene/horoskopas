import Interface.MyFrame;

import javax.swing.*;
import java.awt.*;

public class horoskopasDemo {

    public static void main (String[] args) {

        MyFrame frame = new MyFrame();
        JTextField metai = new JTextField(10);
        metai.setBounds(0, 0, 100, 50);
        metai.setText("Metai");
        JTextField menuo = new JTextField(10);
        menuo.setBounds(150, 0, 100, 50);
        menuo.setText("Menuo");
        JTextField diena = new JTextField(10);
        diena.setBounds(300, 0, 100, 50);
        diena.setText("Diena");

        JPanel panel = new JPanel();
        panel.add(metai);
        panel.add(menuo);
        panel.add(diena);
        frame.getContentPane().add(BorderLayout.NORTH, panel);

        JButton find = new JButton("Find");
        JButton clear = new JButton("Clear");
        JPanel panelButton = new JPanel();
        panelButton.add(find);
        panelButton.add(clear);

        frame.getContentPane().add(BorderLayout.SOUTH,panelButton);

        JLabel atsakymo = new JLabel();
        atsakymo.setSize(300,300);
        atsakymo.setText("Paieskos rezultatas");
        atsakymo.setBackground(Color.red);
        frame.getContentPane().add(BorderLayout.CENTER,atsakymo);



    }

}

