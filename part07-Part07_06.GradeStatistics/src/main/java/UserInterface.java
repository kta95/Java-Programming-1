
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Course point;
    private Course point2;
    private Scanner scanner;
   private GradeRegister register;

    public UserInterface(Course point, Course point2, Scanner scanner, GradeRegister register) {
        this.point = point;
        this.point2 = point2;
        this.scanner = scanner;
        this.register = register;
    }
   
    public void start(){
        System.out.println("Enter point totals, -1 stops:");
        while(true){
            int input=Integer.parseInt(scanner.nextLine());
            if(input==-1){
                break;
            }
            if(input >= 50){
                point2.add(input);             
            }
            point.add(input);//3 48 93 0 67 24 78 53 -1 
            if(input>=0 && input<=100){
                this.register.addGradeBasedOnPoints(input);
            }
        }
        
        double avg=1.0*point.contain()/point.count();
        String pavg;
        double passing=1.0*point2.contain()/point2.count();
        if(point2.count()==0){
             pavg="-";
        }else{
             pavg=Double.toString(passing);
        }
        double pp=100.0*point2.count()/point.count();
        System.out.println("Point average (all): "+avg);
        System.out.println("Point average (passing): "+pavg);
        if(point2.count()>0){
            System.out.println("Pass percentage: "+pp);
        }else{
            System.out.println("Pass percentage: "+0.0);
        }
        System.out.println("Grade distribution:");
        printGradeDistribution();

                   
    }
 
    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
    }

    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
     
    }
    
    
}
