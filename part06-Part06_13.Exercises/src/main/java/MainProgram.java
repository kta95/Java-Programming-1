
public class MainProgram {

    // update here your exercise progress
//    public static int partsCompleted() {
//        return -1;
//    }
//    
    public static void main(String [] args){
        Exercise ex=new Exercise("java");
        ExerciseManagement em=new ExerciseManagement();
        em.add("java");
        em.isCompleted("java");
        em.markAsCompleted("java");
        System.out.println(em.exerciseList()); 

    }
}
