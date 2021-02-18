
import java.util.ArrayList;

public class Room {
    ArrayList<Person> person;
    
    public Room(){
        this.person=new ArrayList<>();
    }
    public void add(Person person){
        this.person.add(person);
    }
    public boolean isEmpty(){
        if(person.isEmpty()){
            return true;
        }
        return false;
    }
    public ArrayList<Person> getPersons(){
//        ArrayList<Person>newp=new ArrayList<>();
//        newp=this.person;
        return this.person;
    }
    public Person shortest(){
        if(this.person.isEmpty()){
            return null;
        }
        Person newp=this.person.get(0);
        for(Person temp: this.person){
            if(newp.getHeight()>temp.getHeight()){
                newp=temp;
            }
        }
        return newp;
    }
    public Person take(){
        if(this.person.isEmpty()){
            return null;
        }
        Person newp=this.shortest();
        
        this.person.remove(this.shortest());
        return newp;
    }
}
