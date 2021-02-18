
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        if(this.rooms>compared.rooms){
            return true;
        }
        if(this.rooms<compared.rooms){
            return false;
        }
        if(this.squares>compared.squares){
            return true;
        }
        if(this.squares<compared.squares){
            return false;
        }
        if(this.princePerSquare>compared.princePerSquare){
            return true;
        }
        return false;
    }
    public int priceDifference(Apartment compared){
        int fp=this.squares*this.princePerSquare;
        int sp=compared.squares*compared.princePerSquare;
        int result;
        if(fp>sp){
            result=fp-sp;
        }else{
            result=sp-fp;
        }
        return result;
    }
    public boolean moreExpensiveThan(Apartment compared){
        if(this.princePerSquare>compared.princePerSquare){
            return true;
        }else
            return false;
    }
}
