
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String>list=new ArrayList<>();
        System.out.println("File:");
        String file=scan.nextLine();
        System.out.println("Team:");
        String team=scan.nextLine();
        int game=0;int win=0;int lose=0;
        try(Scanner n=new Scanner(Paths.get(file))){
            while(n.hasNextLine()){
                String haa=n.nextLine();
                String[] ja=haa.split(",");
                String name1=ja[0];
                String name2=ja[1];
                int score1=Integer.valueOf(ja[2]);
                int score2=Integer.valueOf(ja[3]);
                if(name1.equals(team)){
                    if(score1>score2){
                        win++;
                    }else{
                        lose++;
                    }
                    game++;
                }else if(name2.equals(team)){
                    if(score2>score1){
                        win++;
                    }else{
                        lose++;
                    }
                    game++;
                }

            }
        }catch(Exception e){
            
        }
        
        System.out.println("Games: "+game);
        System.out.println("Wins: "+win);
        System.out.println("Losses: "+lose);
    }

}
