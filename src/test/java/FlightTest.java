import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;

    @Before
    public void setUp(){
        flight = new Flight(PlaneType.BOEING777, "FR756", Airport.GLA, Airport.LHR, "08:00");
    }

    @Test
    public void hasFlightNo(){
        assertEquals("FR756", flight.getFlightNo());
    }

    @Test
    public void hasDepertureTime(){
        assertEquals("08:00", flight.getDepatureTime());
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
        assertEquals(396, flight.getPlaneType().getCapacity());
    }
}
