
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian
 */
public class Venn implements Comparable<Venn> {
    
    @Override
    public int compareTo(Venn venn) {
        return this.getNavn().compareTo(venn.getNavn());
    }
    
    private String navn;
    private long tlf;

    public Venn(String navn, long tlf) {
        this.navn = navn;
        this.tlf = tlf;
    }

    public String getNavn() {
        return navn;
    }

    public long getTlf() {
        return tlf;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.navn);
        hash = 61 * hash + (int) (this.tlf ^ (this.tlf >>> 32));
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
        final Venn other = (Venn) obj;
        
        if (!Objects.equals(this.navn, other.navn)) {
            return false;
        }
        if (this.tlf != other.tlf) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "navn: " + navn + ", tlf: " + tlf;
    }

    private void setNavn(String navn) {
        this.navn = navn;
    }

    public void setTlf(long tlf) {
        this.tlf = tlf;
    }
    
}
