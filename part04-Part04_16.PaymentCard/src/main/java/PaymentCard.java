public class PaymentCard {
    private double balance;
    
    public PaymentCard(double openingBalance){
        this.balance=openingBalance;
    }
    public void eatAffordably(){
        if(this.balance> 1){
            this.balance=this.balance-2.60;
        }
        
    }
    public void eatHeartily(){
        
        if(this.balance> 1){
            this.balance=this.balance-4.60;
        }
        
    }
    public void addMoney(double balanv){ 
        if(balanv>1){
            if(balanv<150){
              this.balance+=balanv;
            }else if(balanv>=150){
                this.balance=150;
            }
        }
            
        
    }
    public String toString(){
        return "The card has a balance of "+balance+" euros";
    }
    
       
}
