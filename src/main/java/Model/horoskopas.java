package Model;

import javax.xml.crypto.Data;

public class horoskopas {
    private String datapr;
    private String datapb;
    private String pavadinimas;
    private String prognoze;

    public horoskopas(String datapr, String datapb, String pavadinimas, String prognoze){
        this.datapb = datapb;
        this.datapr = datapr;
        this.pavadinimas = pavadinimas;
        this.prognoze = prognoze;
    }
}
