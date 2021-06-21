import Interface.MyFrame;
import Model.horoskopas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import Enum.EHoroskop;

import static Helpers.Helper.*;


public class horoskopasDemo {

    public static void main (String[] args) {

        ArrayList<horoskopas> sarasas = new ArrayList<horoskopas>() {{
            new horoskopas(3,21,4, 20, EHoroskop.Avinas, "Nesistenkite visko tempti vieni, jeigu užsiimate išsamiu namų, sodybos ar darbo vietos tvarkymu. Dalinkitės pareigomis su šalia esančiais, tarkitės dėl išlaidų. Nenumokite ranka į sveikatos sutrikimus.");
            new horoskopas(4,21, 5,21,EHoroskop.Jautis,"Tikriausiai šiandien patirsite ypatingų emocinių impulsų. Galite leistis į lengvabūdišką avantiūrą, ką nors vilioti, flirtuoti. Turėtų pagerėti santykiai su vaikais.");
            new horoskopas(5,22,6,21,EHoroskop.Dvyniai,"Trokšite geresnių sąlygų, komforto, patogumų. Galbūt kažką pertvarkinėsite. Tai gali kainuoti daugiau, nei apskaičiavote iš anksto. Pasisaugokite sukčių.");
            new horoskopas(6,22,7,22,EHoroskop.Vėžys,"Savo energiją nukreipkite į darbą, mokslą ar kūrybą, o ne į tuščius ginčus, ambicijų demonstravimą. Nuo to priklausys, kaip pakryps pokalbis, turėsiantis įtakos jūsų autoritetui.");
            new horoskopas(7,23,8,23,EHoroskop.Liūtas,"Aiškės finansinės perspektyvos, galėsite numatyti, kaip racionaliau panaudoti turimas lėšas. Regis, jums kils ūpas šį bei tą nusipirkti, atsinaujinti. O galbūt rūpinsitės dovana kažkam, kas jums išties rūpi.");
            new horoskopas(8,24,9,23, EHoroskop.Mergelė,"Tai gali būti naujų galimybių diena, kai po ilgų pastangų ims ryškėti perspektyvos. Viskas taip trapu, kad lengva sugadinti. Saugokitės klastų, vagysčių, apsinuodijimo.");
            new horoskopas(9,24,10,23,EHoroskop.Svarstyklės, "Gana neutrali diena – kaip pasiklosite, taip išsimiegosite. Nelabai tiktų imtis intensyvios veiklos. Pasisaugokite, kad dėl alkoholio ar netinkamų produktų, vaistų vartojimo nekiltų problemų.");
            new horoskopas(10,24,11,22,EHoroskop.Skorpionas,"Šiandien teigiamai veiksite aplinkinius ir jie – jus. Žadinsite draugiškumo bei solidarumo jausmus. Verta pamėginti atnaujinti jums svarbius santykius, jeigu jie neseniai patyrė krizę.");
            new horoskopas(11,23,12,22,EHoroskop.Šaulys,"Jeigu būtina, šiandien tvarkykite dokumentus, kreipkitės į valdžią dėl leidimų, oficialių raštų, patvirtinimų, atsiskaitymų. Bus nelengva, tačiau naudokitės tomis progomis, kurios įmanomos.");
            new horoskopas(12,23,1,20,EHoroskop.Ožiaragis,"Šiandien ypač aktualūs gali būti su išsilavinimu, studijomis, įstatymais, kelionėmis susiję reikalai. Galbūt nustebins kolega ar pažįstamas iš užsienio.");
            new horoskopas(1,21,2,19,EHoroskop.Vandenis,"Šiandien ne viskas džiugins. Galbūt kažkas primins negrąžintą skolą, paprašys paslaugos, kurią gana keblu suteikti. Galite įsigyti brokuotą daiktą, dėl jo aiškintis ir pan." );
            new horoskopas(2,20, 3,20, EHoroskop.Žuvys,"Jūsų nuotaikos ir emocijos bus labai nepastovios. Neleiskite, kad sąmonę užvaldytų nepagrįsti įtarimai, pavydas. Tai prasti palydovai, norint išsaugoti santykius." );
        }};


        MyFrame frame = new MyFrame();
        frame.setLayout(new GridLayout(3,1));
        JTextField metai = new JTextField(10);
        JTextField menuo = new JTextField(10);
        JTextField diena = new JTextField(10);

        JPanel panel = new JPanel();
        panel.add(metai);
        panel.add(menuo);
        panel.add(diena);
        JLabel pranesimas = new JLabel();
        panel.add(pranesimas);


        JPanel centr = new JPanel();
        JLabel zodiakas = new JLabel();
        JLabel dabarmetu = new JLabel();
        JLabel ikigimtadienio = new JLabel();
        JLabel savaitesdiena = new JLabel();
        JLabel tekstas = new JLabel();
        zodiakas.setText("<Zodiako zenklas>");
        dabarmetu.setText("<Dabartinis amzius>");
        ikigimtadienio.setText("IKi gimtadienio liko <dienu skaicius>");
        savaitesdiena.setText("Kai gimete buvo <savaites diena>");
        tekstas.setText("<horoskopas");
        centr.setLayout(new GridLayout(5,1));
        centr.add(zodiakas);
        centr.add(dabarmetu);
        centr.add(ikigimtadienio);
        centr.add(savaitesdiena);
        centr.add(tekstas);


        JButton find = new JButton("Find");
        find.setBackground(Color.BLUE);
        JButton clear = new JButton("Clear");
        JPanel panelButton = new JPanel();
        panelButton.add(find);
        panelButton.add(clear);
        frame.getContentPane().add(panel);
        frame.getContentPane().add(centr);
        frame.getContentPane().add(panelButton);
        find.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zodiakas.setText(Findhoroskop(Integer.parseInt(metai.getText()),Integer.parseInt(menuo.getText(),Integer.parseInt(diena.getText()))).toString());
                dabarmetu.setText("Siuo metu Jums " + Kiekmetu(Integer.parseInt(metai.getText()),Integer.parseInt(menuo.getText()),Integer.parseInt(diena.getText())));
                ikigimtadienio.setText("Iki gimtadienio Jums liko " + IkiGimtadienio(Integer.parseInt(metai.getText()),Integer.parseInt(menuo.getText()),Integer.parseInt(diena.getText())));
                savaitesdiena.setText("Kai gimėte buvo " + Savaitesdiena(Integer.parseInt(metai.getText()),Integer.parseInt(menuo.getText()),Integer.parseInt(diena.getText())));

            }
        });



    }
}



