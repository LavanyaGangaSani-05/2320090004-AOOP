package travelbooking;

public class TravelBookingFacade {
    private FlightBookingService flightService;
    private HotelBookingService hotelService;
    private CarRentalService carRentalService;

    public TravelBookingFacade() {
        this.flightService = new FlightBookingService();
        this.hotelService = new HotelBookingService();
        this.carRentalService = new CarRentalService();
    }

    public String bookTravel(String flightFrom, String flightTo, String flightDate,
                             String hotelCity, String hotelCheckIn, String hotelCheckOut,
                             String carRentalCity, String carRentalFrom, String carRentalTo) {

        String flight = flightService.bookFlight(flightFrom, flightTo, flightDate);
        String hotel = hotelService.bookHotel(hotelCity, hotelCheckIn, hotelCheckOut);
        String carRental = carRentalService.bookCarRental(carRentalCity, carRentalFrom, carRentalTo);

        return flight + "\n" + hotel + "\n" + carRental;
    }
}
