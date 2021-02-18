public class Course {
    
    private int points;
    private int count;

    public Course(){
    }
    
    public int contain(){
        return this.points;
    }
    public int count(){
        return this.count;
    }
    public void add(int p){
        if(p>=0 && p<=100){
            this.points+=p;
            count++;
        }
    }


}
