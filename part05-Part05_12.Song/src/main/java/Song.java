public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
    public boolean equals(Object compared){
        
        if(this == compared){
            return true;
        }
        if(!(compared instanceof Song)){
            return false;
        }
        
        Song newSong=(Song) compared;
        if(this.name.equals(newSong.name)&&
           this.durationInSeconds==newSong.durationInSeconds&&
           this.artist.equals(newSong.artist)){
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
