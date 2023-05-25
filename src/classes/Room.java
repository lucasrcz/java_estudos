package classes;

public class Room {
    private String code ;
    private int numberOfSeats;

    public void Person(String code , int numberOfSeats){
        this.code = code ;
        this.numberOfSeats = numberOfSeats ;
    }

    @Override
    public String toString(){
        return code + numberOfSeats;
    }
}
