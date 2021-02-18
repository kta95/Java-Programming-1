public class Cube {
    private int edgeLength;
    
    public Cube(int edgelength){
        this.edgeLength=edgelength;
    }
    
    public int volume(){
        return this.edgeLength*this.edgeLength*this.edgeLength;
    }
    
    public String toString(){
        return "The length of the edge is "+this.edgeLength+" and the volume "+volume();
    }
}
