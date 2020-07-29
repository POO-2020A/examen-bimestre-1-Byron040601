
import java.util.Objects;

public class Passenger {

    private String name;
    private String lastName;

    public Passenger(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Passenger)) {
            return false;
        }

        Passenger other = (Passenger) obj;

        if (this.name.equals(other.name)) {
            return true;
        }
        
        if (this.lastName.equals(other.lastName)) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return this.name + " " + this.lastName;
    }
}
