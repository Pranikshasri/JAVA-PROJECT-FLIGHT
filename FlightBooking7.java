
package flightbooking;

import java.util.Scanner;

class Flight {
    int ticketId;
    String passengerName;
    String source;
    String destination;
    double price;

    void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Ticket ID: ");
        ticketId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Passenger Name: ");
        passengerName = sc.nextLine();

        System.out.print("Enter Source: ");
        source = sc.nextLine();

        System.out.print("Enter Destination: ");
        destination = sc.nextLine();

        System.out.print("Enter Ticket Price: ");
        price = sc.nextDouble();
    }

    void displayDetails() {
        System.out.println("\n----- FLIGHT TICKET -----");
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Ticket Price: Rs." + price);
        System.out.println("Booking Status: Confirmed");
    }
}

public class FlightBooking7 {
    public static void main(String[] args) {

        Flight f = new Flight();

        System.out.println("FLIGHT TICKET BOOKING SYSTEM");

        f.getDetails();
        f.displayDetails();
    }
}
