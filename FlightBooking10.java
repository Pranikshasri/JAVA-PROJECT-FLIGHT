
import java.util.Scanner;

class Flight {
    boolean ticketBooked = false;

    // Synchronized booking method
    synchronized void bookTicket() {
        System.out.println("Booking process started...");

        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }

        ticketBooked = true;

        System.out.println("Ticket booked successfully!");

        // Notify waiting thread
        notify();
    }

    // Synchronized status checking method
    synchronized void checkBooking() {
        System.out.println("Waiting for ticket booking...");

        while (!ticketBooked) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("Booking confirmed!");
        System.out.println("Ticket is ready.");
    }
}

public class FlightBooking10 {
    public static void main(String[] args) {

        Flight f = new Flight();

        // Booking thread
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                f.bookTicket();
            }
        });

        // Checking thread
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                f.checkBooking();
            }
        });

        // Start checking thread first
        t2.start();

        try {
            Thread.sleep(500);
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }

        // Start booking thread
        t1.start();
    }
}
