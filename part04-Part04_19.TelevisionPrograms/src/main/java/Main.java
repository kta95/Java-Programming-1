import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.print("Name: ");
            String input=scanner.nextLine();
            if(input.isEmpty()){
                break;
            }
            System.out.print("Duration: ");
            int input2=Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(input,input2));
        }
        System.out.print("Program's maximum duration? ");
        int min=scanner.nextInt();
        for(TelevisionProgram tp:programs){
            if(tp.getDuration()<=min){
                System.out.println(tp);
            }
        }
    }
}
