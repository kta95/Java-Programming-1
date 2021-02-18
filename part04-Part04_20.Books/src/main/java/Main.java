import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        ArrayList<Book>books=new ArrayList<>();
        while(true){
            System.out.print("Title: ");
            String name=scan.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.print("Pages: ");
            String num=scan.nextLine();
            System.out.print("Publication year: ");
            String py=scan.nextLine();
            
            books.add(new Book(name,num,py));
        }
        System.out.print("What information will be printed? ");
        String input=scan.nextLine();
        if(input.equals("everything")){
            for(Book b:books){
                System.out.println(b);
            }
        }else if(input.equals("name")){
            for(Book b:books){
                System.out.println(b.getTitle());
            }
        }
    }
}
