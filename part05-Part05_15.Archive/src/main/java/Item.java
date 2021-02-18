public class Item {
    
    private String identifier;
    private String name;

    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public boolean equals(Object compared){
        if(this==compared){
            return true;
        }
        if(!(compared instanceof Item)){
            return false;
        }
        
        Item newid=(Item)compared;
        
        return this.identifier.equals(newid.identifier);
        
        
    }
    @Override
    public String toString() {
        return this.identifier+": "+this.name; //To change body of generated methods, choose Tools | Templates.
    }
    
}
