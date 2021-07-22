import java.util.*;
import java.util.stream.IntStream;

public abstract class FlightBookingBase implements FlightBookingService {
    private int seatingCapacity;
    private boolean[] seats;

    public FlightBookingBase() {
        initSeats();
    }

    public FlightBookingBase(int seatingCapacity) {
        // Set seating capacity based on doc
        this.setSeatingCapacity(seatingCapacity);
        initSeats();
    }

    public void initSeats() {
        // Init array of seats by seating capacity
        this.seats = new boolean[this.seatingCapacity];
        // Fill array of seats with true means free
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

    public abstract void bookSeat();
}
