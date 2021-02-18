
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        while(true){
            int input=scanner.nextInt();
            if(input==9999){
                break;
            }
            list.add(input);
        }
        int small=list.get(0);int index=0;
        for(int i=0;i<list.size();i++){
            int number=list.get(i);
            if(small>number){
                small=number; 
            }     
        }
        System.out.println("Smallest number: "+small);
        for(int i=0;i<list.size();i++){
            int number=list.get(i);
            if(number==small){
                index=i;
                 System.out.println("Found at index: "+index);  
             }

        
        }
    }
}
