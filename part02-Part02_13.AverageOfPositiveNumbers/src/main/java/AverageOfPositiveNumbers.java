
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pcount=0;
        int sum=0;
        while(true){
            int input=scanner.nextInt();
            if(input==0){
                break;
            }else if(input>0){
                pcount+=1;
                sum+=input;
                continue;
            }else{
                continue;
            }
        }
        if(pcount==0){
            System.out.println("Cannot calculate the average");
        }else{
            double result=1.0*sum/pcount;
            System.out.println(result);
        }
    }
}
