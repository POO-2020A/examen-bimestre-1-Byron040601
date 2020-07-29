
import java.util.Scanner;

public class UserInterface {

    private Seat seat;
    private Passenger passenger;
    private Plane plane;
    private Scanner scanner;

    private int filas;
    private int columnas;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.plane = new Plane(this.filas, this.columnas);
    }

    public void start() {

        System.out.println("Ingrese la cantidad de filas: ");
        this.filas = Integer.valueOf(this.scanner.nextLine());
        //this.plane.setRows(this.filas);
        System.out.println("Ingrese la cantidad de columnas: ");
        this.columnas = Integer.valueOf(this.scanner.nextLine());
        //this.plane.setRows(this.columnas);

        Plane plane = new Plane(this.filas, this.columnas);
        while (true) {

            System.out.println("Este es el mapa del avion");
            System.out.println("");

            System.out.println("¿Que desea hacer?");
            System.out.println("1. Ingresar pasajero");
            System.out.println("2. Consultar asiento");
            System.out.println("3. Consultar pasajero");

            System.out.println("");
            System.out.print("Ingrese la opcion: ");
            int des = Integer.valueOf(this.scanner.nextLine());
            System.out.println("");

            if (des == 1) {
                System.out.println("Ingresar un pasajero:");
                System.out.print("Ingrese el nombre del pasajero: ");
                String name = this.scanner.nextLine();
                //this.passenger.setName(name);
                System.out.print("Ingrese el apellido del pasajero: ");
                String lastName = this.scanner.nextLine();
                //this.passenger.setLastName(lastName);

                Passenger pas = new Passenger(name, lastName);

                System.out.print("Ingrese la fila del asiento: ");
                int fila = Integer.valueOf(this.scanner.nextLine());
                //this.seat.setRow(fila);
                System.out.print("Ingrese la columna del asiento: ");
                String columna = this.scanner.nextLine();
                //this.seat.setCol(columna);

                Seat seat = new Seat(fila, columna);
                
                
                System.out.println("");
                System.out.println("¡Pasajero ingresado!");
                System.out.println("");
            }
            
            
        }
    }
}
