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
    
    public void regNy(int varenr, Vare nyVare) {
        varer.put(varenr, nyVare);
    }
    
    public void slett(int varenr) {
        
    }
    
    public void endre() {
        
    }
}
