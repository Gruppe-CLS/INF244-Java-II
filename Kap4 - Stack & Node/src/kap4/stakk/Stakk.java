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
        private Type objekt;
        
        // Contstrukta
        private Node(Type objekt, Node<Type> neste) {
            this.objekt = objekt;
            this.neste = neste;
        }
    } // Node-klasse ferdig
    
    private Node<Type> første = null;
   
    // Helt seriøst.. DETTE er en kontruktør.. say what now. Forstår ikke indre klasser...
    public Stakk(){}
    
    //Her legger vi til nytt objekt i Stack'en
    public void push(Type objekt) {
        Node<Type> nyNode = new Node(objekt, første);
        første = nyNode;
    }
    
    // Viser øverste element i stack, uten å fjerne den - Helt ukjent syntaks... say what
    public Type peep() {
        // Ren copy/paste, hva er ? her??
        return (første==null?null:første.objekt);
    }
    
    // Henter og fjerner første element i Stack'en
    public Type pop() {
        if(første==null) {
            return null; // Stack'en er tom
        }
        Type SlettDenne = første.objekt;
        første = første.neste;
        return SlettDenne;
    }
    
    // Vector, ALDRI hørt om i timen... FORELES I DET VI SKAL HA DA IDIOTLÆRERE..!
    Vector<Type>alle() {
        Vector<Type> tmp = new Vector<>();
        Node cursor = første;
        while(cursor!=null) {
            tmp.add((Type)cursor.objekt); // og dette må konverteres?? makan
            cursor=cursor.neste;
        }
        return tmp;
    }
}
