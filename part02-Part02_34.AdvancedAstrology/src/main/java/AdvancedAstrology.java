
public class AdvancedAstrology {

    public static void printStars(int number) {
        int i=0;
        while(i<number){
            System.out.print("*");
            i++;
        }
        System.out.println();   
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int i=1;
        while(i<=number){
            System.out.print(" ");
            i++;
        }
      
    }

    public static void printTriangle(int size) {
        int i=1;int j=size;
        while(i<=size){
            printSpaces(j);
            printStars(i);
            i++;j--;
        }
    }

    public static void christmasTree(int height) {
        int i=1;int j=height; int k=1;int base=height-1;int n=0;
        while(i<=height){
            printSpaces(j);
            printStars(k);
            i++;j--;k=k+2;          
        }
        
        printSpaces(base);
        printStars(3);
        printSpaces(base);
        printStars(3);
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(3);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
