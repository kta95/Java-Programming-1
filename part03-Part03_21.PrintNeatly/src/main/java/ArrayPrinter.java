
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
       // System.out.println(array[0]+", "+array[1]+", "+array[2]+", "+array[3]+", "+array[4]);   
       int index=0;
       while(index<array.length){   
           if(index!=0){
               System.out.print(", ");
           }
           int number=array[index];
           System.out.print(number);
           index++;
           
       }
    }
}
