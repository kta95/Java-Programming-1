
public class Statistics {
    private int count;
    private int sum;
    public Statistics() {
        this.count=0;
        this.sum=0;
    }

    public void addNumber(int number) {
        sum+=number;
        count++;
    }

    public int getCount() {
        return count;
    }
    public int sum() {
        return sum;
    }

    public double average() {
        return  1.0*this.sum/this.count;
    }
    
    
}
