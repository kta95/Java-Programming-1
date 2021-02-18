
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String input=scanner.nextLine();
            String[]word=input.split(" ");
            if(input.isEmpty()){
                break;
            }else{
            System.out.println(word[0]);
            }
        }
    }
}
