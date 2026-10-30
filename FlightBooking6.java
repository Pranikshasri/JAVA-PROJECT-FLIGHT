
import java.util.Scanner;

// Abstract parent class
abstract class Ticket {
    String passengerName;
    int ticketId;

    void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Passenger Name: ");
        passengerName = sc.nextLine();

        System.out.print("Enter Ticket ID: ");
        ticketId = sc.nextInt();
    }

    // Abstract method
    abstract void calculateFare();

    void displayDetails() {
        System.out.println("\n----- TICKET DETAILS -----");
        System.out.println("Passenger: " + passengerName);
        System.out.println("Ticket ID: " + ticketId);
    }
}

// Child class
class Flight extends Ticket {
    double ticketPrice;
    double tax;

    void getFare() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Ticket Price: ");
        ticketPrice = sc.nextDouble();

        System.out.print("Enter Tax: ");
        tax = sc.nextDouble();
    }

    // Implementing abstract method
    void calculateFare() {
        double total = ticketPrice + tax;

        System.out.println("Ticket Price: Rs." + ticketPrice);
        System.out.println("Tax: Rs." + tax);
        System.out.println("Total Fare: Rs." + total);
    }
}

public class FlightBooking6 {
    public static void main(String[] args) {
        Flight f = new Flight();

        f.getDetails();
        f.getFare();

        f.displayDetails();
        f.calculateFare();
    }
}
