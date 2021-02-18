
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         while(true){
            String input=scanner.nextLine();
            String[]word=input.split(" ");
            if(input.isEmpty()){
                break;
            }else{
                int last=word.length-1;
            System.out.println(word[last]);
            }
        }

    }
}
