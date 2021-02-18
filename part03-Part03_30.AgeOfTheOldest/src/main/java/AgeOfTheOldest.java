
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max=0;int big=0;
        while(true){
            String input=scanner.nextLine();
            if(input.isEmpty()){
                break;
            }
            
            String[]piece=input.split(",");
            max=Integer.valueOf(piece[1]);
            if(max>big){
                big=max;
            }
            
        }
        System.out.println("Age of the oldest: "+big);
    }
}
