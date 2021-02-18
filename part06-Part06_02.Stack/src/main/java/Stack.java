
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stack {
    private ArrayList<String> list;
    
    public Stack(){
        this.list=new ArrayList<>();
    }
    public boolean isEmpty(){
        if(list.isEmpty()){
            return true;
        }else 
            return false;
    }
    public void add(String value){
        
        //int index=list.size()-1;            
           
        list.add(0, value);
    }
    public ArrayList<String>values(){
        
        return  list;
    }
    public String take(){
        return list.remove(0);
    }
}
