public class Fitbyte {
    private int Age;
    private int restingHeartRate;
    
    public Fitbyte(int age, int restingHeartRate){
        this.Age=age;
        this.restingHeartRate=restingHeartRate;
    }
    
    public double maxHeartRate(){
        double max=0;
        max=206.3 -(0.711 * this.Age);
        return max;
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        return (maxHeartRate()-this.restingHeartRate)*(percentageOfMaximum)+this.restingHeartRate;
    }
}
