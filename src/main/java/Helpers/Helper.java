package Helpers;
import Enum.EHoroskop;
import Model.horoskopas;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;
import java.lang.invoke.SwitchPoint;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Helper {

    public static String Findhoroskop(int menuo, int diena) {
        switch (menuo) {
            case 1: return (diena < 20)? EHoroskop.Ožiaragis.toString() : EHoroskop.Vandenis.toString();
            case 2: return (diena < 19)? EHoroskop.Vandenis.toString() : EHoroskop.Žuvys.toString();
            case 3: return (diena < 21)? EHoroskop.Žuvys.toString() : EHoroskop.Avinas.toString();
            case 4: return (diena < 20)? EHoroskop.Avinas.toString() : EHoroskop.Jautis.toString();
            case 5: return (diena < 21)? EHoroskop.Jautis.toString() : EHoroskop.Dvyniai.toString();
            case 6: return (diena < 21)? EHoroskop.Dvyniai.toString() : EHoroskop.Vėžys.toString();
            case 7: return (diena < 23)? EHoroskop.Vėžys.toString() : EHoroskop.Liūtas.toString();
            case 8: return (diena < 23)? EHoroskop.Liūtas.toString() : EHoroskop.Mergelė.toString();
            case 9: return (diena < 23)? EHoroskop.Mergelė.toString() : EHoroskop.Svarstyklės.toString();
            case 10: return (diena < 23)? EHoroskop.Svarstyklės.toString() : EHoroskop.Skorpionas.toString();
            case 11: return (diena < 22)? EHoroskop.Skorpionas.toString() : EHoroskop.Šaulys.toString();
            case 12: return (diena < 22)? EHoroskop.Šaulys.toString() : EHoroskop.Ožiaragis.toString();
        }

        return null;

    }

    public static long IkiGimtadienio(int metai, int menuo, int diena) {

        LocalDate gimtadienis = LocalDate.of(metai, menuo, diena);

        LocalDate sekantisgimtadienis = gimtadienis.withYear(LocalDate.now().getYear());

        if (sekantisgimtadienis.isBefore(LocalDate.now()) || sekantisgimtadienis.isEqual(LocalDate.now())) {
            sekantisgimtadienis = sekantisgimtadienis.plusYears(1);
        }

        Period p = Period.between(LocalDate.now(), sekantisgimtadienis);
        long p2 = ChronoUnit.DAYS.between(LocalDate.now(), sekantisgimtadienis);

        return p2;
    }

    public static String Savaitesdiena(int metai, int menuo, int diena) {
        return DayOfWeek.from(LocalDate.of(metai, menuo, diena)).name();
    }

    public static int Kiekmetu(int metai, int menuo, int diena) {
        return Math.abs(Period.between(LocalDate.now(), LocalDate.of(metai, menuo, diena)).getYears());
    }

    public static String Prognoze(ArrayList<horoskopas> x, String a) {
        String prognoze = null;
        for (horoskopas m : x) {
            if ( m.getPavadinimas().toString().equals(a)==true) {
                prognoze = m.getPrognoze();
            }
        }
        return prognoze;
    }

    public static Boolean MetuTikrinimas(int metai, JLabel pranesimas, JTextField metailaukas){
        int metaidabar = LocalDate.now().getYear();
        if(metai <= LocalDate.now().getYear() != true){
            pranesimas.setText("Blogai įvesti duomenys");
            pranesimas.setForeground(Color.RED);
            metailaukas.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.red));
            return false;
         }
        return true;
    }


}
