
import java.util.Scanner;

// User-defined exception
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class Flight {
    int ticketId;
    String passengerName;
    int age;
    double price;

    void bookTicket(int id, String name,
                    int passengerAge, double fare)
                    throws InvalidAgeException {

        if (passengerAge < 18) {
            throw new InvalidAgeException(
                "Passenger must be 18 or above to book this ticket."
            );
        }

        ticketId = id;
        passengerName = name;
        age = passengerAge;
        price = fare;

        System.out.println("\nTicket Booked Successfully!");
    }

    void displayTicket() {
        System.out.println("\n----- FLIGHT TICKET -----");
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Passenger: " + passengerName);
        System.out.println("Age: " + age);
        System.out.println("Price: Rs." + price);
    }
}

public class FlightBooking8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Flight f = new Flight();

        try {
            System.out.print("Enter Ticket ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Passenger Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Ticket Price: ");
            double price = sc.nextDouble();

            f.bookTicket(id, name, age, price);

            f.displayTicket();
        }

        catch (InvalidAgeException e) {
            System.out.println("Booking Failed: " + e.getMessage());
        }

        catch (Exception e) {
            System.out.println("Invalid Input!");
        }

        finally {
            System.out.println("Thank You for Using Flight Booking System.");
            sc.close();
        }
    }
}
