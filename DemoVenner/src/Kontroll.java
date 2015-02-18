
import java.util.LinkedList;

/**
 *
 * @author Christian
 */
public class Kontroll {
   
    final static Kontroll kontroll = new Kontroll();
    LinkedList<Venn> venner = new LinkedList<>();
    Venn venn;
    
    public Kontroll() {
    }
    
    public void addVenn(Venn venn) {
        this.venn = venn;
        venner.add(venn);
    }
 
    public Venn finnVenner(String navn) {
        int i = 0;
        boolean funnet = false;
        while (i<venner.size() || (!funnet)) {
            Venn enVenn = venner.get(i);
            
            if (navn.equals(enVenn.getNavn())) {
                funnet = true;
                return enVenn;
            }
            i++;
        }
        return null;
    }

    public LinkedList<Venn> getVenner() {
        return venner;
    }
   
    public void delVenn(String navn) {
        venner.remove(finnVenner(navn));
    }
    
    public void nyttNr(String navn, long tlf) {
        Venn enVenn = finnVenner(navn);
        enVenn.setTlf(tlf);
    }
    
    public String hentAlle() {
        String ut = "";
        for(int i=0;i<venner.size();i++) {
            Venn enVenn = venner.get(i);
            ut+=enVenn.toString();
            ut+="\n";
        }
        return ut;
    }
    
}
    
   