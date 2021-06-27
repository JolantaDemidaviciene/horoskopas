package Model;
import Enum.EHoroskop;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class horoskopas {

    private EHoroskop pavadinimas;
    private String prognoze;

    public horoskopas( EHoroskop pavadinimas, String prognoze){
        this.pavadinimas = pavadinimas;
        this.prognoze = prognoze;
    }
///#region get ir set
    public EHoroskop getPavadinimas() {
        return pavadinimas;
    }

    public String getPrognoze() {
        return this.prognoze;
    }

//#endregion

    public static ArrayList<horoskopas> Duomenys(){
        return   new ArrayList<horoskopas>() {{
            add(new horoskopas( EHoroskop.Jautis, "Tikriausiai šiandien patirsite ypatingų emocinių impulsų. Galite leistis į lengvabūdišką avantiūrą, ką nors vilioti, flirtuoti. Turėtų pagerėti santykiai su vaikais."));
            add(new horoskopas( EHoroskop.Dvyniai, "Trokšite geresnių sąlygų, komforto, patogumų. Galbūt kažką pertvarkinėsite. Tai gali kainuoti daugiau, nei apskaičiavote iš anksto. Pasisaugokite sukčių."));
            add(new horoskopas( EHoroskop.Vėžys, "Savo energiją nukreipkite į darbą, mokslą ar kūrybą, o ne į tuščius ginčus, ambicijų demonstravimą. Nuo to priklausys, kaip pakryps pokalbis, turėsiantis įtakos jūsų autoritetui."));
            add(new horoskopas( EHoroskop.Liūtas, "Aiškės finansinės perspektyvos, galėsite numatyti, kaip racionaliau panaudoti turimas lėšas. Regis, jums kils ūpas šį bei tą nusipirkti, atsinaujinti. O galbūt rūpinsitės dovana kažkam, kas jums išties rūpi."));
            add(new horoskopas( EHoroskop.Mergelė, "Tai gali būti naujų galimybių diena, kai po ilgų pastangų ims ryškėti perspektyvos. Viskas taip trapu, kad lengva sugadinti. Saugokitės klastų, vagysčių, apsinuodijimo."));
            add(new horoskopas( EHoroskop.Svarstyklės, "Gana neutrali diena – kaip pasiklosite, taip išsimiegosite. Nelabai tiktų imtis intensyvios veiklos. Pasisaugokite, kad dėl alkoholio ar netinkamų produktų, vaistų vartojimo nekiltų problemų."));
            add(new horoskopas( EHoroskop.Skorpionas, "Šiandien teigiamai veiksite aplinkinius ir jie – jus. Žadinsite draugiškumo bei solidarumo jausmus. Verta pamėginti atnaujinti jums svarbius santykius, jeigu jie neseniai patyrė krizę."));
            add(new horoskopas( EHoroskop.Šaulys, "Jeigu būtina, šiandien tvarkykite dokumentus, kreipkitės į valdžią dėl leidimų, oficialių raštų, patvirtinimų, atsiskaitymų. Bus nelengva, tačiau naudokitės tomis progomis, kurios įmanomos."));
            add(new horoskopas(EHoroskop.Ožiaragis, "Šiandien ypač aktualūs gali būti su išsilavinimu, studijomis, įstatymais, kelionėmis susiję reikalai. Galbūt nustebins kolega ar pažįstamas iš užsienio."));
            add(new horoskopas( EHoroskop.Vandenis, "Šiandien ne viskas džiugins. Galbūt kažkas primins negrąžintą skolą, paprašys paslaugos, kurią gana keblu suteikti. Galite įsigyti brokuotą daiktą, dėl jo aiškintis ir pan."));
            add(new horoskopas( EHoroskop.Žuvys, "Jūsų nuotaikos ir emocijos bus labai nepastovios. Neleiskite, kad sąmonę užvaldytų nepagrįsti įtarimai, pavydas. Tai prasti palydovai, norint išsaugoti santykius."));
        }};


    }

}
