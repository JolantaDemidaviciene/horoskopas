import Interface.MyFrame;
import Model.horoskopas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class horoskopasDemo {

    public static void main (String[] args) {

        MyFrame frame = new MyFrame();
        JTextField metai = new JTextField(10);
        metai.setBounds(0, 0, 100, 50);
      
        JTextField menuo = new JTextField(10);
        menuo.setBounds(150, 0, 100, 50);

        JTextField diena = new JTextField(10);
        diena.setBounds(300, 0, 100, 50);


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

       find.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String metaid= metai.getText();
                String menuod= menuo.getText();
                String dienad = diena.getText();
               atsakymo.setText(metaid + "-"+ menuod +"-"+dienad);
            }
        });
       clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               metai.setText(null);
               menuo.setText(null);
               diena.setText(null);
            }
        });


        ArrayList<horoskopas> sarasas = new ArrayList<horoskopas>() {{
            new horoskopas("03.21","04.20","Avinas","Nesistenkite visko tempti vieni, jeigu užsiimate išsamiu namų, sodybos ar darbo vietos tvarkymu. Dalinkitės pareigomis su šalia esančiais, tarkitės dėl išlaidų. Nenumokite ranka į sveikatos sutrikimus.");
            new horoskopas("04.21", "05.21","Jautis","Tikriausiai šiandien patirsite ypatingų emocinių impulsų. Galite leistis į lengvabūdišką avantiūrą, ką nors vilioti, flirtuoti. Turėtų pagerėti santykiai su vaikais.");
            new horoskopas("05.22","06.21","Dvyniai","Trokšite geresnių sąlygų, komforto, patogumų. Galbūt kažką pertvarkinėsite. Tai gali kainuoti daugiau, nei apskaičiavote iš anksto. Pasisaugokite sukčių.");
            new horoskopas("06.22","07.22","Vėžys","Savo energiją nukreipkite į darbą, mokslą ar kūrybą, o ne į tuščius ginčus, ambicijų demonstravimą. Nuo to priklausys, kaip pakryps pokalbis, turėsiantis įtakos jūsų autoritetui.");
            new horoskopas("07.23","08.23","Liūtas","Aiškės finansinės perspektyvos, galėsite numatyti, kaip racionaliau panaudoti turimas lėšas. Regis, jums kils ūpas šį bei tą nusipirkti, atsinaujinti. O galbūt rūpinsitės dovana kažkam, kas jums išties rūpi.");
            new horoskopas("08.24","09.23", "Mergelė","Tai gali būti naujų galimybių diena, kai po ilgų pastangų ims ryškėti perspektyvos. Viskas taip trapu, kad lengva sugadinti. Saugokitės klastų, vagysčių, apsinuodijimo.");
            new horoskopas("09.24", "10.23", "Svarstyklės","Gana neutrali diena – kaip pasiklosite, taip išsimiegosite. Nelabai tiktų imtis intensyvios veiklos. Pasisaugokite, kad dėl alkoholio ar netinkamų produktų, vaistų vartojimo nekiltų problemų.");
            new horoskopas("10.24","11.22","Skorpionas","Šiandien teigiamai veiksite aplinkinius ir jie – jus. Žadinsite draugiškumo bei solidarumo jausmus. Verta pamėginti atnaujinti jums svarbius santykius, jeigu jie neseniai patyrė krizę.");
            new horoskopas("11.23","12.22","Šaulys","Jeigu būtina, šiandien tvarkykite dokumentus, kreipkitės į valdžią dėl leidimų, oficialių raštų, patvirtinimų, atsiskaitymų. Bus nelengva, tačiau naudokitės tomis progomis, kurios įmanomos.");
            new horoskopas("12.23","01.20","Ožiaragis","Šiandien ypač aktualūs gali būti su išsilavinimu, studijomis, įstatymais, kelionėmis susiję reikalai. Galbūt nustebins kolega ar pažįstamas iš užsienio.");
            new horoskopas("01.21","02.19","Vandenis","Šiandien ne viskas džiugins. Galbūt kažkas primins negrąžintą skolą, paprašys paslaugos, kurią gana keblu suteikti. Galite įsigyti brokuotą daiktą, dėl jo aiškintis ir pan." );
            new horoskopas("02.20", "03.20", "Žuvys","Jūsų nuotaikos ir emocijos bus labai nepastovios. Neleiskite, kad sąmonę užvaldytų nepagrįsti įtarimai, pavydas. Tai prasti palydovai, norint išsaugoti santykius." );
        }};

    }

}

