import java.util.Scanner;
public class UserInterface {
     private Container first;
     private Container second;
    private Scanner scanner;
    
    public UserInterface(Container f,Container s,Scanner scanner){
        this.first=f;
        this.second=s;
        this.scanner=scanner;       
    }
    
    public void start(){
        while (true) {
            
            System.out.println("First: "+first.contains()+"/100");
            System.out.println("Second: "+second.contains()+"/100");

            String input = scanner.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if(command.equals("add")){
                first.add(amount);
                System.out.println("");
                continue;
            }
            if(command.equals("remove")){
                second.remove(amount);
                System.out.println("");
                continue;
            }
            if(command.equals("move")){
                //if(first.contains()!=0){
                    int size=amount-first.contains();
                    int re=amount-size;
                    first.remove(amount);
                
                    if(first.contains()>0){
                       second.add(amount);
                        System.out.println("");
                        continue; 
                    }else {
                        second.add(re);
                        continue;
                    }
               // }
            }

        }
    }
}
