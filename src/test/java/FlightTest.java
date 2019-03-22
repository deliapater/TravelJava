import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;


public class FlightTest {

    private Flight flight;
    private Passenger passenger;
    private Date departureTime;
    private SimpleDateFormat format;

    @Before
    public void setUp() throws ParseException {
            format = new SimpleDateFormat("HH:mm:ss");
            departureTime = format.parse("08:00:00");
        flight = new Flight(PlaneType.BOEING777, "FR756", Airport.GLA, Airport.LHR, departureTime, 3);
        passenger = new Passenger("Frankie", 1);
    }

    @Test
    public void hasFlightNo(){
        assertEquals("FR756", flight.getFlightNo());
    }

    @Test
    public void hasDepertureTime(){
        assertEquals("08:00:00", format.format(flight.getDepatureTime() ));
    }

    @Test
    public void hasDestinationAirport(){
        assertEquals(Airport.GLA, flight.getDestination());
    }

    @Test
    public void hasDepartureAirport(){
        assertEquals(Airport.LHR, flight.getDeparture());
    }

    @Test
    public void startsWithoutPassengers(){
        assertEquals(0, flight.countPassengers());
    }

    @Test
    public void hasAvailableSeats(){
        assertEquals(396, flight.getCapacity());
    }

    @Test
    public void canAddpassenger(){
        flight.addPassenger(passenger);
        assertEquals(1, flight.countPassengers());
    }


    @Test
    public void canBookPassenger(){
        flight.addPassenger(passenger);
        assertEquals(1, flight.countPassengers());
    }

    @Test
    public void cannotBookPassenger(){
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        assertEquals(3, flight.countPassengers());
    }
    
}
