package TimeTester;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @Skrevet av Christian
 */
public class Kontroll {
    public static Kontroll kontroll = new Kontroll();
    
    private Kontroll() {
        
    }
    private ArrayList<Person> PersonArrayList = new ArrayList<Person>();
    private Stack PersonStack = new Stack();
    private Person[] PersonArray = new Person[100000]; // Hvordan legge til i Array: PersonArray[i]=navn;
    private LinkedList<Person> PersonLinkedList = new LinkedList<Person>();
    
    public void lagArrayList(String navn) {
        PersonArrayList.add(new Person(navn));
    }
    
    // Lager Stack - returnerer ingenting
    public void lagStack(String navn) {
        PersonStack.push(navn);
    }
    
    public void lagArray(String navn, int i) {
        PersonArray[i]= new Person(navn);
    }
    
    public void lagLinkedList(String navn) {
        PersonLinkedList.add(new Person(navn));
    }
}
