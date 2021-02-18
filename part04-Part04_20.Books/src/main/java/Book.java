public class Book {
    private String title;
    private String pages;
    private String publicationYear;
    
    public Book(String t,String p,String py){
        this.title=t;
        this.pages=p;
        this.publicationYear=py;
    }
    public String getTitle(){
        return this.title;
    }
    public String getPages(){
        return this.pages;
    }
    public String getPublicationYear(){
        return this.publicationYear;
    }
    public String toString(){
        return this.title+", "+this.pages+" pages, "+this.publicationYear;
    }
}
