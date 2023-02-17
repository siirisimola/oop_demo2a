import java.util.ArrayList;

/**
 * Luokka mallintaa ostosten apuna käytettävää
 * ostoslistaa, johon käyttäjä voi lisätä ja poistaa
 * siltä tuotteita. Tuotteen voi myös merkitä ostetuksi.
 *
 * @author Erkki
 */
public class Ostoslista {
    private ArrayList<Tuote> tuotteet;
    private String nimi;

    /**
     * Luo uuden ostoslistan
     *
     * @param nimi ostoslistan käyttäjälle näkyvä nimi
     */
    public Ostoslista(String nimi) {
        this.nimi = nimi;
        tuotteet = new ArrayList<>();
    }

    /**
     * Lisää uuden tuotteen ostoslistalle.
     *
     * @param tuote lisättävä tuote
     */
    public void lisaaTuote(Tuote tuote) {
        this.tuotteet.add(tuote);
    }

    /**
     * Poistaa tuotteen ostoslistalta.
     *
     * @param tuote tuote, joka poistetaan
     */
    public void poistaTuote(Tuote tuote) {
        this.tuotteet.remove(tuote);
    }

    /**
     * Poistaa tuotelistalta annetun nimisen tuotteen, jos sellainen
     * löytyy. Jos listalla on useita samannimisiä tuotteita, poistaa
     * näistä ensimmäisen.
     *
     * @param tuotteenNimi poistettavan tuotteen nimi
     * @return <code>true</code>, jos tuote löytyi ja poistettiin, muuten <code>false</code>
     */
    public boolean poistaTuote(String tuotteenNimi) {
        for (Tuote tuote : tuotteet) {
            if (tuote.getNimi().equals(tuotteenNimi)) {
                tuotteet.remove(tuote);
                return true;
            }
        }
        return false;
    }

    /**
     * Asettaa tuotelistalla annetun nimisen tuotteen ostetuksi, jos sellainen
     * löytyy. Jos listalla on useita samannimisiä tuotteita, asettaa
     * ensimmäisen ostetuksi.
     *
     * @param tuotteenNimi tuotteen nimi
     * @return <code>true</code>, jos tuote löytyi, muuten <code>false</code>
     */
    public boolean asetaOstetuksi(String tuotteenNimi) {
        for (Tuote tuote : tuotteet) {
            if (tuote.getNimi().equals(tuotteenNimi)) {
                tuote.setOstettu(true);
                return true;
            }
        }
        return false;
    }

    /**
     * Tulostaa koko ostoslistan.
     */
    public void tulostaLista() {
        System.out.println(nimi);
        for (int i=0; i<nimi.length(); i++) {
            System.out.print("-");
        }
        System.out.println();

        for (Tuote tuote : tuotteet) {
            System.out.print(tuote.getNimi() + " (" +
                    tuote.getKappalemaara() + ")");
            if (tuote.isOstettu()) {
                System.out.println(" - OSTETTU");
            } else {
                System.out.println();
            }
        }
    }
}

/**
 * Luokka mallintaa yhtä ostoslistassa olevaa tuotetta.
 * Tuote sisältää nimen lisäksi kappalemäärän ja tiedon
 * siitä, onko se jo ostettu.
 */
class Tuote {
    private String nimi;
    private int kappalemaara;
    private boolean ostettu;

    /**
     * Luo uuden tuotteen.
     *
     * @param nimi         tuotteen käyttäjälle näkyvä nimi
     * @param kappalemaara kuinka monta kappaletta tuotetta ostetaan
     * @param ostettu      tieto siitä, onko tuote jo ostettu
     */
    public Tuote(String nimi, int kappalemaara, boolean ostettu) {
        this.nimi = nimi;
        this.kappalemaara = kappalemaara;
        this.ostettu = ostettu;
    }

    /**
     * Luo uuden tuotteen. Tuotteen tilaksi tulee ei-ostettu.
     *
     * @param nimi         tuotteen käyttäjälle näkyvä nimi
     * @param kappalemaara kuinka monta kappaletta tuotetta ostetaan
     */
    public Tuote(String nimi, int kappalemaara) {
        this.nimi = nimi;
        this.kappalemaara = kappalemaara;
        this.ostettu = false;
    }

    /**
     * Palauttaa tuotteen nimen.
     *
     * @return tuotteen käyttäjälle näkyvän nimen
     */
    public String getNimi() {
        return nimi;
    }

    /**
     * Palauttaa tuotteen kappalemäärän
     *
     * @return tuotteen ostettavan kappalemäärän
     */
    public int getKappalemaara() {
        return kappalemaara;
    }


    /**
     * Palauttaa tiedon siitä, onko tuote jo ostettu
     *
     * @return tiedon siitä, onko tuote ostettu
     */
    public boolean isOstettu() {
        return ostettu;
    }

    /**
     * Asettaa tiedon siitä onko tuote jo ostettu.
     * Arvo <code>true</code> tarkoittaa, että tuote on ostettu.
     *
     * @param ostettu tieto siitä, onko tuote ostettu
     */
    public void setOstettu(boolean ostettu) {
        this.ostettu = ostettu;
    }
}
