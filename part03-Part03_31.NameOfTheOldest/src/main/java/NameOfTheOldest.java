
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max=0;int big=0;String name = null;
        while(true){
            String input=scanner.nextLine();
            if(input.equals("")){
                break;
            }
            
            String[]piece=input.split(",");
            max=Integer.valueOf(piece[1]);
            if(max>big){
                big=max;
                name=piece[0];
            }
            
        }
        System.out.println("Name of the oldest: "+name);

    }
}
