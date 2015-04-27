package Kap6_HashMap;
/**
 *
 * @Skrevet av Christian
 */
public class Vare {
    private final int varenr;
    private final String varenavn;
    private int beholdning;
    
    // Construckta
    public Vare(int varenr, String varenavn) {
        this.varenr = varenr;
        this.varenavn = varenavn;
        this.beholdning = 0;
    }
    
    // toString
    @Override
    public String toString() {
        return "Varenavn: " + varenavn + ", " + " varenr: " + varenr + ", har følgende beholdning: " + beholdning;  
    }
    
    // Getter
    public int getVarenr() {
        return varenr;
    }

    public String getVarenavn() {
        return varenavn;
    }

    public int getBeholdning() {
        return beholdning;
    }
    
    // Change Item-acount
    public void endreBeholdning(int tillegg) {
        beholdning += tillegg;
    }
}
