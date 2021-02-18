
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Course p=new Course();
        Course p2=new Course();
        GradeRegister register = new GradeRegister();
        
        UserInterface ui=new UserInterface(p,p2, scanner,register);
        ui.start();
    }
}
