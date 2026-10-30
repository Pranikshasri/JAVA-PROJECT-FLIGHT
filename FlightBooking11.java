
import java.util.Scanner;

class FlightBooking extends Thread {
    String passengerName;
    int ticketId;

    FlightBooking(String name, int id) {
        passengerName = name;
        ticketId = id;
    }

    public void run() {
        System.out.println("\nBooking Started");
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        System.out.println("Thread Priority: " + Thread.currentThread().getPriority());

        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Ticket Booked Successfully for "
                           + passengerName);
    }
}

public class FlightBooking11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Passenger Name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter Second Passenger Name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter Third Passenger Name: ");
        String name3 = sc.nextLine();

        // Creating threads
        FlightBooking t1 = new FlightBooking(name1, 101);
        FlightBooking t2 = new FlightBooking(name2, 102);
        FlightBooking t3 = new FlightBooking(name3, 103);

        // Setting thread names
        t1.setName("VIP Booking");
        t2.setName("Normal Booking");
        t3.setName("General Booking");

        // Setting thread priorities
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        System.out.println("\n----- THREAD PRIORITIES -----");

        System.out.println(t1.getName() + ": "
                           + t1.getPriority());

        System.out.println(t2.getName() + ": "
                           + t2.getPriority());

        System.out.println(t3.getName() + ": "
                           + t3.getPriority());

        // Starting threads
        t1.start();
        t2.start();
        t3.start();

        sc.close();
    }
}
