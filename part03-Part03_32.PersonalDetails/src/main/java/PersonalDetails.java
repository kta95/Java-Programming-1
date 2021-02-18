
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int big=0;
        int sum=0;
        int count=0;
        String lname=null;
        while(true){
            String input=scanner.nextLine();
            if(input.isEmpty()){
                break;
            }
            String[] text=input.split(",");
            int name=text[0].length();
            if(name>big){
                big=name;
                lname=text[0];
            }
            sum=sum+Integer.valueOf(text[1]);
            count=count+1;
            }
        double avg=1.0*sum/count;   
        System.out.println("Longest name: "+lname);
        System.out.println("Average of the birth years: "+avg);
    }
}
