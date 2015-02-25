
package Kap5;

import java.util.Objects;

/**
 *
 * @Skrevet av Christian
 */
public class Bryter {
    
    int nr;
    String navn;
    double vekt;
    boolean mann;

    public Bryter(int nr, String navn, double vekt, boolean mann) {
        this.nr = nr;
        this.navn = navn;
        this.vekt = vekt;
        this.mann = mann;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.nr;
        hash = 89 * hash + Objects.hashCode(this.navn);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.vekt) ^ (Double.doubleToLongBits(this.vekt) >>> 32));
        hash = 89 * hash + (this.mann ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bryter other = (Bryter) obj;
        if (this.nr != other.nr) {
            return false;
        }
        if (!Objects.equals(this.navn, other.navn)) {
            return false;
        }
        if (Double.doubleToLongBits(this.vekt) != Double.doubleToLongBits(other.vekt)) {
            return false;
        }
        if (this.mann != other.mann) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Bryter{" + "nr=" + nr + ", navn=" + navn + ", vekt=" + vekt + ", mann=" + mann + '}';
    }
    
    

}
