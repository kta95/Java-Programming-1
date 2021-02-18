
import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList list,Scanner scan){
        this.todoList=list;
        this.scanner=scan;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String input=scanner.nextLine();
            if(input.equals("stop")){
                break;
            }
            if(input.equals("add")){
                System.out.print("To add: ");
                String addt=scanner.nextLine();
                todoList.add(addt);
                continue;
            }
            if(input.equals("list")){
                todoList.print();
                continue;
            }
            if(input.equals("remove")){
                System.out.print("Which one is removed? ");
                int ret=Integer.valueOf(scanner.nextLine());
                todoList.remove(ret);
            }
            
        }
        
        
    }
    
    
}
