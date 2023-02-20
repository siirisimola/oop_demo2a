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
     * Metodi luo uuden muistiinpanon
     * @param nimi on merkkijono
     * @param omistaja on niinikään merkkijono
     */

    public Muistivihko(String nimi, String omistaja) {
        this.nimi = nimi;
        this.omistaja = omistaja;
        muistiinpanot = new ArrayList<>();
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getOmistaja() {
        return omistaja;
    }

    public void setOmistaja(String omistaja) {
        this.omistaja = omistaja;
    }

    public void lisaaMuistiinpano(String viesti) {
        this.muistiinpanot.add(viesti);
    }

    public int muistiinpanoja() {
        return muistiinpanot.size();
    }

    public void tulostaMuistiinpanot() {
        for(String viesti : muistiinpanot) {
            System.out.println(viesti);
        }
    }
}
