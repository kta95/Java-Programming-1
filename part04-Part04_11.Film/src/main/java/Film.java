public class Film {
    private String name;
    private int ageRating;
    
    public Film(String initName, int initAgeRating){
        this.name=initName;
        this.ageRating=initAgeRating;
    }
    public String name(){
        return this.name;
    }
    public int ageRating(){
        return this.ageRating;
    }
}
