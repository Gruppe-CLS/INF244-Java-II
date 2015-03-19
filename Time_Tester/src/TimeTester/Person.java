package TimeTester;


/**
 *
 * @Skrevet av Christian
 */
public class Person {
    String navn;
    
    public Person(String navn) {
        this.navn = navn;
    }
    
    @Override
    public String toString() {
        return "Navnet er: " + navn;
    }

}
