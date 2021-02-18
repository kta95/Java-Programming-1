import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import sun.tools.java.Environment;

public class UserInterface {
private Scanner scan;
private ArrayList<Recipe>list;
    public UserInterface() {
    }

    public UserInterface(Scanner scan) {
        this.scan = scan;
        this.list = new ArrayList<>();
    }
    
public void start(){
    System.out.print("File to read: ");
    String fname=scan.nextLine();
    System.out.println("Commands:");
    System.out.println("list - lists the recipes");
    System.out.println("stop - stops the program");
    System.out.println("");
    System.out.print("Enter command:");
    while(true){
        String input=scan.nextLine();
        if(input.equals("stop")){
            break;
        }
        if(input.equals("list")){
            System.out.println("Recipes: ");
            try(Scanner scanner = new Scanner(Paths.get(fname))){
                ArrayList<String>l=new ArrayList<>();
                while (scanner.hasNextLine()) {                  
                    String line = scanner.nextLine();
                    //System.out.println(line);
                    l.add(line);                    
                }
                
            }catch(Exception e){
                System.out.println("Error"+e.getMessage());
            }           
        }
        
    }
    
    
}
}
