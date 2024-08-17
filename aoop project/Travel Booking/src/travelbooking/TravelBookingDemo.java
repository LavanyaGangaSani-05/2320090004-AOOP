package travelbooking;

public class TravelBookingDemo {
    public static void main(String[] args) {
        TravelBookingFacade bookingFacade = new TravelBookingFacade();

        String bookingDetails = bookingFacade.bookTravel(
            "New York", "Los Angeles", "2024-12-01", 
            "Los Angeles", "2024-12-01", "2024-12-05", 
            "Los Angeles", "2024-12-01", "2024-12-05"
        );

        System.out.println(bookingDetails);
    }
}
