import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
 
    private ArrayList<Bird>birds;
    private Scanner scan;

    public UserInterface( Scanner scan) {
        this.birds = new ArrayList<>();
        this.scan = scan;
    }
    
    public void start(){
        while(true){
            System.out.print("? ");
            String input=scan.nextLine();
            if(input.equals("Quit")){
                break;
            }
            if(input.equals("Add")){
                System.out.print("Name: ");
                String name=scan.nextLine();
                System.out.print("Name in Latin: ");
                String latin=scan.nextLine();
                Bird b=new Bird(name,latin);
                this.birds.add(b);
            }
            if(input.equals("Observation")){
                this.observation(scan);
//                System.out.print("Bird? ");
//                String in=scan.nextLine();
//                for(Bird bird : this.birds){
//                    if(bird.getName().contains(in)){
//                        bird.observed();
//                        System.out.println("This is "+bird.getLatinName());
//                        continue;
//                    }
//                    System.out.println("Not a bird!");
//                }
            }
            if(input.equals("All")){
                for(Bird temp: this.birds){
                    System.out.println(temp);
                }
            }
            if(input.equals("One")){
                System.out.print("Bird? ");
                String bid=scan.nextLine();
                for(Bird temp: this.birds){
                    if(temp.getName().equals(bid)){
                        System.out.println(temp);
                    }
                }
            }
            
        }
    }
     public void observation(Scanner scanner){
        System.out.print("Bird? ");
        String name = scanner.nextLine();
        for(int i=0;i<this.birds.size();i++){
            if(birds.get(i).getName().equals(name)){
                birds.get(i).observed();
            }else if(!birds.get(i).getName().equals(name)){
                System.out.println("Not a bird!");
            }
        }
    }
    
    
}
