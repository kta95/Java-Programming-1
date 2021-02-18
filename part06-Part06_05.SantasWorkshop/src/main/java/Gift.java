public class Gift {
    
    private String name;
    private int weight;
    
    public Gift(String nameValue,int weightValue){
        this.name=nameValue;
        this.weight=weightValue;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return this.name+" ("+this.weight+")"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
