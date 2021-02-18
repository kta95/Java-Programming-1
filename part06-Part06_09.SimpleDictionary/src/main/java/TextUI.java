import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simp;
    
    public TextUI(Scanner scan,SimpleDictionary simple){
        this.scanner=scan;
        this.simp=simple;
    }
    
    public void start(){
        while(true){
            System.out.print("Command:");
            String cmd=scanner.nextLine();
            if(cmd.equals("end")){
                break;
            }
            if(cmd.equals("add")){
                System.out.print("Word:");
                String key=scanner.nextLine();
                System.out.print("Translation:");
                String value=scanner.nextLine();
                this.simp.add(key, value);
                continue;
            }
            if(cmd.equals("search")){
                System.out.print("To be translated:");
                String word=scanner.nextLine();
                if(this.simp.translate(word)==null){
                    System.out.println("Word "+word+" was not found");
                    continue;
                }
                System.out.println("Translation:"+this.simp.translate(word));
                
                continue;
            }
            System.out.println("Unknown command");
        }
        System.out.println("Bye bye!");
    }
}











