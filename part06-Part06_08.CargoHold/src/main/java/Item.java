public class Item {
    
    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    
    public Item() {
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return this.name+" ("+this.weight+" kg)"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
