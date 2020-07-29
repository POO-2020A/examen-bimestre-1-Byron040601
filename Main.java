
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Seat seat = new Seat(20, "");
        
        UserInterface ui = new UserInterface(scanner);
        
        ui.start();
    }

}
