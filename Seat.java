
import java.util.ArrayList;

public class Seat {

    private int row;
    private String col;
    private Passenger pasengger;

    public Seat(int row, String col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public String getCol() {
        return col;
    }

    public Passenger getPasengger() {
        return pasengger;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public void setPasengger(Passenger pasengger) {
        this.pasengger = pasengger;
    }

    public boolean isFree() {
        if (this.pasengger == null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Seat other = (Seat) obj;
        if (this.row == other.row) {
            return true;
        }
        if (this.col == other.col) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        if (this.isFree()) {
            return "Asiento: " + this.row + this.col + ", libre.";
        }
        return "Asiento: " + this.row + this.col + ", ocupado. Pasajero: " + this.pasengger.getName() + " " +  this.pasengger.getLastName();
    }

}
