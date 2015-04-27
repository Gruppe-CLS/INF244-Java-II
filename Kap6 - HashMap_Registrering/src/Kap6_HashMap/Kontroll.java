package Kap6_HashMap;
import java.util.HashMap;
/**
 *
 * @Skrevet av Christian
 */
public class Kontroll {
    public static final Kontroll kontroll = new Kontroll();
    private HashMap<Integer, Vare> varer = new HashMap<>(100, 0.075f);
    
    private Kontroll() {
    }
    
    // Registrer ny vare og legg i HashMap-listen
    public void regNy(int varenr, Vare nyVare) {
        varer.put(varenr, nyVare);
    }
    
    // Sletter en vare med "remove"
    public void slett(int varenr) {
        varer.remove(varenr);
    }
    
    // Endrer beholdning
    public void endre(int varenr, int nyEndring) {
        Vare endreDenne = varer.get(varenr);
        endreDenne.endreBeholdning(nyEndring);
    }
    
    // Henter ut vare med "get"
    public Vare getVare(int varenr) {
        return varer.get(varenr);
    }
    
    public HashMap<Integer, Vare> hentListe() {
        return varer;
    }
}
    