import static java.lang.Math.random;
import java.util.ArrayList;

public class JokeManager {
            
    private ArrayList<String> jokes;

    public JokeManager(){
        this.jokes=new ArrayList<>();
    }
    
    public void addJoke(String joke){
        jokes.add(joke);
    }
    public String drawJoke(){
        if(jokes.isEmpty()){
            return "Jokes are in short supply.";
        }
        
        int min=0;int max=jokes.size()-1;
        
        return jokes.get((int)(Math.random()*((max-min)+1))+min);
        
    }
    public void printJokes(){
        for(String temp: jokes){
            System.out.println(temp);
        }
    }

    void drawJoke(String fjdkajfk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
}
