
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        int max=list.get(0);
        for(int i=0;i<list.size();i++){  
           if(list.get(i)>=max)
               max=list.get(i);
               
        }
           System.out.print("The greatest number: ");
           System.out.print(max);
      
    }   
    
}

