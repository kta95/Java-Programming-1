
import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<String>list;
    public TodoList(){
        this.list=new ArrayList<>();
    }
    public void add(String task){
        list.add(task);
    }
    public void print(){
        int index=1;
        for(int i=0;i<list.size();i++){
            index=i+1;
            System.out.println(index+": "+list.get(i));
        }
    }
    public void remove(int number){
        int index=1;
        if(number>0){
            index=number-1;
            list.remove(index);
        }
    }
}
