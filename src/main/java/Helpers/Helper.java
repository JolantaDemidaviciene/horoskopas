package Helpers;
import Enum.EHoroskop;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Helper {

    public static EHoroskop Findhoroskop(int menuo, int diena) {
        EHoroskop s = null;
        if (menuo == 1) {
            if (diena < 20) {
                s = EHoroskop.Ožiaragis;
            } else s = EHoroskop.Vandenis;
        }
        if (menuo == 2) {
            if (diena < 19) {
                s = EHoroskop.Vandenis;
            } else s =  EHoroskop.Žuvys;
        }
        if (menuo == 3) {
            if (diena < 21) {
                s = EHoroskop.Žuvys;
            } else s = EHoroskop.Avinas;
        }
        if (menuo == 4) {
            if (diena < 20) {
                s = EHoroskop.Avinas;
            } else s =EHoroskop.Jautis;
        }
        if (menuo == 5) {
            if (diena < 21) {
                s =EHoroskop.Jautis;
            } else s = EHoroskop.Dvyniai;
        }
        if (menuo == 6) {
            if (diena < 21) {
                s = EHoroskop.Dvyniai;
            } else s = EHoroskop.Vėžys;
        }
        if (menuo == 7) {
            if (diena < 23) {
                s = EHoroskop.Vėžys;
            } else s = EHoroskop.Liūtas;
        }
        if (menuo == 8) {
            if (diena < 23) {
               s = EHoroskop.Liūtas;
            } else s =EHoroskop.Mergelė;
        }
        if (menuo == 9) {
            if (diena < 23) {
                s = EHoroskop.Mergelė;
            } else s =EHoroskop.Svarstyklės;
        }
        if (menuo == 10) {
            if (diena < 23) {
                s = EHoroskop.Svarstyklės;
            } else s =EHoroskop.Skorpionas;
        }
        if (menuo == 11) {
            if (diena < 22) {
                s = EHoroskop.Skorpionas;
            } else s = EHoroskop.Šaulys;
        }
        if (menuo == 12) {
            if (diena < 22) {
                s = EHoroskop.Šaulys;
            } else s = EHoroskop.Ožiaragis;
        }
        return s;
    }

    public static long IkiGimtadienio(int metai, int menuo, int diena){

        LocalDate gimtadienis = LocalDate.of(metai, menuo, diena);

        LocalDate sekantisgimtadienis = gimtadienis.withYear(LocalDate.now().getYear());

        if (sekantisgimtadienis.isBefore(LocalDate.now()) || sekantisgimtadienis.isEqual(LocalDate.now())) {
            sekantisgimtadienis = sekantisgimtadienis.plusYears(1);
        }

        Period p = Period.between(LocalDate.now(),sekantisgimtadienis);
        long p2 = ChronoUnit.DAYS.between(LocalDate.now(), sekantisgimtadienis);

        return p2;
    }

    public static String Savaitesdiena(int metai, int menuo, int diena){
       return DayOfWeek.from(LocalDate.of(metai,menuo,diena)).name();
    }

    public static int Kiekmetu(int metai, int menuo, int diena){
        return Math.abs(Period.between(LocalDate.now(),LocalDate.of(metai,menuo,diena)).getYears());
    }

}