
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String input=scanner.nextLine();
            String[] ha=input.split(" ");
        
            for(int i=0;i<ha.length;i++){
                if(input.isEmpty()){
                return;
                }else if(ha[i].contains("av")){
                    System.out.println(ha[i]);
                }
                
            }
        }
    }
}