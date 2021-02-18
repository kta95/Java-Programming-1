public class Timer {
    private ClockHand hundredthsOfASecond;
    private ClockHand second;
    public Timer(){
        this.hundredthsOfASecond=new ClockHand(100);
        this.second=new ClockHand(60);
    }
    
    public void advance(){
        this.hundredthsOfASecond.advance();
        
        if(this.hundredthsOfASecond.value()==0){
            this.second.advance();
        }
    }
    
    public String toString(){
        return second+":"+hundredthsOfASecond;
    }
}
