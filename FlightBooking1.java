
import java.util.Scanner;

class Flight {
    int ticketId;
    String passengerName;
    String source;
    String destination;
    double ticketPrice;

    // Constructor
    Flight(int id, String name, String src,
           String dest, double price) {
        ticketId = id;
        passengerName = name;
        source = src;
        destination = dest;
        ticketPrice = price;
    }

    // Method to display ticket details
    void displayTicket() {
        System.out.println("\n----- FLIGHT TICKET -----");
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Ticket Price: Rs." + ticketPrice);
    }
}

public class FlightBooking1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Ticket ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Source: ");
        String source = sc.nextLine();

        System.out.print("Enter Destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter Ticket Price: ");
        double price = sc.nextDouble();

        // Creating object using constructor
        Flight f1 = new Flight(id, name, source,
                              destination, price);

        f1.displayTicket();

        sc.close();
    }
}
