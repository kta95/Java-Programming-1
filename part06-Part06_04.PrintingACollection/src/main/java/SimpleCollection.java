
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;
    private int count;
    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
        count++;
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    public String toString(){
        if(count==0){
            return "The collection "+this.name+" is empty.";
        }
        String printout= "The collection "+this.name+" has "+count+" element:";
        String element="";
        for(String temp:elements){
            element+="\n"+temp;
        }  
        if(count>1){
            return "The collection "+this.name+" has "+count+" elements:"+element;
        }
            return printout+element;
        }
    
}
