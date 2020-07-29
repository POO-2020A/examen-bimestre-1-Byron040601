
import java.util.ArrayList;

public class Plane {

    private ArrayList<Seat> seats;
    private int rows;
    private int cols; 
    
    public Plane(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        //this.seats.add(new Seat(this.rows, ""));
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    @Override
    public String toString() {

       return "s";
    }

}
