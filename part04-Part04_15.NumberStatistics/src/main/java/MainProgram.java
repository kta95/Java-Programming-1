
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Statistics user = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();

        System.out.println("Enter numbers: ");
        while(true){
            int input=scan.nextInt();
            if(input==-1){
                break;
            }
            if(input%2==0){
                even.addNumber(input);
            }else{
                odd.addNumber(input);
            }
            user.addNumber(input);    
        }
        System.out.println("Sum:"+user.sum());
        System.out.println("Sum of even numbers:"+even.sum());
        System.out.println("Sum of odd numbers:"+odd.sum());
    }
}
