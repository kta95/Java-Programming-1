
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalnum = 0;
        while(true){
            System.out.println("Give a number:");
            int input=Integer.valueOf(scanner.nextLine());
            if(input==0){
                break;
            }else{
                totalnum=totalnum+1;
                continue;
            }
            
        }
        System.out.println("Number of numbers: "+totalnum);
    }
}
