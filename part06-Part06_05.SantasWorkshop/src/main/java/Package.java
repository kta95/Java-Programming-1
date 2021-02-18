import java.util.ArrayList;

public class Package {
    
    private ArrayList<Gift> giftList;   
    public Package(){
        this.giftList=new ArrayList<>();
    }
    public void addGift(Gift gift){
        this.giftList.add(gift);
    }
    public int totalWeight(){
        int sum=0;
        for(Gift temp:giftList){
            sum+=temp.getWeight();
        }
        return sum;
    }
}
