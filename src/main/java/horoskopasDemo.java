import Interface.MyFrame;
import Interface.MyLabel;
import Model.horoskopas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.DateTimeException;

import static Helpers.Helper.*;


public class horoskopasDemo {

    public static void main (String[] args) {

        MyFrame frame = new MyFrame();
        frame.setLayout(new GridLayout(3,1));

        //#region pirmoji JPanel
        JPanel pirmoji = new JPanel();
        pirmoji.setLayout(new GridLayout(2,1));
        JPanel pirmoji1 = new JPanel();
        JPanel pirmoji2 = new JPanel();
        JTextField metai = new JTextField(10);
        JTextField menuo = new JTextField(10);
        JTextField diena = new JTextField(10);
        JLabel klaidospr = new  JLabel();
        pirmoji1.add(metai);
        pirmoji1.add(menuo);
        pirmoji1.add(diena);
        pirmoji2.add(klaidospr, BorderLayout.CENTER);
        pirmoji.add(pirmoji1);
        pirmoji.add(pirmoji2);
        //#endregion

        //#region antroji JPanel
        JPanel centr = new JPanel();
        MyLabel zodiakas = new MyLabel("<Zodiako zenklas>");
        MyLabel dabarmetu = new MyLabel("<Dabartinis amzius>");
        MyLabel ikigimtadienio = new MyLabel("IKi gimtadienio liko <dienu skaicius>");
        MyLabel savaitesdiena = new MyLabel("Kai gimete buvo <savaites diena>");
        MyLabel tekstas = new MyLabel("<horoskopas");
        centr.setLayout(new GridLayout(5,1));
        centr.add(zodiakas);
        centr.add(dabarmetu);
        centr.add(ikigimtadienio);
        centr.add(savaitesdiena);
        centr.add(tekstas);


        //#endregion

        //#region trecioji JPanel

        JButton find = new JButton("Find");
        find.setBackground(Color.blue);
        JButton clear = new JButton("Clear");
        JPanel apatine = new JPanel();
        apatine.add(find);
        apatine.add(clear);

        //#endregion

        //#region click
        find.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    if (MetuTikrinimas(Integer.parseInt(metai.getText()), klaidospr, metai)) {
                        zodiakas.setText(Findhoroskop(Integer.parseInt(menuo.getText()), Integer.parseInt(diena.getText())).toString());
                        dabarmetu.setText("Siuo metu Jums " + Kiekmetu(Integer.parseInt(metai.getText()), Integer.parseInt(menuo.getText()), Integer.parseInt(diena.getText())));
                        ikigimtadienio.setText("Iki gimtadienio Jums liko " + IkiGimtadienio(Integer.parseInt(metai.getText()), Integer.parseInt(menuo.getText()), Integer.parseInt(diena.getText())));
                        savaitesdiena.setText("Kai gimėte buvo " + Savaitesdiena(Integer.parseInt(metai.getText()), Integer.parseInt(menuo.getText()), Integer.parseInt(diena.getText())));
                        tekstas.setText(Prognoze(horoskopas.Duomenys(), Findhoroskop(Integer.parseInt(menuo.getText()), Integer.parseInt(diena.getText()))));
                    }

            }
        });

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                metai.setText(null);
                menuo.setText(null);
                diena.setText(null);
                klaidospr.setText(null);
                zodiakas.setText("<Zodiako zenklas>");
                dabarmetu.setText("<Dabartinis amzius>");
                ikigimtadienio.setText("IKi gimtadienio liko <dienu skaicius>");
                savaitesdiena.setText("Kai gimete buvo <savaites diena>");
                tekstas.setText("<horoskopas");
                metai.setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.black));
            }
        });

        //#endregion

        frame.getContentPane().add(pirmoji);
        frame.getContentPane().add(centr);
        frame.getContentPane().add(apatine);
        frame.setVisible(true);




    }
}



