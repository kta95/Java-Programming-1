
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times=1;
        System.out.println("How many times?");
        int input=scanner.nextInt();
        while(times<=input){
            printText();
            times++;
        }
    }
    
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
