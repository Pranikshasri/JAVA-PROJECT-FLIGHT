
import java.util.Scanner;

// Implementing Runnable interface
class FlightBooking implements Runnable {
    String passengerName;
    int ticketId;

    FlightBooking(String name, int id) {
        passengerName = name;
        ticketId = id;
    }

    // Thread execution method
    public void run() {
        System.out.println("\nBooking Started...");
        System.out.println("Passenger: " + passengerName);
        System.out.println("Ticket ID: " + ticketId);

        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Ticket Booked Successfully for "
                           + passengerName);
    }
}

public class FlightBooking9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Passenger Name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter First Ticket ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Second Passenger Name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter Second Ticket ID: ");
        int id2 = sc.nextInt();

        // Creating Runnable objects
        FlightBooking b1 = new FlightBooking(name1, id1);
        FlightBooking b2 = new FlightBooking(name2, id2);

        // Creating threads
        Thread t1 = new Thread(b1);
        Thread t2 = new Thread(b2);

        // Starting threads
        t1.start();
        t2.start();

        sc.close();
    }
}
