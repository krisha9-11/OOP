public class CinemaShow {

    private String title;
    private int seatsAvailable;
    private final int capacity;
    private static int totalBooked = 0;

    CinemaShow(String title, int capacity) {
        this.title = title;
        this.capacity = capacity;
        seatsAvailable = capacity;
    }

    CinemaShow(String title) {
        this(title, 100);
    }

    boolean book(int n) {
        if (n <= seatsAvailable) {
            seatsAvailable -= n;
            totalBooked += n;
            return true;
        }
        return false;
    }

    void cancel(int n) {
        seatsAvailable += n;

        if (seatsAvailable > capacity)
            seatsAvailable = capacity;
    }

    int getSeatsAvailable() {
        return seatsAvailable;
    }

    static int getTotalBooked() {
        return totalBooked;
    }

    public static void main(String[] args) {

        CinemaShow show = new CinemaShow("Avengers", 50);

        System.out.println("Book 10: " + show.book(10));
        System.out.println("Seats: " + show.getSeatsAvailable());

        System.out.println("Book 45: " + show.book(45));
        System.out.println("Seats: " + show.getSeatsAvailable());

        show.cancel(5);
        System.out.println("After cancel: " + show.getSeatsAvailable());

        System.out.println("Total booked: " + getTotalBooked());
    }
}