
import java.util.Scanner;

// Parent class
class Ticket {
    int ticketId;
    String passengerName;

    void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Ticket ID: ");
        ticketId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Passenger Name: ");
        passengerName = sc.nextLine();
    }

    void display() {
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Passenger Name: " + passengerName);
    }
}

// Child class
class Flight extends Ticket {
    String source;
    String destination;
    double price;

    void bookTicket() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Source: ");
        source = sc.nextLine();

        System.out.print("Enter Destination: ");
        destination = sc.nextLine();

        System.out.print("Enter Price: ");
        price = sc.nextDouble();
    }

    // Method overloading
    void calculateFare() {
        System.out.println("Basic Fare: Rs." + price);
    }

    void calculateFare(double tax) {
        double total = price + tax;
        System.out.println("Fare with Tax: Rs." + total);
    }

    void calculateFare(double tax, double discount) {
        double total = price + tax - discount;
        System.out.println("Final Fare: Rs." + total);
    }

    void displayFlight() {
        display();

        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);

        calculateFare();
        calculateFare(500);
        calculateFare(500, 300);
    }
}

public class FlightBooking5 {
    public static void main(String[] args) {
        Flight f = new Flight();

        f.getDetails();
        f.bookTicket();

        System.out.println("\n----- TICKET DETAILS -----");
        f.displayFlight();
    }
}
