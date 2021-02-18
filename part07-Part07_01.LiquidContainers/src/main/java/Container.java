public class Container {
    
    private int amounts;
    public Container(){  
        this.amounts=0;
    }
    public int contains(){
        return this.amounts;
    }
 
    public void add(int amount){
        if(amount>0){
            int size=this.amounts+amount;
            if(size>0 && size<=100){
                this.amounts+=amount;
            }else{
                this.amounts=100;
            }
        }
    }
    public void remove(int amount){
        int size=this.amounts-amount;
        if(size<1){
            this.amounts=0;
        }else if(amount>0){
            this.amounts-=amount;
        }
    }
    public String toString(){
        return this.contains()+"/100";
    }
    
}
