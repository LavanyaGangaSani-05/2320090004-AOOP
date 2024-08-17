package travelbooking;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class TravelBookingFacadeTest {

    private TravelBookingFacade facade;

    @Before
    public void setUp() {
        facade = new TravelBookingFacade();
    }

    @Test
    public void testCompleteBooking() {
        String expectedOutput = "Flight from New York to Los Angeles on 2024-12-01 booked.\n" +
                                "Hotel in Los Angeles from 2024-12-01 to 2024-12-05 booked.\n" +
                                "Car rental in Los Angeles from 2024-12-01 to 2024-12-05 confirmed.";

        String actualOutput = facade.bookTravel(
            "New York", "Los Angeles", "2024-12-01", 
            "Los Angeles", "2024-12-01", "2024-12-05", 
            "Los Angeles", "2024-12-01", "2024-12-05"
        );

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testDifferentDatesForServices() {
        String expectedOutput = "Flight from New York to Los Angeles on 2024-12-01 booked.\n" +
                                "Hotel in Los Angeles from 2024-12-02 to 2024-12-06 booked.\n" +
                                "Car rental in Los Angeles from 2024-12-02 to 2024-12-06 confirmed.";

        String actualOutput = facade.bookTravel(
            "New York", "Los Angeles", "2024-12-01", 
            "Los Angeles", "2024-12-02", "2024-12-06", 
            "Los Angeles", "2024-12-02", "2024-12-06"
        );

        assertEquals(expectedOutput, actualOutput);
    }
}
