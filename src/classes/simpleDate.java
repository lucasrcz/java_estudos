package classes;

public class simpleDate {
    private int day;
    private int month;
    private int year;

    public simpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public boolean maisVelho(simpleDate comparado){
        if(this.year < comparado.year){
            return false;
        }
        
        if(this.year > comparado.year){
            return true;
        }

        if(this.month < comparado.month){
            return false;
        }

        if(this.month >  comparado.month){
            return true;
        }

        if(this.day < comparado.day){
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }


    public boolean equals(simpleDate simpleDate){
        if(this.day == simpleDate.day &&
           this.month == simpleDate.month &&
           this.year == simpleDate.year){
            
            return true;
        }else{
            
            return false;
        }
    }

    @Override
    public int hashCode(){
        return this.day * 11 * this.month * 7 * this.year ;
    }

}