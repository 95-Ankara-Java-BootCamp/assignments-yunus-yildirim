import java.util.*;
import java.util.stream.IntStream;

public abstract class FlightBookingBase {
    final int MIN_SEATING_CAPACITY = 10;
    final int BUSINESS_SEAT_CAPACITY = 5;
    final int ECONOMY_START_FROM = 5;

    private int seatingCapacity;
    private boolean[] seats;

    // will be edited!!!!
    public FlightBookingBase() {
        // set seating capacity based on doc
        this.setSeatingCapacity(MIN_SEATING_CAPACITY);
        // inıt seats
        initSeats();
    }

    // will be edited!!!!
    public FlightBookingBase(int seatingCapacity) {
        // set seating capacity based on doc
        this.setSeatingCapacity(seatingCapacity);
        // init seats
        initSeats();
    }

    public void initSeats() {
        // Init array of seats by seating capacity
        this.seats = new boolean[this.seatingCapacity];
        // Fill array of seats with false means free
        Arrays.fill(this.seats, false);
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity < MIN_SEATING_CAPACITY ? MIN_SEATING_CAPACITY : seatingCapacity;
    }

    public int getSeatingCapacity() {
        return this.seatingCapacity;
    }

    public boolean isAirlinerFull() {
        boolean isFull = IntStream.range(0, this.seatingCapacity).allMatch(i -> seats[i]);
        return isFull;
    }

    public boolean isEconomyFull() {
        boolean isFull = IntStream.range(0, BUSINESS_SEAT_CAPACITY).allMatch(i -> seats[i]);
        return isFull;
    }

    public boolean isBusinessFull() {
        boolean isFull = IntStream.range(ECONOMY_START_FROM, this.seatingCapacity).allMatch(i -> seats[i]);
        return isFull;
    }

    public int getDecision(String message, String interval, Scanner scanner) {
        System.out.print(message);

        while (!scanner.hasNextInt() || !scanner.hasNext(interval)) {
            System.out.println("Entered value must be a number or valid");
            System.out.print(message);
            scanner.next();
        }

        return scanner.nextInt();
    }

    public abstract void bookAFlight();
}
