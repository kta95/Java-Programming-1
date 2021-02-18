
import java.util.ArrayList;

public class Suitcase {
    
    private ArrayList<Item> itemsS;
    private int maxWeight;

    public int getMaxWeight() {
        return maxWeight;
    }   
    public Suitcase( int maxWeight) {
        this.itemsS=new ArrayList<>();
        this.maxWeight = maxWeight;
        
    }
  
    private int totalWeight=0;
    public void addItem(Item item){
//      if(itemsS.isEmpty()){
//          count++;
//          itemsS.add(item);
//      }
      if(totalWeight<this.maxWeight){
          totalWeight+=item.getWeight();
          if(totalWeight<=this.maxWeight){           
            itemsS.add(item);
          }else{
              totalWeight-=item.getWeight();
          }
      }
    }
    
    public String toString(){
        if(itemsS.isEmpty()){
            return "no items ("+totalWeight+" kg)";
        }
        if(itemsS.size()>1){
            return itemsS.size()+" items ("+totalWeight+" kg)";
        }else{
            return itemsS.size()+" item ("+totalWeight+" kg)";
        }
    }
    
    public void printItems(){
        for(Item temp: itemsS){
            System.out.println(temp);
        }
    }
    public int totalWeight(){
        return totalWeight;
    }
    public Item heaviestItem(){
        
        if(itemsS.isEmpty()){
            return null;
        }
        int heavy=0;
        Item newlol=null;
        for(Item temp: itemsS){
            if(temp.getWeight()>heavy){
                 newlol=temp;
                 heavy=temp.getWeight();
            }
        }
        return newlol;
    }
}
