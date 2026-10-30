
import java.util.Scanner;

class Flight {
    private int ticketId;
    private String passengerName;
    private double price;

    static String airlineName = "Air India";
    static int totalBookings = 0;

    Flight(int id, String name, double price) {
        ticketId = id;
        passengerName = name;
        this.price = price;
        totalBookings++;
    }

    // Accessor methods (Getters)
    int getTicketId() {
        return ticketId;
    }

    String getPassengerName() {
        return passengerName;
    }

    double getPrice() {
        return price;
    }

    // Mutator methods (Setters)
    void setPassengerName(String name) {
        passengerName = name;
    }

    void setPrice(double price) {
        this.price = price;
    }

    // Static method
    static void displayTotalBookings() {
        System.out.println("Total Bookings: " + totalBookings);
    }

    // Method overloading
    void displayTicket() {
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Passenger: " + passengerName);
        System.out.println("Price: Rs." + price);
    }

    void displayTicket(String destination) {
        System.out.println("Passenger: " + passengerName);
        System.out.println("Destination: " + destination);
        System.out.println("Price: Rs." + price);
    }

    void displayTicket(String source, String destination) {
        System.out.println("Passenger: " + passengerName);
        System.out.println("Route: " + source + " to " + destination);
        System.out.println("Price: Rs." + price);
    }
}

public class FlightBooking2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Flight f1 = new Flight(101, "Praniksha", 5500);
        Flight f2 = new Flight(102, "Krishitha", 6500);

        System.out.println("Airline: " + Flight.airlineName);

        System.out.println("\nFirst Ticket:");
        f1.displayTicket();

        System.out.println("\nSecond Ticket:");
        f2.displayTicket("Delhi");

        System.out.println("\nRoute Details:");
        f1.displayTicket("Chennai", "Delhi");

        System.out.println("\nUsing Accessor Methods:");
        System.out.println("Ticket ID: " + f1.getTicketId());
        System.out.println("Name: " + f1.getPassengerName());
        System.out.println("Price: " + f1.getPrice());

        Flight.displayTotalBookings();

        sc.close();
    }
}
