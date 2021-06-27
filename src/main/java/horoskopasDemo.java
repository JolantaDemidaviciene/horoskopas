import Interface.MyFrame;
import Interface.MyLabel;
import Interface.TabbedDemo;
import Model.horoskopas;

import javax.swing.*;
import javax.swing.plaf.TabbedPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.annotation.Target;
import java.time.DateTimeException;
import java.util.zip.DataFormatException;

import static Helpers.Helper.*;


public class horoskopasDemo {

    public static void main (String[] args) {

        MyFrame frame = new MyFrame();
        JTextArea logasset = new JTextArea(200,200);

        //#region pirmoji JPanel
        JPanel pirmoji = new JPanel();
        pirmoji.setLayout(new GridLayout(3,1));
        JPanel pirmoji1 = new JPanel();
        JPanel pirmoji2 = new JPanel();
        JPanel pirmoji3 = new JPanel();
        JTextField metai = new JTextField(10);
        JTextField menuo = new JTextField(10);
        JTextField diena = new JTextField(10);
        JLabel klaidospr = new  JLabel();
        pirmoji2.add(metai);
        pirmoji2.add(menuo);
        pirmoji2.add(diena);
        pirmoji3.add(klaidospr, BorderLayout.CENTER);
        pirmoji.add(pirmoji1);
        pirmoji.add(pirmoji2);
        pirmoji.add(pirmoji3);
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
                try {
                    if (MetuTikrinimas(Integer.parseInt(metai.getText()), klaidospr, metai)) {
                        zodiakas.setText(Findhoroskop(Integer.parseInt(menuo.getText()), Integer.parseInt(diena.getText())).toString());
                        dabarmetu.setText("Siuo metu Jums " + Kiekmetu(Integer.parseInt(metai.getText()), Integer.parseInt(menuo.getText()), Integer.parseInt(diena.getText())));
                        ikigimtadienio.setText("Iki gimtadienio Jums liko " + IkiGimtadienio(Integer.parseInt(metai.getText()), Integer.parseInt(menuo.getText()), Integer.parseInt(diena.getText())));
                        savaitesdiena.setText("Kai gimėte buvo " + Savaitesdiena(Integer.parseInt(metai.getText()), Integer.parseInt(menuo.getText()), Integer.parseInt(diena.getText())));
                        tekstas.setText(Prognoze(horoskopas.Duomenys(), Findhoroskop(Integer.parseInt(menuo.getText()), Integer.parseInt(diena.getText()))));
                        logasset.append(metai.getText() + " " + menuo.getText() + " " + diena.getText() + "\n");

                    }
                }
                catch (DateTimeException ed){
                    throw ;
                }
                catch (NullPointerException en){
                    en.getMessage();
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

        JPanel svarbiausia = new JPanel();
        svarbiausia.setLayout(new GridLayout(3,1));
        svarbiausia.add(pirmoji);
        svarbiausia.add(centr);
        svarbiausia.add(apatine);


        JTabbedPane tabai = new JTabbedPane();
        tabai.addTab("Horoskopai", svarbiausia);
        tabai.addTab("Logas", logasset);
        frame.add(tabai);
        frame.setVisible(true);





    }
}



