public class Bird {
 
    private String name;
    private String latinName;
    private int numberObserved;

    public Bird() {
    }

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.numberObserved = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getNumberObserved() {
        return numberObserved;
    }
    
    public void observed(){
        this.numberObserved++;
    }

    @Override
    public String toString() {
        return this.name+" ("+this.latinName+"): "+ this.getNumberObserved()+" observations"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
