
import java.util.Scanner;

// Parent class
class Passenger {
    String passengerName;
    int age;

    void getPassengerDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Passenger Name: ");
        passengerName = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();
    }

    void displayPassengerDetails() {
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Age: " + age);
    }
}

// Child class
class Flight extends Passenger {
    int ticketId;
    String source;
    String destination;
    double price;

    void bookTicket() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Ticket ID: ");
        ticketId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Source: ");
        source = sc.nextLine();

        System.out.print("Enter Destination: ");
        destination = sc.nextLine();

        System.out.print("Enter Ticket Price: ");
        price = sc.nextDouble();
    }

    void displayTicket() {
        System.out.println("\n----- FLIGHT TICKET -----");

        displayPassengerDetails();

        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Price: Rs." + price);
    }
}

public class FlightBooking3 {
    public static void main(String[] args) {
        Flight f = new Flight();

        f.getPassengerDetails();
        f.bookTicket();
        f.displayTicket();
    }
}
