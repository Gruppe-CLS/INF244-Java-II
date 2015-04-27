package kap4.stakk;

import java.util.Vector;

/**
 * 18.03.15 - Oppgaven til kap4 i kompendiumet
 * @Skrevet av Christian
 */

// En generisk stakk... god forklaring i kompendiumet, not.
public class Stakk <Type>{
    
    // En indre klasse (node)
    private class Node<Type> {
        private Node<Type> neste = null;
        private final Type tallerken;
        
        // Contstrukta
        private Node(Type tellerken, Node<Type> neste) {
            this.tallerken = tellerken;
            this.neste = neste;
        }
    } // Node-klasse ferdig
    
    private Node<Type> første = null;
   
    // Helt seriøst.. DETTE er en kontruktør.. say what now. Forstår ikke indre klasser...
    public Stakk(){}
    
    //Her legger vi til nytt objekt i Stack'en
    public void push(Type tallerken) {
        Node<Type> nyNode = new Node(tallerken, første);
        første = nyNode;
    }
    
    // Viser øverste element i stack, uten å fjerne den - Helt ukjent syntaks... say what
    public Type peep() {
        // Ren copy/paste, hva er ? her??
        return (første==null?null:første.tallerken);
    }
    
    // Henter og fjerner første element i Stack'en
    public Type pop() {
        if(første==null) {
            return null; // Stack'en er tom
        }
        Type SlettDenne = første.tallerken;
        første = første.neste;
        return SlettDenne;
    }
    
    // Vector, ALDRI hørt om i timen... UNDERVIS I DET VI SKAL HA DA IDIOTLÆRERE..!
    Vector<Type>alle() {
        Vector<Type> tmp = new Vector<>();
        Node cursor = første;
        while(cursor!=null) {
            tmp.add((Type)cursor.tallerken); // og dette må konverteres?? makan
            cursor=cursor.neste;
        }
        return tmp;
    }
}
