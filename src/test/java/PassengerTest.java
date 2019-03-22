import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;
    Flight flight;
    private Date departureTime;
    private SimpleDateFormat format;

    @Before
    public void setUp() throws ParseException {
        format = new SimpleDateFormat("HH:mm:ss");
        Date departureTime = format.parse("08:00:00");
        passenger = new Passenger("Grace", 1);
        flight = new Flight(PlaneType.BOEING777, "FR756", Airport.GLA, Airport.LHR, departureTime, 3);

    }

    @Test
    public void hasName(){
        assertEquals("Grace", passenger.getName());
    }

    @Test
    public void hasBags(){
        assertEquals(1, passenger.getNoBags());
    }

    @Test
    public void startsWithNoFlight(){
        assertEquals(null, passenger.getFlight());
    }

    @Test
    public void hasFlight(){
        passenger.setFlight(flight);
        assertEquals(flight, passenger.getFlight());
    }

    @Test
    public void startsWithNoSeats(){
        assertEquals(0, passenger.getSeatNumber());
    }

    @Test
    public void hasSeat(){
        passenger.setSeatNumber(5);
        assertEquals(5 ,passenger.getSeatNumber());
    }
}
