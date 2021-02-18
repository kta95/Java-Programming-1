
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      Container con=new Container();
      Container con2=new Container();

      UserInterface ui=new UserInterface(con, con2, scan);
      ui.start();
    }
}