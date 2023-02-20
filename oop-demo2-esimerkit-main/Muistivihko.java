import java.util.ArrayList;

/**
 * Luokka mallintaa muistivihon toimintaa. Käyttäjä voi lisätä muistiinpanoja ja saada selville niiden määrän.
 *
 * @author Siiri
 */

public class Muistivihko {
    private String nimi;
    private String omistaja;
    private ArrayList<String> muistiinpanot;

    /**
     * Metodi luo uuden muistivihon
     * @param nimi on muistivihon käyttäjälle näkyvä nimi (merkkijono), esim. päiväkirja, kauppalista tai kilometriloki
     * @param omistaja on muistivihon omistaja (merkkijono)
     */

    public Muistivihko(String nimi, String omistaja) {
        this.nimi = nimi;
        this.omistaja = omistaja;
        muistiinpanot = new ArrayList<>();
    }

    /**
    Palauttaa nimen
     @return nimi
     */
    public String getNimi() {
        return nimi;
    }

    /**
     * Asettaa nimen
     * @param nimi
     */
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    /**
     * Palauttaa omistajan
     * @return omistaja
     */
    public String getOmistaja() {
        return omistaja;
    }

    /**
     * Asettaa omistajan
     * @param omistaja tieto siitä kuka muistivihon omistaa
     */
    public void setOmistaja(String omistaja) {
        this.omistaja = omistaja;
    }

    /**
     * Lisää uuden muistiinpanon
     * @param viesti merkkijonomuotoinen uusi muistiinpano
     */
    public void lisaaMuistiinpano(String viesti) {
        this.muistiinpanot.add(viesti);
    }

    /**
     * Palauttaa muistiinpanojen määrän
     * @return muistiinpanojen määrän
     */
    public int muistiinpanoja() {
        return muistiinpanot.size();
    }

    /**
     * Tulostaa muistikirjassa olevat muistiinpanot
     */
    public void tulostaMuistiinpanot() {
        for(String viesti : muistiinpanot) {
            System.out.println(viesti);
        }
    }
}
