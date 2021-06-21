package Model;
import Enum.EHoroskop;

import javax.xml.crypto.Data;

public class horoskopas {
    private int prmenuo;
    private int prdiena;
    private int pbmenuo;
    private int pbdiena;
    private EHoroskop pavadinimas;
    private String prognoze;

    public horoskopas( int prmenuo,int prdiena, int pbmenuo,int pbdiena, EHoroskop pavadinimas, String prognoze){
        this.prmenuo = prmenuo;
        this.prdiena = prdiena;
        this.pbmenuo = pbmenuo;
        this.pbdiena = pbdiena;
        this.pavadinimas = pavadinimas;
        this.prognoze = prognoze;
    }

    public int getPrmenuo() {
        return prmenuo;
    }

    public void setPrmenuo(int prmenuo) {
        this.prmenuo = prmenuo;
    }

    public int getPrdiena() {
        return prdiena;
    }

    public void setPrdiena(int prdiena) {
        this.prdiena = prdiena;
    }

    public int getPbmenuo() {
        return pbmenuo;
    }

    public void setPbmenuo(int pbmenuo) {
        this.pbmenuo = pbmenuo;
    }

    public int getPbdiena() {
        return pbdiena;
    }

    public void setPbdiena(int pbdiena) {
        this.pbdiena = pbdiena;
    }

    public EHoroskop getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(EHoroskop pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public String getPrognoze() {
        return prognoze;
    }

    public void setPrognoze(String prognoze) {
        this.prognoze = prognoze;
    }
}
