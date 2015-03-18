package kap4.stakk;

import java.util.Vector;

/**
 * 18.03.15 - Oppgaven til kap4 i kompendiumet
 * @Skrevet av Christian
 */
public class Kontroll {
    // kontroll-objekt
    public static Kontroll kontroll = new Kontroll();
    
    // oppretter en ny stack fylt av objekter av typen Tallerken
    private Stakk<Tallerken>tallerkenstakk = new Stakk<>();
    
    private Kontroll() {
    }
    
    public void pushTallerken(Tallerken tallerken) {
        tallerkenstakk.push(tallerken);
    }
    
    public Tallerken popTallerken() {
        return tallerkenstakk.pop();
    }
    
    public Tallerken peepTallerken() {
        return tallerkenstakk.peep();
    }
    
    public Vector<Tallerken> hentAlle() {
        return tallerkenstakk.alle();
    }
}
