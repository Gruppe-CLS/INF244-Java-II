package kap4.stakk;
/**
 * 18.03.15 - Oppgaven til kap4 i kompendiumet
 * @Skrevet av Christian
 */

// Tallerken som skal legges i Stack'en
public class Tallerken {
    private String dekor;
    
    // Construkta
    public Tallerken(String dekor) {
        // kan bruke setDekor() her istedenfor
        this.dekor = dekor;
    }
    
    private void setDekor(String dekor) {
        this.dekor = dekor;
    }
    
    public String getDekor() {
        return dekor;
    }
    
    @Override
    public String toString() {
        return dekor;
    }
}
