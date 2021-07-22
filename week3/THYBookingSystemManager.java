import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * THYBookingSystemManager
 */
public class THYBookingSystemManager extends FlightBookingBase {
    final Scanner scanner = new Scanner(System.in);
    List<String> messageList = new ArrayList<String>() {
        {
            add("TURKIST AIRLINES");
            add("Where do you want to explore?");
            add("Please Select Cabin Class:");
            add("1. Economy Class");
            add("2. Business Class");
        }
    };

    @Override
    public void bookAFlight() {
        String welcomeMessage = messageList.stream().map(Object::toString).collect(Collectors.joining("\n\n"));
        int decision;

        try (scanner) {
            decision = getDecision(welcomeMessage, "([1-2])", scanner);
        }
    }

    public void bookBusinessFlight() {

    }

    public void bookEconomyFlight() {

    }

}