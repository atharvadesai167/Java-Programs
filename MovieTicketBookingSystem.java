import java.util.ArrayList;
import java.util.Scanner;

// Custom Exception
class SeatBookingException extends Exception {

    SeatBookingException(String message) {
        super(message);
    }
}

// BookingSystem class
class BookingSystem {

    static int availableSeats = 10;

    void login(String user) {
        System.out.println(user + " logged in.");
    }

    void selectTheatre(String user) {
        System.out.println(user + " selected PVR Theatre.");
    }

    void selectMovie(String user) {
        System.out.println(user + " selected Avengers movie.");
    }

    void selectShow(String user) {
        System.out.println(user + " selected 7:00 PM show.");
    }

    synchronized void chooseSeat(String user, int seats)
            throws SeatBookingException {

        if (seats <= availableSeats) {
            System.out.println(user + " is booking " + seats + " seat(s).");

            availableSeats = availableSeats - seats;

            System.out.println("Seats booked successfully for " + user);
            System.out.println("Remaining seats: " + availableSeats);
        } else {
            throw new SeatBookingException(
                    "Sorry " + user + "! Only " + availableSeats
                    + " seat(s) are available."
            );
        }
    }

    void makePayment(String user) {
        System.out.println(user + " completed payment.");
    }

    void displayTicket(String user, int seats) {
        System.out.println("--------------------------------");
        System.out.println("       MOVIE TICKET");
        System.out.println("User  : " + user);
        System.out.println("Movie : Avengers");
        System.out.println("Seats : " + seats);
        System.out.println("Show  : 7:00 PM");
        System.out.println("Status: BOOKED");
        System.out.println("--------------------------------");
    }
}


// Thread class
class BookingThread extends Thread {

    String user;
    int seats;
    BookingSystem bookingSystem;

    BookingThread(String user, int seats, BookingSystem bookingSystem) {
        this.user = user;
        this.seats = seats;
        this.bookingSystem = bookingSystem;
    }

    public void run() {

        try {
            bookingSystem.login(user);
            bookingSystem.selectTheatre(user);
            bookingSystem.selectMovie(user);
            bookingSystem.selectShow(user);

            bookingSystem.chooseSeat(user, seats);

            bookingSystem.makePayment(user);
            bookingSystem.displayTicket(user, seats);

        } catch (SeatBookingException e) {
            System.out.println("Booking Failed: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
    }
}


// Runnable interface
class BookingRunnable implements Runnable {

    String user;
    int seats;
    BookingSystem bookingSystem;

    BookingRunnable(String user, int seats, BookingSystem bookingSystem) {
        this.user = user;
        this.seats = seats;
        this.bookingSystem = bookingSystem;
    }

    public void run() {

        try {
            bookingSystem.login(user);
            bookingSystem.selectTheatre(user);
            bookingSystem.selectMovie(user);
            bookingSystem.selectShow(user);

            bookingSystem.chooseSeat(user, seats);

            bookingSystem.makePayment(user);
            bookingSystem.displayTicket(user, seats);

        } catch (SeatBookingException e) {
            System.out.println("Booking Failed: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
    }
}


// Main class
public class MovieTicketBookingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BookingSystem bookingSystem = new BookingSystem();

        ArrayList<Thread> threads = new ArrayList<>();

        try {

            System.out.print("Enter number of users: ");
            int numberOfUsers = sc.nextInt();

            System.out.print("Enter seats required by every user: ");
            int seats = sc.nextInt();

            // Check if required seats exceed available seats
            if (seats > BookingSystem.availableSeats) {
                throw new SeatBookingException(
                        "Required seats (" + seats +
                        ") are more than available seats (" +
                        BookingSystem.availableSeats + ")."
                );
            }

            // Create separate thread for every user
            for (int i = 1; i <= numberOfUsers; i++) {

                String user = "User" + i;

                Thread thread;

                // Some threads using Thread class
                if (i % 2 == 0) {
                    thread = new BookingThread(
                            user,
                            seats,
                            bookingSystem
                    );
                }

                // Other threads using Runnable interface
                else {
                    thread = new Thread(
                            new BookingRunnable(
                                    user,
                                    seats,
                                    bookingSystem
                            )
                    );
                }

                threads.add(thread);
            }

            // Start all threads
            System.out.println("\n===== Booking Started =====\n");

            for (Thread thread : threads) {
                thread.start();
            }

            // Wait for all threads to finish
            for (Thread thread : threads) {
                thread.join();
            }

            System.out.println("\n===== Booking Completed =====");
            System.out.println(
                    "Final Available Seats: "
                    + BookingSystem.availableSeats
            );

        } catch (SeatBookingException e) {

            System.out.println("Booking Error: " + e.getMessage());

        } catch (InterruptedException e) {

            System.out.println("Thread was interrupted: "
                    + e.getMessage());

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            sc.close();
            System.out.println("Program execution completed.");

        }
    }
}