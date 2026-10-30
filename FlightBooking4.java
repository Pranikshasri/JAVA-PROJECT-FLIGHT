
import java.util.Scanner;

// Grandparent class
class Person {
    String passengerName;
    int age;

    void getPersonDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Passenger Name: ");
        passengerName = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();
    }

    void displayPersonDetails() {
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Age: " + age);
    }
}

// Parent class
class Passenger extends Person {
    int passengerId;
    String passportNumber;

    void getPassengerDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Passenger ID: ");
        passengerId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Passport Number: ");
        passportNumber = sc.nextLine();
    }

    void displayPassengerDetails() {
        System.out.println("Passenger ID: " + passengerId);
        System.out.println("Passport Number: " + passportNumber);
    }
}

// Child class
class Flight extends Passenger {
    int ticketId;
    String destination;
    double price;

    void bookTicket() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Ticket ID: ");
        ticketId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Destination: ");
        destination = sc.nextLine();

        System.out.print("Enter Price: ");
        price = sc.nextDouble();
    }

    void displayTicket() {
        System.out.println("\n----- FLIGHT TICKET -----");

        displayPersonDetails();
        displayPassengerDetails();

        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Destination: " + destination);
        System.out.println("Price: Rs." + price);
    }
}

public class FlightBooking4 {
    public static void main(String[] args) {
        Flight f = new Flight();

        f.getPersonDetails();
        f.getPassengerDetails();
        f.bookTicket();
        f.displayTicket();
    }
}
