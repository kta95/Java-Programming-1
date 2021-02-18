
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container con=new Container();
        Container con1=new Container();
        
        UserInterface ui=new UserInterface(con,con1, scan);
        ui.start();


        
    }

}
