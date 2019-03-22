import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger passenger;

    @Before
    public void setUp(){
        flight = new Flight(PlaneType.BOEING777, "FR756", Airport.GLA, Airport.LHR, "08:00", 3);
        passenger = new Passenger("Frankie", 1);
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
