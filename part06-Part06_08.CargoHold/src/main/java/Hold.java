
import java.util.ArrayList;

public class Hold {
        
    private ArrayList<Suitcase> Scase;
    private int maxWeight;
    private int totalWeight;
    public Hold( int maxWeight) {
        this.Scase = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
        
    public void addSuitcase(Suitcase suitcase){
        //if(totalWeight<this.maxWeight){
          totalWeight+=suitcase.totalWeight();
          if(totalWeight<=this.maxWeight){           
            Scase.add(suitcase);
          }else{
              totalWeight-=suitcase.totalWeight();
          }
      //}
    }
    
    public String toString(){
        return Scase.size()+" suitcases ("+totalWeight+" kg)";
    }
            
    public void printItems(){
        for(Suitcase Stem: Scase){
            Stem.printItems();
        }
    }
    
}
