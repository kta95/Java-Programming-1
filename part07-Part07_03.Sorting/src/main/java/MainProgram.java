
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static int indexOfSmallest(int[] array){
        int i=smallest(array);
        int index=0;
        for(int j=0;j<array.length;j++){
            if(i==array[j]){
                index=j;
            }
        }
        return index;
    }
    
    public static int smallest(int[] array){      
        int i=array[0];
        for(int temp: array){
            if(i>temp){
                i=temp;
            }
        }
        return i;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int is=table[startIndex];
        for(int i=startIndex;i<table.length;i++){
            if(is>table[i]){
                is=table[i];
            }
        } 
        int index=0;
        for(int j=0;j<table.length;j++){
            if(is==table[j]){
                index=j;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2){
        int temp=0;
        
        temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;      
        
    }
    
    public static void sort(int[] array){
        System.out.println(Arrays.toString(array)); 
        int i=0;
        while(i<array.length){
            int j=indexOfSmallestFrom(array, i);
            if(array[i]>array[j]){
                swap(array, i, j);
                System.out.println(Arrays.toString(array));
            }
            i++;
        }
        System.out.println(Arrays.toString(array));

               
        
    }


    
}
