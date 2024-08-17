package travelbooking;

public class HotelBookingService {
    public String bookHotel(String city, String checkIn, String checkOut) {
        return "Hotel in " + city + " from " + checkIn + " to " + checkOut + " booked.";
    }
}
